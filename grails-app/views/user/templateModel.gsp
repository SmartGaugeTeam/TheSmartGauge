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

    <asset:javascript src="jquery.js"/>
    <asset:javascript src="pulsone.js"/>
    <asset:javascript src="smartGauge.js"/>
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><asset:javascript src="ie8-responsive-file-warning.js"></asset:javascript><![endif]-->
    <asset:javascript src="ie-emulation-modes-warning.js"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        $(document).ready(function() {
            jQuery.ajax({
                cache: false,
                url:    baseURL+'/user/homeTemplate',
                contentType: 'application/json; charset=utf-8',
                success: function(response) {
                    $('#activeTemplate').html(response);
                }
            });
        });

        function loadHomePage(){
            jQuery.ajax({
                cache: false,
                url:    baseURL+'/user/homeTemplate',
                contentType: 'application/json; charset=utf-8',
                success: function(response) {
                    $('#activeTemplate').html(response);
                }
            });
        }

        function loadAboutTSG(){
            jQuery.ajax({
                cache: false,
                url:    baseURL+'/user/aboutTsgTemplate',
                contentType: 'application/json; charset=utf-8',
                success: function(response) {
                    $('#activeTemplate').html(response);
                }
            });
        }
        function loadMinisterPage(mstName){
            jQuery.ajax({
               cache: false,
               url: baseURL+'/user/ministerTemplate?mstName='+mstName,
               contentType: 'application/json; charset=utf-8',
                success: function(response){
                    $('#activeTemplate').html(response);
                    var $log = $( "#minBio1" ),
                            str = $( "#minBio1").text(),
                            html = $.parseHTML( str );
                    $( "#minBio1").text("");
                    $log.append( html );
                    var $log1 = $( "#minMandate" ),
                            str1 = $( "#minMandate").text(),
                            html1 = $.parseHTML( str1 );
                    $( "#minMandate").text("");
                    $log1.append( html1 );
                }
            });
        }
        function loadConcernsTemplate(){
            jQuery.ajax({
                cache: false,
                url: baseURL+'/user/concernsTemplate',
                contentType: 'application/json; charset=utf-8',
                success: function(response){
                    $('#activeTemplate').html(response);
                }
            });
        }
        function loadContactsTemplate(){
            jQuery.ajax({
                cache: false,
                url: baseURL+'/user/contactsTemplate',
                contentType: 'application/json; charset=utf-8',
                success: function(response){
                    $('#activeTemplate').html(response);
                }
            });
        }

        function loadStatePage(stName){
            jQuery.ajax({
                cache: false,
                url: baseURL+'/user/stateTemplate?stateName='+stName,
                contentType: 'application/json; charset=utf-8',
                success: function(response){
                    $('#activeTemplate').html(response);
                    var $log2 = $( "#stateBio" ),str = $( "#stateBio").text(),html = $.parseHTML( str );
                    $( "#stateBio").text("");
                    $log2.append( html );
                    var $log3 = $( "#stateMandate" ), str1 = $( "#stateMandate").text(), html1 = $.parseHTML( str1 );
                    $( "#stateMandate").text("");
                    $log3.append( html1 );
                }
            });
        }
    function userLogin(){
        var formData = {userName:$("#user-name").val(),password:$("#password-text").val()};
        $.ajax({
            url : baseURL+"/user/userSystemLogin",
            type: "POST",
            data : formData,
            success: function(data, textStatus, jqXHR)
            {
                alert(data);
            }
        });
    }

    function userRegistration(){
        var formData = {userName: $("#reg-user-name").val(), phone: $("#reg-phone-name").val(), email: $("#email-text").val(), city: $("#city-text").val(), state: $("#state-text").val(), firstName: $("#firstname-text").val(), lga: $("#lga-text").val(), lastName: $("#lastname-text").val(), dob: $("#dob-text").val(), website: $("#website-text").val(), password: $("#reg-password-text").val()};
        $.ajax({
            url : baseURL+'/user/userSystemRegistration',
            type: "POST",
            data: formData,
            success: function(data, textStatus, jqXHR)
            {
                alert(data);
            }
        })
    }

    </script>
    <style>
    .successfully-saved.hide-opacity{
        opacity: 0;
    }

    .img-circle {
        border-radius: 50%;
    }

    .successfully-saved {
        color: #FFFFFF;
        text-align: center;

        -webkit-transition: opacity 3s ease-in-out;
        -moz-transition: opacity 3s ease-in-out;
        -ms-transition: opacity 3s ease-in-out;
        -o-transition: opacity 3s ease-in-out;
        opacity: 1;
    }
    </style>
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
                <li><a href="#" onclick="loadHomePage()">HOME</a></li>
                <li><a href="#" onclick="loadAboutTSG();">ABOUT TSG</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">FEDERAL <span class="caret"></span></a>
                    <ul class="dropdown-menu" style="height: 250px;overflow: scroll;" >
                        <li><a href="#" onclick="loadMinisterPage('MD');">Minister of Defence</a></li>
                        <li><a href="#" onclick="loadMinisterPage('ME');">Minister of Education</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MEV');">Minister of Environment</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MF');">Minister of Finance</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MFA');">Minister of Foreign Affairs</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MH');">Minister of Health</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MI');">Minister of Information</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MIT');">Minister of Interior</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MJ');">Minister of Justice &amp; Attorney-General</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MN');">Minister of Niger Delta</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MST');">Minister of Science and Technology</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MSM');">Minister of Solid Minerals</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MSA');">Minister of State, Aviation</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MP');">Minister of Power, Works and Housing</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MB');">Minister of Budget &amp; National Planning</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MTI');">Minister of Trade, Investment &amp; Industry</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MC');">Minister of Communication</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MFCT');">Minister FCT</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MA');">Minister of Agriculture</a></li>
                        <li><a href="#" onclick="loadMinisterPage('ML');">Minister of Labour &amp; Employment</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MT');">Minister of Transportation</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MYS');">Minister for Youth and Sports</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MWR');">Minister of Water Resources</a></li>
                        <li><a href="#" onclick="loadMinisterPage('MWA');">Minister of Women Affairs</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">STATE <span class="caret"></span></a>
                    <ul class="dropdown-menu" style="height: 250px;overflow: scroll;">
                        <li><a href="#" onclick="loadStatePage('AB');">Abia</a></li>
                        <li><a href="#" onclick="loadStatePage('AD');">Adamawa</a></li>
                        <li><a href="#" onclick="loadStatePage('AI');">Akwa Ibom</a></li>
                        <li><a href="#" onclick="loadStatePage('AS');">Anambra State</a></li>
                        <li><a href="#" onclick="loadStatePage('BA');">Bauchi</a></li>
                        <li><a href="#" onclick="loadStatePage('BY');">Bayelsa</a></li>
                        <li><a href="#" onclick="loadStatePage('BE');">Benue</a></li>
                        <li><a href="#" onclick="loadStatePage('BO');">Borno</a></li>
                        <li><a href="#" onclick="loadStatePage('CR');">Cross River</a></li>
                        <li><a href="#" onclick="loadStatePage('De');">Delta</a></li>
                        <li><a href="#" onclick="loadStatePage('EB');">Ebonyi</a></li>
                        <li><a href="#" onclick="loadStatePage('ED');">Edo</a></li>
                        <li><a href="#" onclick="loadStatePage('EK');">Ekiti</a></li>
                        <li><a href="#" onclick="loadStatePage('EN');">Enugu</a></li>
                        <li><a href="#" onclick="loadStatePage('GO');">Gombe</a></li>
                        <li><a href="#" onclick="loadStatePage('IM');">Imo</a></li>
                        <li><a href="#" onclick="loadStatePage('JI');">Jigawa</a></li>
                        <li><a href="#" onclick="loadStatePage('KA');">Kaduna</a></li>
                        <li><a href="#" onclick="loadStatePage('KN');">Kano</a></li>
                        <li><a href="#" onclick="loadStatePage('KT');">Katsina</a></li>
                        <li><a href="#" onclick="loadStatePage('KB');">Kebbi</a></li>
                        <li><a href="#" onclick="loadStatePage('KO');">Kogi</a></li>
                        <li><a href="#" onclick="loadStatePage('KW');">Kwara</a></li>
                        <li><a href="#" onclick="loadStatePage('LA');">Lagos</a></li>
                        <li><a href="#" onclick="loadStatePage('NA');">Nasarawa</a></li>
                        <li><a href="#" onclick="loadStatePage('NI');">Niger</a></li>
                        <li><a href="#" onclick="loadStatePage('OG');">Ogun</a></li>
                        <li><a href="#" onclick="loadStatePage('ON');">Ondo</a></li>
                        <li><a href="#" onclick="loadStatePage('OS');">Osun</a></li>
                        <li><a href="#" onclick="loadStatePage('OY');">Oyo</a></li>
                        <li><a href="#" onclick="loadStatePage('PL');">Plateau</a></li>
                        <li><a href="#" onclick="loadStatePage('RI');">Rivers</a></li>
                        <li><a href="#" onclick="loadStatePage('SO');">Sokoto</a></li>
                        <li><a href="#" onclick="loadStatePage('TA');">Taraba</a></li>
                        <li><a href="#" onclick="loadStatePage('YO');">Yobe</a></li>
                        <li><a href="#" onclick="loadStatePage('ZA');">Zamfara</a></li>
                    </ul>
                </li>
                <li><a href="#" onclick="loadConcernsTemplate()">CONCERNS</a></li>
                <li><a href="#" onclick="loadContactsTemplate()">CONTACT US</a></li>
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
    <p id="success" style="display: none">Successfullly Saved details...</p>
    <div id="activeTemplate">
    </div>
</div>




<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
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
        <div class="modal-content" style="margin-top: 15%;">
            <div class="modal-header" style="background-color: #e5e5e5;border-radius: 5px;">
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
                        <input type="password" class="form-control" id="password-text"/>
                    </div>
                    <div class="form-group">
                        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="userLogin();"> Login </button>
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
                        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="userRegistration();"> Register </button>
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
