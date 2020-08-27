package com.learnscala

object Variable_Declaration {
  def main(args: Array[String]): Unit = {
    //变量声明学习
    //声明变量时必须有初始值
    //一个变量可以由var或者val来声明，var修饰的变量可以改变，val修饰的变量不可改变
    var i:Int = 1
    val j:Int = 2
    println(i)
    println(j)
    println(i+1)
    println(j++)
  }
}
