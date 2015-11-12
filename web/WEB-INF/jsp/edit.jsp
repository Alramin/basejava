<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Resume</title>
</head>
<body>
<h2><a href="<c:url value="/resume"/>">Back to list</a></h2>
<h2>Edit resume</h2>
<hr>
<jsp:useBean id="resume" type="ru.javawebinar.webapp.model.Resume" scope="request"/>
<form method="post" action="resume">
  <input type="hidden" name="uuid" value="${resume.uuid}">
  EDIT ${resume.uuid}
</form>
</body>
</html>