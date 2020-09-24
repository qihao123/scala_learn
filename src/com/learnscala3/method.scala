package com.learnscala3

object method {
  def main(args: Array[String]): Unit = {
    val user:user=new user
    user.test()
    user.test("test")
  }
}

class user{
  def test():Unit={
    println("test")
  }
  def test(name: String):Unit={
    println(name)
  }
}