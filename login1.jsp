<%@ include file="Header.jsp"%>
<center>
	<form action="perform_login" method="POST">
			<table>
				<tr style="color: blue; font-size: 20pt">
					<td>Email-id:</td>
					<td><input type="email" name="username"
						placeholder="xxx@gmail.com" /></td>
				</tr>
				<tr style="color: blue; font-size: 20pt">
					<td>Password:</td>
					<td><input type="password" name="password" /><br></td>
				</tr>
				<tr>
					<td><input type="submit" value="Sign-in"
						style="color: blue; font-size: 20pt" /></td>
					<td><input type="reset" value="Cancel"
						style="color: red; font-size: 20pt" /></td>
				</tr>
			</table>
		</form>
	</center>	
<%@ include file="Footer.jsp"%>