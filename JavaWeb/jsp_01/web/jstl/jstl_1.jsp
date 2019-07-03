<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="" %>


<html>
<head>
    <title>if 标签</title>
</head>
<body>
<c:if test="true">
    <h1>真的</h1>
</c:if>

<%
    //判断request域中的list集合是否为空，如果不为空，则显示集合遍历
    List list=new ArrayList();
    list.add("aaa");

    request.setAttribute("list",list);
    request.setAttribute("number",3);
%>
<br>

<c:if test="${number%2!=0}">
    ${number}为奇数
</c:if>

<c:if test="${number%2==0}">
    ${number}为偶数
</c:if>

</body>
</html>
