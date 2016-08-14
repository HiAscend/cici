<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>大师成长之路</title>
</head>
<body>

<h2>Hello World</h2>

<a href="image_upload.jsp">图片上传</a><br>
<a href="URLServlet">URLServlet</a>

</body>
</html>

