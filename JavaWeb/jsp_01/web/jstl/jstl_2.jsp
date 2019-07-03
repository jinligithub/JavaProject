<%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choose</title>
</head>
<body>
<%--
    星期：
    1.域中村塾数字
    2.使用choose取出数字
    3.使用when作出判断
    4.otherwise作出其他的情况
 --%>

<%
    request.setAttribute("number",3);
%>
<c:choose>
    <c:when test="${number==1}">星期一</c:when>
    <c:when test="${number==2}">星期二</c:when>
    <c:when test="${number==3}">星期三</c:when>
    <c:when test="${number==4}">星期四</c:when>
    <c:when test="${number==5}">星期五</c:when>
    <c:when test="${number==6}">星期六</c:when>
    <c:when test="${number==7}">星期天</c:when>

    <c:otherwise>输入数字有误</c:otherwise>
</c:choose>

</body>
</html>
