package controllers


import play.api.mvc._
import play.api.routing.JavaScriptReverseRouter


class JavaScriptController extends Controller{

  def javascriptRoutes = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.CountController.count,
        routes.javascript.HomeController.index,
        routes.javascript.HomeController.signUp,
        routes.javascript.HomeController.signIn,
        routes.javascript.SignUpController.addAccount,
        routes.javascript.SignInController.signInForm
      )
    ).as("text/javascript")
  }

}
