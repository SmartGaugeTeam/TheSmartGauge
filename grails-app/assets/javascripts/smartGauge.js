baseURL = "http://localhost:8080/theSmartGuage";
function validateConcerns(){
    /*if ($('#user-name').val() && $('#user-email').val()){*/
        jQuery.ajax({
            cache: false,
            url: baseURL+'/user/saveConcerns?userName='+$('#user-name').val()+'email'+$('#user-email').val()+'phone'+$('#phone').val()+'category'+$('#category').val()+'subject'+$('#subject').val()+'msg'+$('#msg').val(),
            contentType: 'application/json; charset=utf-8',
            success: function(response){
                $('#concernForm').dialog("close");
                $('#activeTemplate').html(response);
                $("#success").fadeIn();
                $("#success").fadeOut("slow");
            }
        });
    /*}*/
}