package controllers

import _root_.model.Accounts
import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import services.CacheListService


class SignUpController @Inject()(service:CacheListService) extends Controller {

  /*val regForm: Form[Accounts] = Form {
    mapping(
      "fname" -> nonEmptyText,
      "uname" -> email,
      "password" -> nonEmptyText,
      "repassword" -> nonEmptyText,
      "dateOfBitrh" -> nonEmptyText,
      "gender" -> nonEmptyText
    )(Accounts.apply)(Accounts.unapply).verifying("Password do not match", fields =>
      fields match {
        case data => data.password == data.repassword
      })
  }*/

  def addAccount(lname: String, uname: String,
                 password: String, repassword: String, dateOfBitrh: String, gender: String) = {
    Action { implicit request =>

      val userData = Accounts(lname, uname, password, repassword, dateOfBitrh, gender)
      if (!service.check(userData.uname)) {
        service.addUser(userData)
        Ok(views.html.profilePage(userData))
      }
      else {
        Ok(views.html.formSignUp())
      }
    }

  }
}
