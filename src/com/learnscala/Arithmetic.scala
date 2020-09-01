package com.learnscala

object Arithmetic {
  def main(args: Array[String]): Unit = {
    //对于除号。他的整数除和小数除是有区别的：整数之间做除法时，只保留整数部分而舍弃小数部分
    var r1:Int = 10 /3
    println("r1=" + r1)

    var r2:Double=10/3
    println("r2=" + r2)

    var r3:Double=10.0/3
    println("r3=" + r3)
    println("r3=" + r3.formatted("%.2f"))

    var r4 = 10 &3
    println("r4=" + r4)

    val s:String="abc"
    val s1:String= new String("abc")

    println(s == s1) //t
    println(s.eq(s1)) //f
    //无++。--运算符

    var i:Int = 1.+(1) //运算符本质

  }
}
