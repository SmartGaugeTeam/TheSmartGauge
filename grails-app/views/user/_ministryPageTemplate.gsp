<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" >
            <div class="row" >
                <div class="col-md-12">
                    <h2 style="float: left;">${md?.ministryDesignation}</h2>
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
                    <img class="img-circle" src="../images/${md?.imageName}" style="height: 200px;width: 200px">
                </div>
                <div class="col-md-1">&nbsp;</div>
                <div class="col-md-7"  style="background-color: #e7e4e4; opacity: 0.9; color: black;border-radius: 5px;min-height: 200px;">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#home">&nbsp;</a></li>
                        <li><a data-toggle="tab" href="#menu1">Bio</a></li>
                        <li><a data-toggle="tab" href="#menu2">Mandate</a></li>
                    </ul>
                    <div class="tab-content">
                        <div id="home" class="tab-pane fade in active">
                            <h3>${md?.fullName}</h3>
                            <p>${md?.ministryDesignation}</p>
                        </div>
                        <div id="menu1" class="tab-pane fade">
                            <p id="minBio1">${md?.bio}</p>
                        </div>
                        <div id="menu2" class="tab-pane fade">
                            <p id="minMandate">${md?.mandate}</p>
                        </div>
                    </div>
                </div>
            </div>
            <hr size="30">
        </div>
    </div>
</div>

<div class="container-fluid" style="padding-bottom:20px; ">
    <div class="row" style="background-color: #e7e4e4; opacity: 0.9; border-radius: 5px; color: black; margin-left: 10px;margin-right: 10px;">
        <div class="col-sm-12 col-md-12" >
            ${md?.q1} <br/>
            <img src="../images/ic_star_outlined_1x_2.png"><img src="../images/ic_star_orange_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            ${md?.q2}<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            ${md?.q3}<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            ${md?.q4}<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            ${md?.q5}<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
    </div>
</div>

%{--
<div class="container-fluid" >
    <div class="row" style="background-color: #e7e4e4; opacity: 0.9; color: black; margin-left: 10px;margin-rightt: 10px;">
        <div class="col-sm-12 col-md-12" >

        </div>
    </div>
</div>
--}%
