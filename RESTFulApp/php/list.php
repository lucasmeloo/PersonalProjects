<?php
// Connectt to DB  
//List user inside the database
$link = mysqli_connect("localhost","root","mysql", "UserDatabase");

	echo "Database List: <br>";
	$query = "SELECT * FROM UserInformation";
	$result = mysqli_query($link, $query);
	while($row = mysqli_fetch_assoc($result)){
		echo $row["Name"] . " " . $row["Birthday"] . "<br>";
	}
	echo $row["Name"] . " " . $row["Birthday"] . "<br>";
	mysqli_close($link);
?>
