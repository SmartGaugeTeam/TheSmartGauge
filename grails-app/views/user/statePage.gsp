<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <asset:link rel="icon" href="favicon-1-1.ico"/>

    <title>The Smart Gauge - Representation</title>

    <!-- Bootstrap core CSS -->
    <asset:stylesheet href="bootstrap.min.css"/>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <asset:stylesheet href="ie10-viewport-bug-workaround.css" rel="stylesheet"/>

    <!-- Custom styles for this template -->
    <asset:stylesheet href="dashboard.css" rel="stylesheet"/>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><asset:javascript src="ie8-responsive-file-warning.js"></asset:javascript><![endif]-->
    <asset:javascript src="ie-emulation-modes-warning.js"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            %{--<a class="navbar-brand" href="#">Project name</a>--}%
            <asset:image src="imgpsh_fullsize.png" style="display: inline-block; color: transparent; max-width: 100%;height: 130px; margin-left: 10px"/>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="login">HOME</a></li>
                <li><a href="aboutTsg">ABOUT TSG</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">FEDERAL <span class="caret"></span></a>
                    <ul class="dropdown-menu" style="height: 250px;overflow: scroll;" >
                        <li><a href="../home/ministryPage">Minister of Defence</a></li>
                        <li><a href="#">Minister of Education</a></li>
                        <li><a href="#">Minister of Environment</a></li>
                        <li><a href="#">Minister of Finance</a></li>
                        <li><a href="#">Minister of Foreign Affairs</a></li>
                        <li><a href="#">Minister of Health</a></li>
                        <li><a href="#">Minister of Information</a></li>
                        <li><a href="#">Minister of Interior</a></li>
                        <li><a href="#">Minister of Justice &amp; Attorney-General</a></li>
                        <li><a href="#">Minister of Niger Delta</a></li>
                        <li><a href="#">Minister of Science and Technology</a></li>
                        <li><a href="#">Minister of Solid Minerals</a></li>
                        <li><a href="#">Minister of State, Aviation</a></li>
                        <li><a href="#">Minister of Power, Works and Housing</a></li>
                        <li><a href="#">Minister of Budget &amp; National Planning</a></li>
                        <li><a href="#">Minister of Trade, Investment &amp; Industry</a></li>
                        <li><a href="#">Minister of Communication</a></li>
                        <li><a href="#">Minister FCT</a></li>
                        <li><a href="#">Minister of Agriculture</a></li>
                        <li><a href="#">Minister of Labour &amp; Employment</a></li>
                        <li><a href="#">Minister of Transportation</a></li>
                        <li><a href="#">Minister for Youth and Sports</a></li>
                        <li><a href="#">Minister of Water Resources</a></li>
                        <li><a href="#">Minister of Women Affairs</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">STATE <span class="caret"></span></a>
                    <ul class="dropdown-menu" style="height: 250px;overflow: scroll;">
                        <li><a href="../home/statePage">Abia</a></li>
                        <li><a href="#">Adamawa</a></li>
                        <li><a href="#">Akwa Ibom</a></li>
                        <li><a href="#">Anambra State</a></li>
                        <li><a href="#">Bauchi</a></li>
                        <li><a href="#">Bayelsa</a></li>
                        <li><a href="#">Benue</a></li>
                        <li><a href="#">Borno</a></li>
                        <li><a href="#">Cross River</a></li>
                        <li><a href="#">Delta</a></li>
                        <li><a href="#">Ebonyi</a></li>
                        <li><a href="#">Edo</a></li>
                        <li><a href="#">Ekiti</a></li>
                        <li><a href="#">Enugu</a></li>
                        <li><a href="#">Gombe</a></li>
                        <li><a href="#">Imo</a></li>
                        <li><a href="#">Jigawa</a></li>
                        <li><a href="#">Kaduna</a></li>
                        <li><a href="#">Kano</a></li>
                        <li><a href="#">Katsina</a></li>
                        <li><a href="#">Kebbi</a></li>
                        <li><a href="#">Kogi</a></li>
                        <li><a href="#">Kwara</a></li>
                        <li><a href="#">Lagos</a></li>
                        <li><a href="#">Nasarawa</a></li>
                        <li><a href="#">Niger</a></li>
                        <li><a href="#">Ogun</a></li>
                        <li><a href="#">Ondo</a></li>
                        <li><a href="#">Osun</a></li>
                        <li><a href="#">Oyo</a></li>
                        <li><a href="#">Plateau</a></li>
                        <li><a href="#">Rivers</a></li>
                        <li><a href="#">Sokoto</a></li>
                        <li><a href="#">Taraba</a></li>
                        <li><a href="#">Yobe</a></li>
                        <li><a href="#">Zamfara</a></li>
                    </ul>
                </li>
                <li><a href="#">CONCERNS</a></li>
                <li><a href="#">CONTACT US</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">MY ACCOUNT <span class="caret"></span></a>
                    <ul class="dropdown-menu" >
                        <li><a data-toggle="modal" data-target="#myModal">Login</a></li>
                        <li><a data-toggle="modal" data-target="#regModal">Register</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div  style="background-image: url(../images/home_bg.jpg);">

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12" >
                <div class="row" >
                    <div class="col-md-12 col-md-offset-1">
                        <h2 style="float: left;"> Minister of Defence</h2>
                    </div>
                </div>
                <hr size="30">
            </div>
        </div>
    </div>

    <div class="container-fluid" >
        <div class="row">
            <div class="col-sm-12 col-md-12" >
                <div class="row" >
                    <div class="col-md-1">&nbsp;</div>
                    <div class="col-md-2">
                        <img src="../images/governor.jpg" style="height: 200px;width: 200px">
                    </div>
                    <div class="col-md-1">&nbsp;</div>
                    <div class="col-md-7"  style="background-color: #e7e4e4; opacity: 0.9; color: black;">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#home">&nbsp;</a></li>
                            <li><a data-toggle="tab" href="#menu1">Bio</a></li>
                            <li><a data-toggle="tab" href="#menu2">Mandate</a></li>
                        </ul>
                        <div class="tab-content">
                            <div id="home" class="tab-pane fade in active">
                                <h3>Dan Ali</h3>
                                <p>Ministry of Defence</p>
                            </div>
                            <div id="menu1" class="tab-pane fade">
                                <p>Mansur Dan Ali was born August 25 1959 is a retired Nigerian Army Brigadier General and current Minister of Defence of Nigeria appointed by President Muhammadu Buhari in November 2015.
                                He attended Birnin Magaji Town Primary School (1966 -1972) for his elementary education and Government Secondary School, Shinkafi (1972-1977) for his secondary education. He received his Higher National Diploma (HND) in Photogrammetric and Surveying from Kaduna Polytechnic (1977-1982) and possesses a Master’s Degrees in Public Policy and Administration (MPPA) from Bayero University Kano (2004-2005) and a Master’s Degree in Security Studies from the Bangladesh University of Professionals (2009)
                                Dan Ali was commissioned as a 2nd Lieutenant in the Nigerian Army in 1984 through the Short Service Commission at the Nigerian Defence Academy. Dan-Ali has served in different command and staff capacities, some of which include commanding the Nigerian contingent supporting the United Nations Africa Hybrid Mission in Sudan. Dan Ali was on the Directing Staff of the Armed Forces Command and Staff College, Jaji from 2003 -2005 and was Chief Instructor (CI) at the Nigerian Defence Academy in 2010. He was also Acting Director Military Training before getting posted to the Ministry of Defence’s Logistics Department as Deputy Director. He retired from the Nigerian Army on August 30, 2013.</p>
                            </div>
                            <div id="menu2" class="tab-pane fade">
                                <p>Vision
                                “In recognition of the challenges of the millennium, a Military sector with modernized equipment, well-trained in all aspects of military operations, fully professionalized, compact and mobile with adequate equipment, fire-power and communications, capable of fulfilling its constitutional responsibilities and performing its international peace-keeping role proudly and efficiently.”
                                Mission
                                “To provide administrative and support services, timely and effectively to enable the Armed Forces of the Federal Republic of Nigeria to build and maintain a modern, compact, strong, professional, mission-capable and mission-ready Armed Forces, for the defence of National territory maritime interest, airspace and the protection and defence of the constitution of the Federal Republic of Nigeria, and to contribute to peace-making and peace-keeping duties worldwide under sub-regional and global organizations of which Nigeria is a member.”</p>
                            </div>
                        </div>
                    </div>
                </div>
                <hr size="30">
            </div>
        </div>
    </div>

