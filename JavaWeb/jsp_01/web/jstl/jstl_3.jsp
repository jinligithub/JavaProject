<%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach</title>
</head>
<body>

<c:foreach begin="1" end="10" var="i" step="1">
    ${i}<br>
</c:foreach>



<c:foreach items="${list}" var="str" varStatus="s">
    ${s.index} ${s.ocunt} ${str}
</c:foreach>

</body>
</html>
