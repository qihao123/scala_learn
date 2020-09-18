//面向对象
//包
package com.learnscala3
//伴生对象
object objectclass {
  //
  def main(args: Array[String]): Unit = {
    val User: User= new User()

    println(User.name)
    println(User.Login())
  }
  class User{
    var name:String = "abc"
    def Login(): Unit= {
      println("login seccessed")
    }
  }
}
