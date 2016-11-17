<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" >
            <div class="row" >
                <div class="col-md-12 col-md-offset-1">
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
                    <img src="../images/${sd?.imageName}" style="height: 200px;width: 200px">
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
                            <h3>${sd?.fullName}</h3>
                            <p>${sd?.ministryDesignation}</p>
                        </div>
                        <div id="menu1" class="tab-pane fade">
                            <p>${sd?.bio}</p>
                        </div>
                        <div id="menu2" class="tab-pane fade">
                            <p>${sd?.mandate}</p>
                        </div>
                    </div>
                </div>
            </div>
            <hr size="30">
        </div>
    </div>
</div>