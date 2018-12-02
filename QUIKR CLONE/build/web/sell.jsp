<%-- 
    Document   : sell
    Created on : Nov 27, 2018, 2:47:17 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell</title>
        <style>  
      body {
            background-color: #f1f1f1;
            padding: 20px;
            font-family: Arial;
            }
     .header {
             overflow: hidden;
             background-color: #f1f1f1;
             padding: 20px 10px;
            }

     .header a {
               float: left;
               color: black;
               text-align: center;
               padding: 12px;
               text-decoration: none;
               font-size: 18px; 
               line-height: 25px;
               border-radius: 4px;
               }   

     .header a.logo {
                font-size: 25px;
                font-weight: bold;
                }

      .header a:hover {
                background-color: #ddd;
                 color: black;
                }

      .header a.active {
                   background-color: dodgerblue;
                   color: white;
                   }

      .header-right {
                float: right;
                }
                input[type=text], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color:#C7C7C7;
    padding: 20px;
    animation: normal;
}

.col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
}

.col-75 {
    float: left;
    width: 75%;
    margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
 .header-left
{
    float:left;
    text-align: center;
}
</style>
</head>
<body>
<div class="header">
    <div class="header-left">
        <img src="images/user.png" height="100 px" width="80 px"><br>
        <% out.println(session.getAttribute("name")); %>
    </div>    
  <div class="header-right">
    <a href="buy.jsp">Buy</a>
    <a class="active" href="sell.jsp">Sell</a>
  </div>
</div>
    <hr>
   <div class="container">
  <form action="inventory">
    <div class="row">
      <div class="col-25">
        <label for="fname">Title</label>
      </div>
      <div class="col-75">
        <input type="text" id="title" name="title">
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="category">Category</label>
      </div>
      <div class="col-75">
        <select id="category" name="category">
          <option value="cars">Cars</option>
          <option value="bikes">Bikes</option>
          <option value="mobile">Mobile</option>
        </select>
      </div>
    </div>
    
    <div class="row">
      <div class="col-25">
        <label for="description">Description</label>
      </div>
      <div class="col-75">
        <textarea id="description" name="description" style="height:200px"></textarea>
      </div>
    </div>
    <div class="row">
      <input type="submit" value="Submit">
    </div>
  </form>
</div>
      

    
    </body>
</html>
