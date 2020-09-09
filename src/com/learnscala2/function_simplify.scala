package com.learnscala2

object function_simplify {
  def main(args: Array[String]): Unit = {
    //函数可以作为值进行传递
    //val f1 = foo()
    val f2 = foo
    //后面接 _表示把函数当做一个整体，赋值给变量f3
    val f3 = foo _
    foo()
    f3()
  }
  def foo():Int={
    println("this is foo")
    1
  }
}
