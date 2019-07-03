<%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //在域中存储数据
    request.setAttribute("name","zhangsan");
    session.setAttribute("name","李四");
    session.setAttribute("age","20");
%>

    <h1>获取值</h1>
    ${requestScope.name}
    ${sessionScope.age}
    ${sessionScope.haha}


    ${name}
    ${sessionScope.name}

</body>
</html>
