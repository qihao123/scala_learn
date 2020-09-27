package com.learnscala4

object scalaclassmethod {
  def main(args: Array[String]): Unit = {
    val user:user = new user
  }
}
//主构造器
class user(){
  //构造体
  println(" new user1")
  //不是构造器
  def user():Unit={
    println("new user")
  }
}