</div>




<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<asset:javascript src="jquery.js"/>
<asset:javascript src="pulsone.js"/>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<asset:javascript src="bootstrap.min.js" />
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<asset:javascript src="holder.min.js" />
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

<nav class="navbar navbar-default navbar-fixed-bottom">
    <div class="container">
        <div class="navbar-header">
            <h5>&copy; Copyright 2016. The Smart Gauge All Rights Reserved. <a href="http://www.thesmartgauge.net/Disclaimer/">Disclaimer</a></h5>
        </div>
        <div id="navbar" class="navbar-collapse collapse">

        </div><!--/.nav-collapse -->
    </div>
</nav>
<!-- Login Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Login Form</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="user-name" class="control-label">Username:</label>
                        <input type="text" class="form-control" id="user-name"/>
                    </div>
                    <div class="form-group">
                        <label for="password-text" class="control-label">Password:</label>
                        <input type="text" class="form-control" id="password-text"/>
                    </div>
                    <div class="form-group">
                        <button type="button" class="btn btn-default"> Login </button>
                    </div>
                </form>
            </div>
            %{--<div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>--}%
        </div>

    </div>
</div>

</div>



<!-- Registration Modal -->
<div class="modal fade" id="regModal" role="dialog">
    <div class="modal-dialog" style="width: 75%;">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Registration Form</h4>
            </div>
            <div class="modal-body">
                <form>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="reg-user-name" class="control-label">Username:</label>
                                <input type="text" class="form-control" id="reg-user-name"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="reg-phone-name" class="control-label">Phone:</label>
                                <input type="text" class="form-control" id="reg-phone-name"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="email-text" class="control-label">Email:</label>
                                <input type="text" class="form-control" id="email-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="city-text" class="control-label">City:</label>
                                <input type="text" class="form-control" id="city-text"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="conf-email-text" class="control-label">Confirm Email:</label>
                                <input type="text" class="form-control" id="conf-email-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="state-text" class="control-label">State:</label>
                                <input type="text" class="form-control" id="state-text"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="firstname-text" class="control-label">First Name:</label>
                                <input type="text" class="form-control" id="firstname-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="lga-text" class="control-label">LGA:</label>
                                <input type="text" class="form-control" id="lga-text"/>
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="lastname-text" class="control-label">Last Name:</label>
                                <input type="text" class="form-control" id="lastname-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="dob-text" class="control-label">DOB:</label>
                                <input type="text" class="form-control" id="dob-text"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="website-text" class="control-label">Website:</label>
                                <input type="text" class="form-control" id="website-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="checkbox" class="checkbox"/> Accept our Terms&Conditions
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="reg-password-text" class="control-label">Password:</label>
                                <input type="text" class="form-control" id="reg-password-text"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="reg-confpassword-text" class="control-label">Confirm Password:</label>
                                <input type="text" class="form-control" id="reg-confpassword-text"/>
                            </div>
                        </div>
                    </div>



                    <div class="form-group">
                        <button type="button" class="btn btn-default"> Register </button>
                    </div>
                </form>
            </div>
            %{--<div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>--}%
        </div>

    </div>
</div>

</div>

</body>
</html>
