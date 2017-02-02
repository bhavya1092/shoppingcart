<%-- <%@include file="Header.jsp" %>
<h1></h1>

<h2>Please fill the details</h2>

	<form:form commandName="user" method="post" action="addus">
		<table>
		
			<tr>
				<td>User Name:</td>
				<td><form:input type="text" name="name" path="username"></form:input></td>
			</tr>
		
		<tr>
				<td>Email ID:</td>
				<td><form:input type="email ID" name="email" path="emailid"></form:input></td>
			</tr>
			
		
			
			<tr>
				<td>Password:</td>
				<td><form:input type="text" name="password" path="password"></form:input></td>
			</tr>
			
			<tr>
				<td> Confirm Password:</td>
				<td><form:input type="text" name="password" path="confirmpassword"></form:input></td>
			</tr>
			
			<tr>
				<td>Mobile No:</td>
				<td><form:input type="text" name="mobile" path="phno"></form:input></td>
			</tr>
				
			
			<tr>
				<td><input type="submit" value="Register">
				<td><input type="reset" value="Reset">
			</tr>
			
		</table>

	</form:form>

<%@ include file="Footer.jsp"%> --%>

<%@include file="Header.jsp"%>

<style>

td {
	font-size: 20px;
}
</style>

<center>
	<h1>Registration</h1>
	<p>
		ALREADY REGISTERED? <a href="login">SIGN IN</a>
	</p>

	<form:form commandName="us">

		<table>
			<tr>
				<td>Name</td>
				<td><form:input type="text" path="username" /></td>
			</tr>
			<!-- to display validation messages -->
			<c:forEach
				items="${flowRequestContext.messageContext.getMessagesBySource('username')}"
				var="err">
				<div>
					<span>${err.text}</span>
				</div>
			</c:forEach>

			<tr>
				<td>Enter Password</td>
				<td><form:input type="password" path="password" /></td>
			</tr>
			<!-- to display validation messages -->
			<c:forEach
				items="${flowRequestContext.messageContext.getMessagesBySource('password')}"
				var="err">
				<div>
					<span>${err.text}</span>
				</div>
			</c:forEach>

			<tr>
				<td>Enter Confirmed Password</td>
				<td><form:input type="password" path="cpassword" /></td>
			</tr>
			<!-- to display validation messages -->
			<c:forEach
				items="${flowRequestContext.messageContext.getMessagesBySource('cpassword')}"
				var="err">
				<div>
					<span>${err.text}</span>
				</div>
			</c:forEach>
			<tr>
				<td>Email Id</td>
				<td><form:input type="email" path="email" /></td>
			</tr>
			<!-- to display validation messages -->
			<c:forEach
				items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
				var="err">
				<div>
					<span>${err.text}</span>
				</div>
			</c:forEach>



			<tr>
				<td>Phone no.</td>
				<td><form:input type="text" path="phno" /></td>
			</tr>
			<!-- to display validation messages -->
			<c:forEach
				items="${flowRequestContext.messageContext.getMessagesBySource('phno')}"
				var="err">
				<div>
					<span>${err.text}</span>
				</div>
			</c:forEach>



			<tr>
				<td><input type="CHECKBOX" NAME="OFFER" CHECKED>I agree
					to receive information about exciting offers</td>
			</tr>
		</table>

		<br />
		<br />


		<div class="center">
			<input type="submit" name="_eventId_submit" value="submit">
		</div>

	</form:form>
	

</center>
<br />
<%@ include file="Footer.jsp"%>
