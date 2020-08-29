package com.learnscala

import scala.io.StdIn

object CharInput {
  def main(args: Array[String]): Unit = {
    //输入姓名
    println("input name:")
    var name = StdIn.readLine()
    //输入年龄
    println("input age:")
    var age = StdIn.readLine()
    //打印
    printf("name:%s,age:%s", name, age)
  }
}
