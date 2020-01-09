<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h2>Register Form</h2>

	<form action="/registerFile01" method="post" enctype="multipart/form-data">
		<input type="file" name="picture"> <input type="submit">
	</form>
	
	<form action="/registerFile02" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <input type="submit">
	</form>
	
	<form action="/registerFile03" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <input type="submit">
	</form>
	
	<form action="/registerFile04" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="picture"> <input type="submit">
	</form>	
	
	<form action="/registerFile05" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="picture"> <br>
		<input type="file" name="picture2"> <input type="submit">
	</form>	
	
	<form action="/registerFile06" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="pictureList[0]"> <br>
		<input type="file" name="pictureList[1]"> <input type="submit">
	</form>	
	
	<form action="/registerFile06" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="pictureList"> <br>
		<input type="file" name="pictureList"> <input type="submit">
	</form>
	
	<form action="/registerFile07" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="pictureList[0]"> <br>
		<input type="file" name="pictureList[1]"> <input type="submit">
	</form>
	
	<form action="/registerFile08" method="post" enctype="multipart/form-data">
		userId: <input type="text" name="userId" value="hongkd"><br>
		password: <input type="text" name="password" value="1234"><br>
		
		<input type="file" name="pictureList" multiple> <input type="submit">
	</form>
</body>
</html>
