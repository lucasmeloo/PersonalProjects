<?php
// Connectt to DB  
$link = mysqli_connect("localhost","root","mysql");
	$name = $_POST['name'];  
	$birthday = $_POST['birthday']; 
	$gender = $_POST['gender']; 
	$regCode = $_POST['regCode']; 
	
if(!$link) {
	die("<h3><font color=red>You must install MySQL</font></h3>");	
	}	
	// Select DB
	$db_selected = mysqli_select_db($link, "UserDatabase");
if (!$db_selected) {
	print("<h3><font color=red>Database does not exist.</font></h3>");
	// Make Sure that the table exists

}
	$r = mysqli_query($link, "SELECT * FROM UserInformation");
if (!$r) {
	print("<h3><font color=red>UserDatabase does not exist</font></h3>");
	mysqli_query($link , $query);
	}
if( isset($_POST['submit']) ){
	$query = "INSERT INTO UserInformation(Name, Birthday, Gender, Registration_Code) VALUES ('$name','$birthday', '$gender', '$regCode')";
 	mysqli_query($link, $query);
	mysqli_close($link);
	print("User sign up completed. <br> <a href=/RESTful/index.html>Return</a> to add more records into database system.");
	}
?>
