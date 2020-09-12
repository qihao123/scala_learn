package com.learnscala2

object function3 {
  def main(args: Array[String]): Unit = {
    def f1() = {
      println("f1")
      def f2(s:String) = {
        println(s + "f2")
      }
      f2 _
    }

    val f = f1()
    //因为f1函数的返回值依然为函数，所以可以变量f可以作为函数继续调用
    f("")
    //上面代码可以简化为
    f1()("")
  }
}
