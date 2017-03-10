package controllers

import com.google.inject.Inject
import play.api.mvc.{Action, Controller}
import services.CacheListService


class SignInController@Inject()(service:CacheListService) extends Controller{

  def signInForm(uname:String)=Action{ implicit request =>
  /*  signInForm.bindFromRequest.fold(
      formWithErrors => {
        Redirect(routes.SignInController.signInForm()).flashing(
          "error" -> "Something went Wrong Please Try Again")
      },
      userData => {

        val flag:Boolean=service.check(userData.uname)
        if(flag)
          Redirect(routes.HomeController.profile()).withSession(
            "username" -> userData.uname)
        else {
          Redirect(routes.SignInController.signInForm()).flashing(
            "error" -> "UserName Or Password is wrong Please Try Again!!")

        }
      }
    )*/
    val flag:Boolean=service.check(uname)
    if(flag){
    val usedData=service.userData(uname).get
    Ok(views.html.profilePage(usedData))}
    else Ok(views.html.main())
  }

}
