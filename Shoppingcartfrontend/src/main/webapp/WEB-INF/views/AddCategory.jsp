<%@ include file="AdminHome.jsp" %> 
<title>Category Page</title>
<style>

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

	<h1>Add a Category</h1>
    <form:form action="addcat" commandName="category">
		<table>
			<tr>
				<td><form:label path="cat_id">
						<spring:message text="Category Id" />
					</form:label></td>
				<c:choose>
					<c:when test="${!empty category.cat_id}">
						<td><form:input path="cat_id" disabled="true" readonly="true" />
						</td>
					</c:when>
                   </c:choose>
					<tr>
			<form:input path="cat_id" hidden="true"  />
				<td><form:label path="catname">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="catname" required="true" /></td>
			</tr>
			<tr>
				<td><form:label path="cat_description">
						<spring:message text="Description" />
					</form:label></td>
				<td><form:input path="cat_description" required="true" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<c:if test="${!empty category.catname}">
						<input type="submit"
							value="<spring:message text="Edit Category"/>" />
					</c:if>
				 <c:if test="${empty category.catname}">
						<input type="submit" value="<spring:message text="Add Category"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Category List</h3>
	<c:if test="${!empty categoryList}">
		<table class="tg">
			<tr>
				<th width="80">Category ID</th>
				<th width="120">Category Name</th>
				<th width="120">Category Description</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${categoryList}" var="category">
				<tr>
					<td>${category.cat_id}</td>
					<td>${category.catname}</td>
					<td>${category.cat_description}</td>
					<td><a href="<c:url value='category/edit/${category.cat_id}' />">Edit</a></td>
					<td><a href="<c:url value='category/remove/${category.cat_id}' />">Delete</a></td>
				</tr>
		</c:forEach>
		</table>
	</c:if>
	<%@ include file="Footer.jsp"%>