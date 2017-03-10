 $(document).ready(function(){

 $('#signUp').on("click",function(){
            /*alert("clicked")*/
                console.log($('#fname').val())
                console.log("clicked")
                jsRoutes.controllers.SignUpController.addAccount($('#fname').val(),$('#uname').val(),
                                $('#password').val(),$('#repassword').val(),$('#dateOfBitrh').val(),$('#gender').val()).ajax({
                            success: function(data){
                              $('#body').html(data);

                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })
$('#logout').on("click",function(){

                console.log("clicked")
                jsRoutes.controllers.HomeController.index().ajax({
                            success: function(data){
                              $('#body').html(data);

                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })

});
