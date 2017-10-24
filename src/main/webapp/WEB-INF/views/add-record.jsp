<%--
  Created by IntelliJ IDEA.
  User: vbordiniuc
  Date: 10/20/2017
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring-form" %>

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
        <div class="col-6">

            <%--'commandName' not supported any more, use 'modelAttribute' instead--%>
            <spring-form:form modelAttribute="record" method="post" cssClass="form-group">
                <h1 class="display-4">New todo:</h1>
                <spring-form:input path="contents"/>
                <spring-form:errors path="contents"/><br><br>
                <button type="submit" class="btn btn-primary">Add</button>
            </spring-form:form>

        </div>
        <div class="col"></div>
    </div>
</div>
</body>
</html>
