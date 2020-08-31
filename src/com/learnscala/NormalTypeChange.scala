package com.learnscala

object NormalTypeChange {
  //普通类型转换
  def main(args: Array[String]): Unit = {
    /*
    1、自动提升原则：首先将自动把所有数据类型转换成精度大的那种类型
    2、吧精度大的数值类型赋值给精度小的数值类型时，就会报错
    3、byte、short和char之间不会互相自动转换
    4、byte，short，char三者可以计算，在计算时先转为int 4不过    类型
     */
    var a:Int = 2
    var b:Double = 2
    var c:Char = 's'
    var d:Byte = 'b'
    var e:Short = 2
    var f:Int = 2.7.toInt
    var g:String="100.1"
    println(g.toDouble)


  }
}
