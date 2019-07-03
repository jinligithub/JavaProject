<%@ page import="domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Z
  Date: 2019/7/3
  Time: 15:48
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


    Map map=new HashMap();
    map.put("name","wangwu");
    map.put("sex","男");
    map.put("u",user);

    request.setAttribute("map",map);


%>

<h3>el获取map中的值</h3>

${map.user.name}

${map.sex}
${map["sex"]}
${map.user}
</body>
</html>
