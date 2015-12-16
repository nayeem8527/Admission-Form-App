<html lang="en">
  <head>
  	<meta charset="utf-8">
  	<title>Applicant</title>
  	<link rel="shortcut icon" href="http://phdadmissions.iiitd.edu.in/static/images/favicon.ico" type="image/x-icon">
  	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous">
	</script>

	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

	
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


	</head>
	<body>
	<form method="POST" action="applicant">
		<!--header navbar-->
    
		<nav class="navbar navbar-default">
  			<div class="container-fluid" style='background-color:#666666'>
    		<!-- Brand and toggle get grouped for better mobile display -->
    			<div class="navbar-header">
      			<a class="navbar-brand" href="#"><img src='logo.png' style='margin-top:-10px'></a>

      			<ul class="nav navbar-nav">
        			<li ><a href="#">FAQ</a></li>
    				<li ><a href="#">Contact</a></li>
		    	</ul>
    		</div><!-- /.navbar-collapse -->
  			</div><!-- /.container-fluid -->
		</nav>

		<!-- info panel -->
		<div class="col-md-1">
		</div>

		<div class="col-md-10">
		    <div class="alert alert-info" role="alert">
			     Submit button will appear after filling all the necessary and mandatory fields correctly.
		    </div>

    <div class='container'>
		<!-- main portion -->
		<ul class="nav nav-tabs">
  			 <li  class='active'><a href="#red" data-toggle="tab">Personal Information</a></li>
          <li ><a href="#orange" data-toggle="tab">Education Information</a></li>
        	<li ><a href="#yellow" data-toggle="tab">File Uploading</a></li>
		</ul>

		<div class="tab-content">
        	<div id="red" class="tab-pane fade in active">
        		<br/>
            	<p>Email*: </p>
            	<input type="text" name="email" class="form-control" placeholder="Email" maxlength='100'>
            	<p>Name*: </p>
            	<input type="text" name="name" class="form-control" placeholder="Name" maxlength='100'>
            	<p>Address of Corresspondence*: </p>
            	<textarea  name="address_corress" class="form-control" rows="3" placeholder="Address"></textarea>
            	<p>Mobile*: </p>
            	<input type="number"  name="mobile" class="form-control" placeholder="Mobile" maxlength='100'>
            	<p>PhD Stream*: </p>
            	<div class="radio">
  					<label>
    					<input type="radio" name="phd_stream" id="optionsRadios1" value="Computer Science">
    					Computer Science
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="phd_stream" id="optionsRadios1" value="Electronics and Communication">
    					Electronics and Communication
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="phd_stream" id="optionsRadios1" value="Computational Biology">
    					Computational Biology
  					</label>
				</div>
				<p>Phd Preference 1*</p>
				<select class="form-control" name="phd_pref1">
					<option></option>
  					<option>Maths</option>
  					<option>Science</option>
					<option>Computers</option>
  					<option>Chemistry</option>
  					<option>Physics</option>
				</select>
				<p>Phd Preference 2</p>
				<select class="form-control" name="phd_pref2">
  					<option></option>
  					<option>Maths</option>
  					<option>Science</option>
					<option>Computers</option>
  					<option>Chemistry</option>
  					<option>Physics</option>
				</select>
				<p>Phd Preference 3</p>
				<select class="form-control" name="phd_pref3">
					<option></option>
  					<option>Maths</option>
  					<option>Science</option>
					<option>Computers</option>
  					<option>Chemistry</option>
  					<option>Physics</option>
				</select>
				<p>Gender*: </p>
            	<div class="radio">
  					<label>
    					<input type="radio" name="gender" id="optionsRadios1" value="male">
    					Male
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="gender" id="optionsRadios1" value="female">
    					Female
  					</label>
				</div>
				<p>Category*: </p>
            	<div class="radio">
  					<label>
    					<input type="radio" name="category" id="optionsRadios1" value="general">
    					General
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="category" id="optionsRadios1" value="OBC">
    					OBC
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="category" id="optionsRadios1" value="SC">
    					SC
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="category" id="optionsRadios1" value="ST">
    					ST
  					</label>
				</div>
				<p>Physically Disabled*: </p>
            	<div class="radio">
  					<label>
    					<input type="radio" name="physical_disabled" id="optionsRadios1" value="yes">
    					Yes
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="physical_disabled" id="optionsRadios1" value="no">
    					No
  					</label>
				</div>
				<p>Date of Birth*:</p>
				<input type='date' name="dob">
				<p>Children/War Widows of Defence Personnel killed/Disabled in Action* </p>
            	<div class="radio">
  					<label>
    					<input type="radio" name="widow" id="optionsRadios1" value="yes">
    					Yes
  					</label>
				</div>
				<div class="radio">
  					<label>
    					<input type="radio" name="widow" id="optionsRadios1" value="no">
    					No
  					</label>
				</div>
				<p>Father's Name*: </p>
            	<input type="text" name="father_name" class="form-control" placeholder="Name" maxlength='100'>
            	<p>Nationality*</p>
				<select class="form-control" name="nationality">
					<option></option>
  					<option>Indian</option>
  					<option>American</option>
					<option>Canadian</option>
  					<option>Brazilian</option>
  					<option>Australian</option>
				</select>
				<p>Permanent Address*: </p>
            	<textarea name="per_address" class="form-control" rows="3" placeholder="Address"></textarea>
        <p>Pincode*: </p>
            	<input type="number" name="pincode" class="form-control" placeholder="Pin Code" maxlength='100'>
      	<br/>
        	</div>
        	<div id="orange" class="tab-pane fade">
              <br/>
            	<p>Schooling Information</p>
              <p>Xth Board*: </p>
              <input type="text" name="tenth_board" class="form-control" placeholder="" maxlength='100'>
              <p>Xth Marks*: </p>
              <input type="text"  name="tenth_marks" class="form-control" placeholder="" maxlength='100'>
              <p>Year of Passing Xth*</p>
                <select class="form-control" name="tenth_year">
                  <option></option>
                  <option>2015</option>
                  <option>2014</option>
                  <option>2013</option>
                  <option>2012</option>
                  <option>2011</option>
                  <option>2010</option>
                </select>
              <p>XIIth Board*: </p>
              <input type="text" name="twelth_board" class="form-control" placeholder="" maxlength='100'>
              <p>XIIth Marks*: </p>
              <input type="text"  name="twelth_marks" class="form-control" placeholder="" maxlength='100'>
              <p>Year of Passing XIIth*</p>
                <select class="form-control" name="twelth_year">
                  <option></option>
                  <option>2015</option>
                  <option>2014</option>
                  <option>2013</option>
                  <option>2012</option>
                  <option>2011</option>
                  <option>2010</option>
                </select>

                <br/>
                <p>Graduation Information</p>
                <p>Degree*: </p>
                  <input type="text" name="grad_degree" class="form-control" placeholder="" maxlength='100'>
                <p>Department/Discipline*: </p>
                  <input type="text"  name="grad_department" class="form-control" placeholder="" maxlength='100'>
                <p>Name of College*: </p>
                  <input type="text" name="grad_college" class="form-control" placeholder="" maxlength='100'>
                <p>Name of University*: </p>
                  <input type="text" name="grad_university" class="form-control" placeholder="" maxlength='100'>
                <p>City*: </p>
                  <input type="text" name="grad_city" class="form-control" placeholder="" maxlength='100'>
                <p>State*</p>
                <select class="form-control" name="grad_state">
                  <option></option>
                  <option>Delhi</option>
                  <option>Maharashtra</option>
                  <option>UP</option>
                  <option>Punjab</option>
                  <option>AP</option>
                </select>
                <p>Year of Graduation*</p>
                <select class="form-control" name="grad_year">
                  <option></option>
                  <option>2015</option>
                  <option>2014</option>
                  <option>2013</option>
                  <option>2012</option>
                  <option>2011</option>
                  <option>2010</option>
                </select>
                <p>CGPA or Marks?*: </p>
                  <div class="radio">
                    <label>
                      <input type="radio" name="grad_cgpa_marks" id="optionsRadios1" value="cgpa">
                        CGPA
                        <p><input type="text" name="grad_cgpa" class="form-control" placeholder="" maxlength='100'> /  <select class="form-control" name="grad_div">
                                <option></option>
                                <option>4</option>
                                <option>10</option>
                                </select></p>
                      </label>
                  </div>
                  <div class="radio">
                    <label>
                      <input type="radio" name="grad_cgpa_marks" id="optionsRadios1" value="marks">
                        Marks(%)
                        <input type="text" name="grad_marks" class="form-control" placeholder="" maxlength='100'>
                    </label>
                </div> 
                <div class="container">
                  <div class="panel-group" id="accordion">
                  <input type="checkbox" name="ece" value="ECE">Select this for ECE PhD Subject Preference
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">
                         	<a data-toggle="collapse" data-parent="#accordion" href="#collapse1">ECE PhD Subject Preference</a>
                        </h4>
                      </div>
                      <div id="collapse1" class="panel-collapse collapse in">
                        <div class="panel-body">
                          <p>You are required to select 4 subjects if you are an under-graduate otherwise you need to fill 3.</p>
                          <p>Preference 1*</p>
                              <select class="form-control" name="ece_pref1">
                                <option></option>
                                <option>Advance Signal</option>
                                <option>CMOS</option>
                                <option>VLSI</option>
                                <option>Signals</option>
                                <option>Sounds</option>
                              </select>
                          <p>Preference 2*</p>
                              <select class="form-control" name="ece_pref2">
                                <option></option>
                                <option>Advance Signal</option>
                                <option>CMOS</option>
                                <option>VLSI</option>
                                <option>Signals</option>
                                <option>Sounds</option>
                              </select>
                          <p>Preference 3*</p>
                              <select class="form-control" name="ece_pref3">
                                <option></option>
                                <option>Advance Signal</option>
                                <option>CMOS</option>
                                <option>VLSI</option>
                                <option>Signals</option>
                                <option>Sounds</option>
                              </select>
                          <p>Preference 4</p>
                              <select class="form-control" name="ece_pref4">
                                <option></option>
                                <option>Advance Signal</option>
                                <option>CMOS</option>
                                <option>VLSI</option>
                                <option>Signals</option>
                                <option>Sounds</option>
                              </select>
                        </div>
                      </div>
                    </div>
                    <input type="checkbox" name="pg" value="PG">Select this for Post Graduation
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">
                          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Have You completed your Post Graduation?</a>
                        </h4>
                      </div>
                      <div id="collapse2" class="panel-collapse collapse">
                        <div class="panel-body">
                            <h1>Post-Graduation Information</h1>
                            <p>Name of College: </p>
                              <input type="text" name="pg_college" class="form-control" placeholder="" maxlength='100'> 
                            <p>City: </p>
                              <input type="text" name="pg_city" class="form-control" placeholder="" maxlength='100'>
                            <p>State</p>
                            <select class="form-control" name="pg_state">
                              <option></option>
                              <option>Delhi</option>
                              <option>Maharashtra</option>
                              <option>UP</option>
                              <option>Punjab</option>
                              <option>AP</option>
                            </select>
                            <p>Department/Discipline: </p>
                              <input type="text" name="pg_department"class="form-control" placeholder="" maxlength='100'>
                            <p>Degree: </p>
                              <input type="text" name="pg_degree" class="form-control" placeholder="" maxlength='100'>
                            <p>Thesis Title: </p>
                              <input type="text" name="pg_thesis" class="form-control" placeholder="" maxlength='100'>
                            <p>Year of Post-Graduation*</p>
                              <select class="form-control" name="pg_year">
                                <option></option>
                                <option>2015</option>
                                <option>2014</option>
                                <option>2013</option>
                                <option>2012</option>
                                <option>2011</option>
                                <option>2010</option>
                              </select>
                            <p>CGPA or Marks?: </p>
                                <div class="radio">
                                  <label>
                                    <input type="radio" name="pg_cgpa_marks" id="optionsRadios1" value="cgpa">
                                      CGPA
                                      <p><input type="text" name="pg_cgpa" class="form-control" placeholder="" maxlength='100'> /  <select class="form-control" name="pg_div">
                                              <option></option>
                                              <option>4</option>
                                              <option>10</option>
                                              </select></p>
                                    </label>
                                </div>
                                <div class="radio">
                                  <label>
                                    <input type="radio" name="pg_cgpa_marks" id="optionsRadios1" value="marks">
                                      Marks(%)
                                      <input type="text" name="pg_marks" class="form-control" placeholder="" maxlength='100'>
                                  </label>
                              </div> 
                        </div>
                      </div>
                    </div>
                    <input type="checkbox" name="academic" value="academic">Select this for Other Academic Degree
                    <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">
                          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Other Academic Degrees</a>
                        </h4>
                      </div>
                      <div id="collapse3" class="panel-collapse collapse">
                        <div class="panel-body">
                          <h1>Other Academic Degree</h1>
                          <p>Exam Name: </p>
                              <input type="text" name="acad_exam" class="form-control" placeholder="" maxlength='100'>
                          <p>Subject: </p>
                              <input type="text" name="acad_subject" class="form-control" placeholder="" maxlength='100'>
                          <p>Year*</p>
                              <select class="form-control" name="acad_year">
                                <option></option>
                                <option>2015</option>
                                <option>2014</option>
                                <option>2013</option>
                                <option>2012</option>
                                <option>2011</option>
                                <option>2010</option>
                              </select>
                          <p>Score: </p>
                              <input type="text" name="acad_score" class="form-control" placeholder="" maxlength='100'>
                          <p>Rank: </p>
                              <input type="text" name="acad_rank" class="form-control" placeholder="" maxlength='100'>
                        </div>
                      </div>
                    </div>
                    <input type="checkbox" name="gate" value="Gate">Select this if taken gate exam.
                     <div class="panel panel-default">
                      <div class="panel-heading">
                        <h4 class="panel-title">
                          <a data-toggle="collapse" data-parent="#accordion" href="#collapse4">Taken Gate Exam?</a>
                        </h4>
                      </div>
                      <div id="collapse4" class="panel-collapse collapse">
                        <div class="panel-body">
                          <h1>Gate</h1>
                          <p>Area: </p>
                              <input type="text" name="gate_area" class="form-control" placeholder="" maxlength='100'>
                          <p>Year of Passing*</p>
                              <select class="form-control" name="gate_year">
                              	<option></option>
                                <option>2015</option>
                                <option>2014</option>
                                <option>2013</option>
                                <option>2012</option>
                                <option>2011</option>
                                <option>2010</option>
                              </select>
                          <p>Marks(Out of 100): </p>
                              <input type="text" name="gate_marks" class="form-control" placeholder="" maxlength='100'>
                          <p>Score: </p>
                              <input type="text" name="gate_score" class="form-control" placeholder="" maxlength='100'>
                          <p>Rank: </p>
                              <input type="text" name="gate_rank" class="form-control" placeholder="" maxlength='100'>
                        </div>
                      </div>
                    </div>
                  </div> 
                </div>
                <br/>
                <p>Achievements, CV and Statement of Purpose</p>
                <p>Achievements (Other information like ranks, medals etc): </p>
                    <input type="text" name="acheivement" class="form-control" placeholder="" maxlength='100'>
                <button type="submit" class="btn btn-default">Submit</button><br/>
				</form> 
				<p>${message2}</p>
        	</div>
        	<div id="yellow" class="tab-pane fade">
              <br/>
                
				<form action="UploadCV" method="POST" enctype="multipart/form-data">
                <h3>CV/Resume*:</h3>
                  <br />
                  <input type="file" name="cv_file" size="50" />
                  <br />
                  <input type="submit" value="Upload File" />
                 </form>
                 <p>${message}</p>
                 <form action="UploadSOP" method="POST" enctype="multipart/form-data">
                <h3>Statement of Purpose*</h3>
                  <br />
                  <input type="file" name="sop_file" size="50" />
                  <br />
                  <input type="submit" value="Upload File" />
                 </form>
                 <p>${message1}</p>
        	</div>
    	</div>

		</div>
    </div>
		<div class="col-md-1">
		</div>
    
	</body>
</html>