package com.learnscala2

object function {
  def main(args: Array[String]): Unit = {
    //调用函数
    println(sum(1,2))
  }
  //定义的是函数不是方法，未完成某一功能搞得程序语句集合叫函数，类中的函数称为方法
  //函数没有重载和重写的概念；方法可以，scala中函数可以嵌套定义
  def sum(x:Int,y:Int):Int ={
    x+y
  }
  def a(args:Array[String]):Unit={
    def b(x:Int):Unit={
      println(x)
    }
    b(1)
  }
  //定义函数
}
