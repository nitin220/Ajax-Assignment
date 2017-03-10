package controllers


import play.api._
import play.api.mvc._



class HomeController  extends Controller {


  def index = Action {
    Ok(views.html.main())
  }

  def signUp=Action{
    Ok(views.html.formSignUp())
  }

  def signIn=Action{
    Ok(views.html.formSignIn())
  }


}
