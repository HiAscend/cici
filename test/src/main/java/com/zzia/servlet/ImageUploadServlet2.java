package com.zzia.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by adeng on 2016/8/13.
 */
@WebServlet(urlPatterns = "/ImageUploadServlet2")
public class ImageUploadServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //为解析类提供配置信息
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //创建解析类的实例
        ServletFileUpload sfu = new ServletFileUpload(factory);
        //开始解析
        sfu.setFileSizeMax(1024*400);
        //每个表单域中数据会封装到一个对应的FileItem对象上

        try {
            List<FileItem> fileItemList = sfu.parseRequest(req);
            //区分表单域
            for (int i = 0; i < fileItemList.size(); i++) {
                FileItem fileItem = fileItemList.get(i);
                //fileItem.isFormField()为true说明这不是文件上传表单域
                if(!fileItem.isFormField()){
                    ServletContext context = getServletContext();
                    //获得存放文件的物理路径
                    //upload下的某个文件夹   得到当前在线的用户  找到对应的文件夹
                    String path = context.getRealPath("/");
                    System.out.println(path.lastIndexOf(File.separator+"test"));
                    path = path.substring(0,path.lastIndexOf(File.separator+"test"))+File.separator+"image";
                    System.out.println("path = " + path);
                    //获得文件名
                    String fileName = fileItem.getName();
                    System.out.println("fileName = " + fileName);
                    //该方法在某些平台(操作系统),会返回路径+文件名
                    fileName = fileName.substring(fileName.lastIndexOf("/")+1);

                    //创建文件
                    File file = new File(path+File.separator+fileName);
                    //判断目标文件所在目录是否存在
                    if(!file.getParentFile().exists()){
                        if(!file.getParentFile().mkdirs()){
                            System.out.println("创建目标文件所在目录失败！");
                            return;
                        }
                    }
                    if(!file.exists()){
                        fileItem.write(file);
                    }

                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.getRequestDispatcher("detail.html").forward(req,resp);
    }
}
