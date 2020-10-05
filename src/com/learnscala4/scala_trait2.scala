package com.learnscala4

object scala_trait2 {
  def main(args: Array[String]): Unit = {
     new user1
  }
}

trait trait111{
  println("111")
}
trait trait222 extends trait111{
  println("222")
}
trait trait333{
  println("333")
}
class person1 extends trait333{
  println("person")
}
class user1 extends person1 with trait222 with trait333{
  println("user")
}

//执行顺序，333，person，111,222，user
//trait不会再次初始化