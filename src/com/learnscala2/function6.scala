package com.learnscala2

object function6 {
  def main(args: Array[String]): Unit = {
    var a: Int=10

    def f1()={
      def f2(b:Int)={
        a+b
      }
      f2 _
    }
    //调用时，f1函数执行完毕后，局部变量a应该随着栈空间释放掉
    val f = f1()
    //但是在此处，变量a其实并没有释放，而是包含了f2函数的内部，形成了闭合环境
    println(f(3))

    //函数柯里化
    def f3(c: Int,b: Int)={
      a + b + c
    }
    def f4(c: Int)(b: Int)={
      a + b + c
    }
    println(f3(2,3))
    println(f4(1)(2))
  }
}
