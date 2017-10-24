<%--
  Created by IntelliJ IDEA.
  User: vbordiniuc
  Date: 10/20/2017
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
            integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
            crossorigin="anonymous"></script>
    <title>Add new record</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col"></div>
        <div class="col-8">
            <h1 class="display-4">Post with id ${record.id} contents:</h1>
            <br>
            <div style="border: solid; border-width: 1px;border-color: darkgrey">
                <c:out value="${record.contents}"/>
            </div>
            <br>
            <a class="btn btn-sm btn-primary" href="/" role="button">Home</a>
        </div>
        <div class="col"></div>
    </div>
</div>
</body>
</html>
