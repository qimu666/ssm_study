<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
            integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
            crossorigin="anonymous"></script>
    <title>添加用户</title>
</head>
<body>
<div class="container">
    <div class="row" style="margin: 150px 200px">
        <form action="${pageContext.request.contextPath}/user/doUpdateAndSave" method="get" class="form-horizontal">
            <br>
            <div class="form-group">
                <div class="col-sm-6">
                    <label>userName</label>
                    <input type="text" name="userName" value="${user.userName}" class=" form-control" placeholder="userName">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6">
                    <label for="nianl">userCode</label>
                    <input type="text" name="userCode" class="form-control" value="${user.userCode}" id="nianl" placeholder="userCode">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6">
                    <label>gender</label>
                    <input type="text" name="gender" value="${user.gender}" class="form-control" placeholder="gender">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6">
                    <label for="nianl">phone</label>
                    <input type="text" name="phone" class="form-control" value="${user.phone}" id="phone" placeholder="phone">
                </div>
            </div>
            <div class="col-sm-6" style="margin-left: -5px">
                <button type="submit" class="btn btn-lg btn-primary btn-block"
                >确认</button>
            </div>
            <input type="hidden" name="id" value="${user.id}">
        </form>
    </div>
</div>
</body>
</html>
