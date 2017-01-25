<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier Page</title>
</head>

<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>
	<h1>Add a Supplier</h1>

	

	<form:form action="addsup" commandName="supplier">
		<table>
			<tr>
				<td><form:label path="sup_id">
						<spring:message text="ID" />
					</form:label></td>
				<c:choose>
					<c:when test="${!empty supplier.sup_id}">
						<td><form:input path="sup_id" disabled="true" readonly="true" />
						</td>
					</c:when>

					</c:choose>
			<tr>
			<form:input path="sup_id" hidden="true"  />
				<td><form:label path="sup_name">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="sup_name" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="sup_description">
						<spring:message text="Description" />
					</form:label></td>
				<td><form:input path="sup_description" required="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty supplier.sup_name}">
						<input type="submit" value="<spring:message text="Edit Supplier"/>" />
					</c:if> <c:if test="${empty supplier.sup_name}">
						<input type="submit" value="<spring:message text="Add Supplier"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Supplier List</h3>
	<c:if test="${!empty supplierList}">
		<table class="tg">
			<tr>
				<th width="80">Supplier ID</th>
				<th width="120">Supplier Name</th>
				<th width="120">Supplier Description</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${supplierList}" var="supplier">
				<tr>
					<td>${supplier.sup_id}</td>
					<td>${supplier.sup_name}</td>
					<td>${supplier.sup_description}</td>
					<td><a href="<c:url value='supplier/edit/${supplier.sup_id}' />">Edit</a></td>
					<td><a href="<c:url value='supplier/remove/${supplier.sup_id}' />">Delete</a></td>
				</tr>
		</c:forEach>
		</table>
	</c:if>
</body>
</html>