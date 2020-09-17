package com.learnscala2

object lazyfunc {
    //惰性函数
  def main(args: Array[String]): Unit = {
    //当函数返回值被声明为lazy时，函数的执行将被推迟，直到首次对此取值，该函数才会执行
    lazy val res = sum(10,30)
    println("-------------------")
    println("res=" + res)
  }
  def sum(n1:Int,n2:Int):Int={
    println("sum be excute...")
    return n1 + n2
  }
}
