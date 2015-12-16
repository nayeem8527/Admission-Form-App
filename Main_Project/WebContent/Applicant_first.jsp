<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Applicant Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>
</head>
<body>
	<h1>welcome </h1>&nbsp&nbsp&nbsp<h1>${message1}</h1>  
	<a href="https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:8080/Main_Project/RegisterPage">Logout</a>
    <nav class="navbar navbar-default" role="navigation">
      <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand" href="#">IIITD Admissions</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">

          <li>
          	<form method="get" action="applicant">
            <input type="Submit" class="btn btn-default navbar-btn" data-container="body" data-toggle="popover" data-placement="bottom" value="Fill the form">
  			</form>          
          </li>
        </ul>

        <ul class="nav navbar-nav navbar-right">


          <li>&nbsp;</li>
          <li>
			
			<form method="POST" action="Applicant_first_page">
            <div class="dropdown">
              <button type="button" class="btn btn-default navbar-btn" data-toggle="dropdown">View your form</button>

              <div class="dropdown-menu" style="padding: 10px; background: #ddd">
                  <div class="form-group">
                    <label for="user">Enrollment Number</label>
                    <input type="text" name="enroll" class="form-control" id="user" placeholder="Enrollment No." />
                  </div>
                  <input type="submit" class="btn btn-default">
              </div>
            </div>
            </form>

          </li>
        </ul>
      </div><!-- /.navbar-collapse -->
    </div>
    </nav>

      
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://blog.nediko.info/examples/css/bootstrap/loginform/js/jquery-1.10.2.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://blog.nediko.info/examples/css/bootstrap/loginform/js/bootstrap-3.0.2.min.js"></script>
	
	<script>
	// popover demo
    $('button[data-toggle=popover]').popover({ 
        html : true,
		    //trigger: "click",
        content: function() {
          return $('#popover_content_wrapper').html();
        }
    });
	</script>
	

<div class="container">
<br />
</div>
  </body>
</html>
