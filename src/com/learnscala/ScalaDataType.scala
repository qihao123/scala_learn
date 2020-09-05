package com.learnscala

import scala.collection.immutable.StringOps

object ScalaDataType {
  def main(args: Array[String]): Unit = {
    //scala中一切数据都是对象
    //scala中数据类型分为两大类：数值类型、引用类型（都是对象）
    //scala类型仍然遵守，低精度类型向高精度类型，自动转换（隐式转换）
    //scala中的StringOps是对java中String增强
    //Unit对应java中的void，用于方法返回值的位置，表示方法没有返回值。Unit是一个数据类型，只有一个对象是（）。void不是数据类型，只是一个关键字
    //Null是一个类型，只有一个对象就是null。它是所有引用类型（AnyRef）的子集
    //Nothing是所有数据类型的子类，只要用在一个函数没有明确返回值时使用。
    //var cat: Cat = new Cat()
    //cat = null
    //var i :Int=null
    //println(i)
    //def test():Nothing={
    //  throw new Exception
    //}
    //println(test())
    var a:Int=1
    var b:Double=1.0
    var c:Float=1
    //var d:Boolean=null
    var e:Byte=1
    var f:Short=1
    var g:Long=1
    var h:StringOps="abc"
    //var i:Unit=1
    //var j:Char=null
  }
}
