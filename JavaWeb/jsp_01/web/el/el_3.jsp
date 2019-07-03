<%@ page import="domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user=new User();
    user.setName("zhangsan");
    user.setSex("男");
    user.setAge(20);
        user.setDate(new Date());

    request.setAttribute("u",user);
%>

    <h3>el获取对象中的值</h3>
    ${requestScope.u}


    ${requestScope.u.name}
     ${u.age}<br>
    ${u.sex}<br>
    ${u.date.year}<br>
    ${u.date.month}<br>
    ${u.date.day}<br>
    ${u.birStr}<br>
</body>
</html>
