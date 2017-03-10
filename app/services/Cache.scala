package services

import model.Accounts


trait Cache {

  def addUser(user: Accounts): String

  def userData(username: String): Option[Accounts]

  def check(name: String): Boolean
}
