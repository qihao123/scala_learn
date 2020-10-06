package com.learnscala4

object scala_trait3 {
  def main(args: Array[String]): Unit = {
   val mysql:mysql =new mysql
    mysql.op()
    //打印log DB OP
  }
}
trait operate{
  def op():Unit={
    println("operate")
  }
}
trait DB extends operate{
  override def op(): Unit = {
    println("DB")
    super.op()
  }
}
trait Log extends operate{
  override def op(): Unit = {
    println("log")
    super.op()
  }
}
class mysql extends DB with Log{

}
