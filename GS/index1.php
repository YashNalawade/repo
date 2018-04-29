<html>
<head>
    <title> Transparent Login Form Design </title>
    <link rel="stylesheet" type="text/css" href="style1.css">   

    <script type="text/javascript">
        
    function reset(){
    document.myform.name.value="";
    document.myform.password.value="";
    }
    </script>
</head>
    <body onload="reset()">
        <a href="main.html" >
               <img src="images/home.png" width="100px"></a>
    <div class="login-box">
    <img src="images/avatar.png" class="avatar">
        
        <h1>Login</h1>
             <form name="myform" method="get"  action="">
                 
            <p>Name</p>
            <input type="text" name="name" placeholder="Enter Name" >
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password" >
                 
            <input type="submit" name="submit" value="Login"> 
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
          header("location:trip.php?q=".$name);
}
    
 else {
        echo "Invalid Login";
      }
}
$con->close();
?>
