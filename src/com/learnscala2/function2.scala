package com.learnscala2

object function2 {
  //函数作为参数传递
  def main(args: Array[String]): Unit = {
    //定义了一个函数，函数参数就是一个函数签名；f表示输入函数名称；（Int，Int）表示输入两个Int参数；Int表示函数返回值
    def f1(f: (Int,Int)=>Int): Int={
      f(2,4)
    }
    //定义一个函数，参数和返回值类型和f1的输入参数一致
    def add(a: Int,b : Int):Int = a + b
    //将add函数作为参数和返回值类型和f1函数，如果能够推断出来不是调用， ——可以省略
    println(f1(add))
    println(f1(add _))

  }
}
