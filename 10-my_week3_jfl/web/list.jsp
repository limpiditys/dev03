<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 2022/11/27
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--根据条件进行模糊查询--%>
<form action="/ListServlet" method="post">
     昵称：<input type="text" name="nick_name" value="${nick_name}">
    真实名称：<input type="text" name="name" value="${name}">
    开始时间：<input type="text" name="startDate" value="${startDate}">
    结束时间：<input type="text" name="endDate" value="${endDate}">

    <input type="submit" value="查询">
    <input type="reset" value="重置">
</form>
<a href="add.jsp">添加</a>
<table border="1" cellspacing="0">
    <tr>
        <td>编号</td>
        <td>邮箱</td>
        <td>昵称</td>
        <td>真实姓名</td>
        <td>角色</td>
        <td>手机号</td>
        <td>入职时间</td>
        <td>是否转正</td>
        <td></td>
    </tr>
    <c:forEach items="${arr}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.email}</td>
            <td>${a.nick_name}</td>
            <td>${a.name}</td>
            <td>${a.role}</td>
            <td>${a.tel}</td>
            <td>${a.hiredate}</td>
            <td>${a.status}</td>
            <td>
                <c:if test="${a.status==1}">已转正</c:if>
                <c:if test="${a.status==0}">未转正</c:if>
            </td>
<%--            <td><c:if test="${a.status==1?'已转正':'未转正'}"></c:if></td>--%>
            <td><a href="/getOne?id=${a.id}">转正</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
