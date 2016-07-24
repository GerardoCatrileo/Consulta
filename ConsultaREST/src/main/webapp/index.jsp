<!DOCTYPE html>
<html>
<body>

	<table style="width: 100%" border="1">
		<tr>
			<td>URL</td>
			<td>Param</td>
			<td>Headers</td>
			<td>Method</td>
		</tr>
		<tr>
			<td>http://localhost:8080/ConsultaREST/user/list</td>
			<td></td>
			<td></td>
			<td>GET</td>
		</tr>
		<tr>
			<td>http://localhost:8080/ConsultaREST/user/{id}</td>
			<td>{id}</td>
			<td></td>
			<td>GET</td>
		</tr>
		<tr>
			<td>http://localhost:8080/ConsultaREST/user/delete/{id}</td>
			<td>{id}</td>
			<td></td>
			<td>GET</td>
		</tr>
		<tr>
			<td>http://localhost:8080/ConsultaREST/user/create</td>
			<td>{ "userId": 1, "login": "17914493-K", "password": null,
				"nickName": null, "firstName": null, "secondName": null, "lastName":
				null, "secondSurname": null, "gender": null, "birthdate": null,
				"email": "hernan.mancini@gmail.com", "phone": null, "phoneWork":
				null, "mobileNumber": null, "addressId": null }</td>
			<td>Content-Type: application/json</td>
			<td>POST</td>
		</tr>
		<tr>
			<td>http://localhost:8080/ConsultaREST/user/create</td>
			<td>{ "userId": 1, "login": "17914493-K", "password":
				"123456789", "nickName": "pilso", "firstName": "Hernan",
				"secondName": "Eduardo", "lastName": "Mancini", "secondSurname":
				"Acuña", "gender": 1, "birthdate": "1990-11-06", "email":
				"hernan.mancini@gmail.com", "phone": "963252977", "phoneWork":
				"963252977", "mobileNumber": "963252977", "addressId": null }</td>
			<td>Content-Type: application/json</td>
			<td>POST</td>
		</tr>
	</table>
</body>
</html>
