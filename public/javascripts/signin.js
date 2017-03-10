$(document).ready(function(){

 $('#signin').on("click",function(){

                console.log($('#fname').val())
                console.log("clicked")
                jsRoutes.controllers.SignInController.signInForm($('#uname').val()).ajax({
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