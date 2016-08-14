<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>图片上传</title>
</head>
<body>
<form action="ImageUploadServlet" method="post" enctype="multipart/form-data">
    请选择上传的图片或文件:<input type="file" name="fileName"/><input type="submit" value="上传"/>
</form>

<form action="ImageUploadServlet2" method="post" enctype="multipart/form-data">
    请选择上传的图片或文件:<input type="file" name="fileName"/><input type="submit" value="上传"/>
</form>

</body>
</html>

