<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 2022/11/27
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="/AddServlet" method="post" >
    邮箱：  <input type="text" name="email"  > <br>
    昵称： <input type="text" name="nick_name"  > <br>
    真实姓名： <input type="text" name="name" > <br>
    角色： <input type="text" name="role" > <br>
    手机号码： <input type="text" name="tel" > <br>
    时间：  <input type="text" name="hiredate" > <br>

    是否转正：<select name="status">
                <option>请选择</option>
                <option value="1">已转正</option>
                <option value="0">未转正</option>
            </select><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
