<%@ page import="domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 15:40
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

    List list =new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add(user);

    request.setAttribute("list",list);
%>

<h3>el获取list中的值</h3>
${list}<br>
${list[0]}
${list[1]}
${list[10]}
${list[3].name}
${list[3].age}





</body>
</html>
