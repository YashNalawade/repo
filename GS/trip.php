<!DOCTYPE html>
<html lang="en">
<head>
  <title>Make Yout Trip</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="a.css">
  <script src="a.js"></script>
  <script src="b.js"></script>
</head>
<body>
<div class="container">
    <h1>Ticket Booking</h1>
  <h1>Hi....<?php echo $_REQUEST['q'];?></h1>
  <form class="form-inline" >
    <div class="form-group">
      <label for="From">From:</label>
      <input type="text" class="form-control" id="from" placeholder="Enter Source" name="name">
    </div>
    <div class="form-group">
      <label for="Destination">Destination:</label>
      <input type="text" class="form-control" id="destination" placeholder="Enter Destination" name="destination">
    </div>
    <div class="form-group">
     <label for="Transport">Transport:</label>
      <input type="text" class="form-control" id="transport" placeholder="Enter Transport" name="transport">
    </div>
      
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>
<?php
include_once('condb.php');

    if(isset($_GET['submit']))
{
$name=$_GET['name'];
$password=$_GET['password'];
$sql = "SELECT * FROM user where name='".$name."' and password='".$password."'";

$result=$con->query($sql);
if($result->num_rows>0){   
          header("location:trip.php?$name");
}
    
 else {
        echo "Invalid Login";
      }
}
$con->close();
?>
