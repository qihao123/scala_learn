package com.learnscala3

object method {
  def main(args: Array[String]): Unit = {
    val user2:user2=new user2
    user2.test()
    user2.test("test")
  }
}

class user2{
  def test():Unit={
    println("test")
  }
  def test(name: String):Unit={
    println(name)
  }
}