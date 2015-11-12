<%@ page import="ru.javawebinar.webapp.model.ContactType" %>
<%@ page import="java.util.Map" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Resume</title>
</head>
<body>
<h4><a href="<c:url value="/resume"/>">Back to list</a></h4>
<hr>
<jsp:useBean id="resume" type="ru.javawebinar.webapp.model.Resume" scope="request"/>
<div>
  <h2>
    ${resume.fullName}
    <a href="resume?uuid=${resume.uuid}&action=edit"><img src="img/pencil.png"></a>
  </h2>

  <div>
    Проживание: ${resume.contacts}
    <%
      for (Map.Entry<ContactType, String> entry : resume.getContacts().entrySet()) {
    %>
    <br>
    <%=entry.getKey().toHtml(entry.getValue())%>
    <%}%>
  </div>
  <br/>

  <div>
    <table border="1">
      <c:forEach items="${resume.sections}" var="section">
        <tr>
        <td>
          <h3><a>${section.key.title}</a></h3>
        </td>
        <td>
        <c:if test="${section.key=='OBJECTIVE'}">
          <b>${section.value}</b>
        </c:if>
        <c:if test="${section.key=='QUALIFICATIONS' || section.key=='ACHIEVEMENT'}">
          <c:set var="multiTextSection" scope="page" value="${section.value}"/>
          <jsp:useBean id="multiTextSection"
                       class="ru.javawebinar.webapp.model.MultiTextSection"
                       scope="request"/>
          <ul>
            <c:forEach items="${multiTextSection.lines}" var="textLine">
              <li>${textLine}</li>
            </c:forEach>
          </ul>
        </c:if>
        <c:if test="${section.key=='EXPERIENCE' || section.key=='EDUCATION'}">
          <c:set var="organizationSection" scope="page" value="${section.value}"/>
          <jsp:useBean id="organizationSection"
                       class="ru.javawebinar.webapp.model.OrganizationSection"
                       scope="request"/>
          </td></tr><tr>
          <jsp:useBean id="organization" class="ru.javawebinar.webapp.model.Organization"/>
          <c:forEach items="${organizationSection.organizations}" var="organization">
            <td>${organization.homePage}</td>
            <td></td>
            </tr>
            <c:forEach items="${organization.positions}" var="position">
              <%--<tr>--%>
                <%--<td>${period.start}-${period.start}</td>--%>
                <%--<td>--%>
                  <%--<b>${period.position}</b><br/>--%>
                    <%--${period.description}--%>
                <%--</td>--%>
              <%--</tr>--%>
            </c:forEach>
            <tr>
          </c:forEach>
        </c:if>
        </td>
        </tr>
      </c:forEach>

    </table>
  </div>
</div>
</body>
</html>
