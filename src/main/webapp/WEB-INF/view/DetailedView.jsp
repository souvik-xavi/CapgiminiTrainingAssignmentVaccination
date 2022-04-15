<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" isELIgnored = "false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vacine-Center details</title>
</head>
<body>
<h3><%= request.getAttribute("message") %><br><br></h3>
	<table border="2" width="70%" cellpadding="2">
        <tr>
        	<th>Id</th>
            <th>CenterName</th>
            <th>CenterPincode</th>
            <th>district</th>
            <th>Available Vaccine</th>
        </tr>
        <c:forEach var="vc" items="${vcs}">
            <tr>
                <td>${vc.id}</td>
                <td>${vc.centerName}</td>
                <td>${vc.centerPincode}</td>
                <td>${vc.district}</td>
                <td>${vc.getAvailablevaccine()}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>