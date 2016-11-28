<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" >
            <div class="row" >
                <div class="col-md-12">
                    <h2 style="float: left;">${sd?.ministryDesignation}</h2>
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
                    <img class="img-circle" src="../images/${sd?.imageName}" style="height: 200px;width: 200px">
                </div>
                <div class="col-md-1">&nbsp;</div>
                <div class="col-md-7"  style="background-color: #e7e4e4; opacity: 0.9; color: black; border-radius: 5px;min-height: 200px;">
                    <ul class="nav nav-tabs">
                        <li class="active"><a data-toggle="tab" href="#home">&nbsp;</a></li>
                        <li><a data-toggle="tab" href="#menu1">Bio</a></li>
                        <li><a data-toggle="tab" href="#menu2">Mandate</a></li>
                    </ul>
                    <div class="tab-content">
                        <div id="home" class="tab-pane fade in active">
                            <h3>${sd?.fullName}</h3>
                            <p>${sd?.ministryDesignation}</p>
                        </div>
                        <div id="menu1" class="tab-pane fade">
                            <p id="stateBio">${sd?.bio}</p>
                        </div>
                        <div id="menu2" class="tab-pane fade">
                            <p id="stateMandate">${sd?.mandate}</p>
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
            Education : How would you rate the educational system in the state such as learning environment, qualified teachers, affordability school fees etc.<br/>
            <img src="../images/ic_star_outlined_1x_2.png"><img src="../images/ic_star_orange_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            Transportation: How would you rate the transportation system such as roads & traffic management, safety etc<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            Security : How would you rate the security in the state such as Protection of life and property, arm robbery, emergency response etc<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            Infrastructure: How would you rate Infrastructure and progressive development of the states such as roads, telecommunication, electricity, water etc<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
        <div class="col-sm-12 col-md-12" >
            Jobs/Welfare: How would you rate the governor in provision of Jobs and empowerment programs such as creation of jobs and benefit program.<br/>
            <img src="../images/ic_star_outlined_1x_2.png">
        </div>
    </div>
</div>