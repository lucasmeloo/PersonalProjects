<?php
// Connectt to DB  
$link = mysqli_connect("localhost","root","mysql", "UserDatabase");
if( isset($_POST['filter']) ){
	$filter = $_POST["filter"];
	$query = "DELETE FROM UserInformation WHERE UserInformation.Name LIKE '%$filter%'";
	mysqli_query($link, $query);
	echo mysqli_info($link); 
	mysqli_close($link);
	print("USER " . $filter . " DELETED <br><a href=/RESTful/index.html>Return</a> to menu.");
	}
?>