<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qimu
  Date: 2022/11/17
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <title>用户列表</title>
</head>
<body>
<br>
<div class="container">
<form class="form-inline"  action="${pageContext.request.contextPath}/user/userList">
    <div class="form-group">
        &nbsp;&nbsp;&nbsp;
        <label for="inputPassword2" class="sr-only">Password</label>
        <input type="text" name="userCode" class="form-control" id="inputPassword2" placeholder="查询用户">
    </div>
    <button type="submit" class="btn btn-primary">查询用户</button>
    <a class="btn btn-success" href="${pageContext.request.contextPath}/user/add" role="button">添加用户</a>
</form>
<table class="table table-hover">
    <div class="center-block">
        <tr>
            <th> &nbsp;&nbsp;&nbsp;id</th>
            <th>userCode</th>
            <th>userName</th>
            <th>gender</th>
            <th>birthday</th>
            <td>phone</td>
            <th>操作</th>
        </tr>

        <c:forEach items="${list}" var="user">
            <tr>
                <td> &nbsp;&nbsp;&nbsp;${user.id}</td>
                <td>${user.userCode}</td>
                <td>${user.userName}</td>
                <td>${user.gender}</td>
                <td>${user.birthday}</td>
                <td>${user.phone}</td>
                <td>
                    <a class="btn btn-info" href="${pageContext.request.contextPath}/user/update?id=${user.id}">修改 </a>
                    <a class="btn btn-danger" href="${pageContext.request.contextPath}/user/delete?id=${user.id}"> 删除</a>
                </td>
            </tr>
        </c:forEach>
    </div>
</table>
</div>
</body>
</html>
