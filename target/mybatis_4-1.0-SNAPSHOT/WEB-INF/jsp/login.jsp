<%--
  Created by IntelliJ IDEA.
  User: qimu
  Date: 2022/11/18
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
          integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <title>登录</title>
</head>
<body>
<div class="container ">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-7">
            <br>
            <br>
            <br>
            <form action="${pageContext.request.contextPath}/user/userList" method="post" class="form-horizontal">
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label">Admin：</label>
                    <div class="col-xs-4">
                        <input type="text" class="form-control input-lg" id="inputEmail3" placeholder="Admin">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword3" class="col-sm-2 control-label">Password:</label>
                    <div class="col-xs-4">
                        <input type="password" class="form-control input-lg" id="inputPassword3" placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary ">Sign in</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
