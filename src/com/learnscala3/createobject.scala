package com.learnscala3

object createobject {
  def main(args: Array[String]): Unit = {
    //p1是var修饰的，p1的属性可以变p1本身也可以变
    var p1:Person = new Person()
    p1.name="dalang"
    p1=null
    val p2:Person = new Person()
    //p2是val修饰的，那么p2本身不可变，但是属性可以变
    p2.name="jinlian"
    //p2=null就是非法的了
  }
}
class Person{
  var name:String="none"
}
