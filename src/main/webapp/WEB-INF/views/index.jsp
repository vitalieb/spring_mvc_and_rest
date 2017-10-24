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
    <title>ToDo List</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col"></div>
        <div class="col-6">
            <form method="POST">
                <div class="form-group">
                    <h1 class="display-4">New todo:</h1>
                    <label for="contents">Contents</label>
                    <input type="text" class="form-control" id="contents" name="contents"
                           aria-describedby="contentsHelp"
                           placeholder="Enter 'toDo' contents" required>
                    <small id="contentsHelp" class="form-text text-muted">Please write your doTo contents right here
                    </small>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <h1 class="display-4">Pending tasks:</h1>
            <ul class="list-group">
                <c:forEach items="${allRecords}" var="record">
                    <li class="list-group-item">
                        <div class="container">
                            <div class="row">
                                <div class="col-8"><c:out value="${record.contents}"/></div>
                                <div class="col-4"><a href="/delete/${record.id}" role="button"
                                                      class="btn btn-outline-danger btn-sm float-right">Delete</a>
                                    <a class="btn btn-outline-info btn-sm float-right" style="margin-right: 10px;"
                                       href="/jdbc-template/${record.id}" role="button">View</a></div>
                            </div>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </div>
        <div class="col"></div>
    </div>
</div>
</body>
</html>
