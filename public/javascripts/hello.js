if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
};

$(document).ready(function(){


         $('#btn').on("click",function(){
         jsRoutes.controllers.HomeController.signUp().ajax({
                      success: function(data){
                        $('#body').html(data);
                      },
                      error: function(){
                      $('#body').html("hello");
                      alert("fail")
                    }

          })



      })

      $('#btn1').on("click",function(){
                jsRoutes.controllers.HomeController.signIn().ajax({
                            success: function(data){
                              $('#body').html(data);
                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })

            $('#signUp').on("click",function(){
            /*alert("clicked")*/
                var url=jsRoutes.controllers.SignUpController.addAccount($('#lname').val,$('#uname').val,
                $('#password').val,$('#repassword').val,$('#dateOfBitrh').val,$('#gender').val)
                console.log("clicked")
                url.ajax({
                            success: function(data){
                              $('#body').html(data);
                              alert(data)
                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })

});

