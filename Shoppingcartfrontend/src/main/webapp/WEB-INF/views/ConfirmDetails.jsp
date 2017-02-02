<%@ include file="Header.jsp"%>
<div class="content" style="text-align:center;">
	<fieldset>
		<legend>Confirm Details</legend>
		
		<a href="${flowExecutionUrl}&_eventId_index">Home</a><br /> <br />
		<form:form modelAttribute="us">
			<form:label path="username"><font color="black">User Name:</font></form:label>${us.username}
					<br />
			<br />
			<form:label path="password"><font color="black">Password :</font></form:label>${us.password}
					<br />


			<form:label path="email"><font color="black">Email:</font></form:label>${us.email}
					<br />
			<br />
			<form:label path="phno"><font color="black">Mobile #:</font></form:label>${us.phno}
					<br />
			<br />
			<input name="_eventId_edit" type="submit" value="Edit" />
			<input name="_eventId_submit" type="submit" value="Confirm Details" />
			<br />
		</form:form>
	</fieldset>
</div>

<%@ include file="Footer.jsp"%>