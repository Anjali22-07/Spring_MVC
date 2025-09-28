<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
  <div class="container mt-4">
   <div class="row">
     <div class="col-md-8 offset-md-2">
     <div class="card">
     <div class="card-body">
     <h1 class="text-center">Complex Form</h1>
     <hr/>
    <form action="process" method="post">
     <div class="mb-3">
    <label for="username" class="form-label">Your Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="Name" placeholder="Enter Your Name" >
     </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email</label>
    <input type="email" class="form-control" id="userName" aria-describedby="emailHelp" name="email" placeholder="Enter your email">
   </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Date Of Birth</label>
    <input type="text" class="form-control" id="userName" aria-describedby="emailHelp" name="date" placeholder="DD/MM/YYYY">
   </div>
		   <div class="mb-3">
		  <select class="form-select" multiple aria-label="Multiple select example" name="topics">
			  <option selected>Select Subject</option>
			  <option value="Java">Java</option>
			  <option value="Python">Python</option>
			  <option value="Data Structure">Data Structure</option>
			  <option value="Algorithms">Algorithms</option>
			</select>
   </div>
   <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">Gender</label>
	     <div class="form-check">
	  <input class="form-check-input" type="radio" name="gender" id="radioDefault1" value="Male">
	  <label class="form-check-label" for="radioDefault1">
	   Male
	  </label>
	</div>
	   <div class="form-check">
	  <input class="form-check-input" type="radio" name="gender" id="radioDefault2" value="female">
	  <label class="form-check-label" for="radioDefault2">
	   Female
	  </label>
	</div>		   
   </div>
   
    <div class="mb-3">
     <label for="exampleInputEmail1" class="form-label" >Select student</label>
    <select class="form-select" name="students" aria-label="Default select example">
	  <option selected>select</option>
	  <option value="Old Student">Old Student</option>
	  <option value="New Student">New Student</option>
	 
	</select>
    </div>
    
    <div class="card">
    <div class="card-body">
    <p>Your Address</p>
    <div class="form-group">
    <div class="mb-3">
       <label for="username" class="form-label">Street</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="address.street" placeholder="Enter Your Name" >
  </div>
   <div class="mb-3">
       <label for="username" class="form-label">City</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="address.city" placeholder="Enter Your Name" >
  </div>
   <div class="mb-3">
       <label for="username" class="form-label">Pincode</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="address.pincode" placeholder="Enter Your Name" >
  </div>
  
    
    </div>
    
    </div>
    
    </div>
   
   
    
    <div class="container text-center md-8">
    <button type="submit" class="btn btn-success">Register</button> </div>
    
  </form>
  </div>
  </div>
  </div>
  </div>
  </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
  </body>
</html>