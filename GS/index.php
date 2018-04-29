<html>
<head>
    <title> Transparent Login Form Design </title>
    <link rel="stylesheet" type="text/css" href="style.css">   
    
    <script type="text/javascript">
        
  function checkForm()
  {
   // Name Validation
    if( document.myform.name.value == "" )
         {
            alert( "Please provide your name!" );
            document.myform.name.focus() ;
            return false;
         }
    // Email Validation
    var emailID = document.myform.email.value;
     atpos = emailID.indexOf("@");
     dotpos = emailID.lastIndexOf(".");

     if (atpos < 1 || ( dotpos - atpos < 2 )) 
     {
        alert("Please enter correct email ID")
        document.myform.email.focus() ;
        return false;}
        
     //Password Validation
     var passlength=document.myform.password.value.length; 
      if(passlength<6)
          {
              alert("Password must contain at least 6 letters");
              document.myform.password.focus() ;
            return false;}
      var firstpassword=document.myform.password.value;  
      var secondpassword=document.myform.password1.value;  
      if(firstpassword!=secondpassword)
      {
           alert("Passwords do not match");
          return false;
      }
      return( true );
    }
        
        
</script>
    
</head>
    <body>
        <a href="main.html" >
               <img src="images/home.png" width="100px"></a>
    <div class="login-box">
    <img src="images/avatar.png" class="avatar">
        
        <h1>Register</h1>
             <form name="myform" onsubmit="return (checkForm());" action="" method="get">
                 
            <p>Name</p>
            <input type="text" name="name" placeholder="Enter Name" >
            <p>Email</p>
            <input type="text" name="email" placeholder="Enter Email">
            <p>Phone</p>
            <input type="number" name="number" placeholder="Enter Contact" step="1" min="1" class="quantity" />
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password" >
            <p>Re-Enter Password</p>
            <input type="password" name="password1" placeholder="Enter Password" >
            <input type="submit" name="submit" value="Submit"> 
            <input type="reset" name="reset" value="Reset"> 
                </form>
        
        </div>

        
      </body>  
</html>
<?php
require_once('condb.php');
if(isset($_GET['submit']))
{
    $uname=$_GET['name'];
    $email=$_GET['email'];
    $number=$_GET['number'];
    $password=$_GET['password'];
    $sql = "INSERT INTO user VALUES ('".$uname."','".$email."',".$number.",'".$password."')";
   
if ($con->query($sql) === TRUE) {
?>
<script>
alert('Registered successfully');
</script>
<?php
} else {
	echo "Error: " . $sql . "<br>" . $con->error;
}$con->close();

}
?>