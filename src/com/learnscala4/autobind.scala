package com.learnscala4

object autobind {
  def main(args: Array[String]): Unit = {
    val user: user = new user

    val user1:person = new user
    user.say()
    user1.say()

  }
}
abstract class person{
  val age:Int =18
  def say():Unit={
    println("say person")
  }
}
class user extends person{
  override val age: Int = 20
  override def say():Unit={
    println("say user")
  }

}
