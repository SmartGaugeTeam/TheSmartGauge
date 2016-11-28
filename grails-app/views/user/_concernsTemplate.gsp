<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" >
            <div class="row" >
                <div class="col-md-12">
                    <h2 style="float: left;"> Concerns</h2>
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
                <div class="col-sm-12 col-md-12 jumbotron" style="margin-left:10%;width: 80%;">
                    <legend>CONCERN SECTION</legend>
                    <h4>Please fill the form below with adequate details and we will verify accordingly and get back to you for further directives.</h4>
                    <h4>However, we do thorough check and verification to ascertain the authenticity of the information received for this reason it would take a period of 7-14 business days to get back to you on the next line of action.</h4>
                    <hr size="30">
                    <a href="#">Click below to Fill and Submit the Concern Form</a></br></br>
                    <a class="btn btn-lg btn-primary" data-toggle="modal" data-target="#concernForm" role="button">Concern Form</a>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="concernForm" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Concern Form</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="user-name" class="control-label">Your Name (required)</label>
                        <input type="text" class="form-control" id="user-name"/>
                    </div>
                    <div class="form-group">
                        <label for="user-email" class="control-label">Your Email (required)</label>
                        <input type="text" class="form-control" id="user-email"/>
                    </div>
                    <div class="form-group">
                        <label for="phone" class="control-label">Your Phone No</label>
                        <input type="text" class="form-control" id="phone"/>
                    </div>
                    <div class="radio">Select Category (required)<br/>
                        <label class="radio-inline"><input type="radio" name="category">Federal</label>
                        <label class="radio-inline"><input type="radio" name="category">State</label>
                        <label class="radio-inline"><input type="radio" name="category">Private</label>
                    </div>
                    <div class="form-group">
                        <label for="subject" class="control-label">Subject</label>
                        <input type="text" class="form-control" id="subject"/>
                    </div>
                    <div class="form-group">
                        <label for="msg" class="control-label">Your Message</label>
                        <textarea class="form-control" rows="5" id="msg"></textarea>
                    </div>
                    <input type="file" name="attachment" style="margin:10px;"/>
                    <div class="form-group">
                        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="validateConcerns()"> Send </button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
