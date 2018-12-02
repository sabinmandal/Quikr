<%-- 
    Document   : index
    Created on : Nov 27, 2018, 2:41:44 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="//fonts.googleapis.com/css?family=Raleway:400,500,600,700,800,900" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:400,600,700" rel="stylesheet">
</head>
<body>
<div class="container">
  <h2>Signup Form</h2>
<form method="POST">
<div class="agileinfo">
<input type="text" name="uname1" placeholder="User Name" required="">
</div>
<div class="agileinfo">
<input type="email" name="email1" placeholder="Email" required="">
</div>
<div class="agileinfo">
<input type="Password" name="password1" placeholder="Password" required="">
</div>
<div class="agileinfo">
<input type="password" name="password2" placeholder="Confirm Password" required="">
</div>
<div class="w3l_but">
<button type="submit" formaction="signServlet">REGISTER</button>
</div>
</form>
<div class="wthree_down">
<h3>Already had an Account please Login</h3>
</div>
<div class="w3agile_side">
<div class="main">
    <div class="panel">
        <a href="#login_form" id="login_pop">LOGIN</a>
    </div>
</div>
<!-- popup form #1 -->
<a href="#x" class="overlay" id="login_form"></a>
   <div class="popup">
     <h2>Welcome</h2>
     <p>Please enter your Username and Password here</p>
	 <form method="POST">
   <div>
      <input type="text" name="uname" placeholder="Username">
   </div>
   <div>

   <input type="password" name="psw" placeholder="Password">
   </div>
             <button type="submit" formaction="logServlet1">Login</button>
   <a class="close" href="#close"></a>
   </form>
</div>
</div>
</div>
</body>
</html>
