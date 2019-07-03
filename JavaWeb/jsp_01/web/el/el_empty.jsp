<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String str="";
    request.setAttribute("str",str);

    List list=new ArrayList();
    request.setAttribute("list",list);
%>

${ empty str}
${ empty list}
${ not empty str}
${ not empty str}
</body>
</html>
