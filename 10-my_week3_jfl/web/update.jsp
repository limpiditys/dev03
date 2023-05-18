<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 2022/11/27
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/UpdateServlet" method="post" >
    <input type="hidden" name="id" value="${One.id}" readonly> <br>
    邮箱  <input type="text" name="email" value="${One.email}" readonly> <br>
    昵称 <input type="text" name="nick_name" value="${One.nick_name}" readonly> <br>
    真实姓名 <input type="text" name="name" value="${One.name}" readonly> <br>
    角色 <input type="text" name="role" value="${One.role}" readonly> <br>
    手机号码 <input type="text" name="tel" value="${One.tel}" readonly> <br>
    时间  <input type="text" name="hiredate" value="${One.hiredate}" readonly> <br>
    是否转正 <input type="text" name="status" value="${One.status==0?'未转正':'已转正'}" readonly> <br>

    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
