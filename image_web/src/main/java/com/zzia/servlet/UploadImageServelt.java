package com.zzia.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by adeng on 2016/8/13.
 */
@WebServlet(urlPatterns = "/UploadImageServelt")
public class UploadImageServelt extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("image_web_UploadImageServelt.doPost");
        super.doPost(req, resp);
    }
}
