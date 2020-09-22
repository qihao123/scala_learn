package com.learnscala3

import scala.beans.BeanProperty

object Field {
  def main(args: Array[String]): Unit = {
    //new一个对象
    val user: user = new user
    // 调用属性
    user.name="qh1"

    println(user.name)
    println(user.age)
    println(user.getAge2)
  }
}
//新建类
class user{
  //类属性，可变，底层编程了get和set
  var name:String= "qh"
  //默认值_
  var name1:String= _
  //类属性，不可变，默认只提供了get
  val age:Int= 18

  @BeanProperty
  var age2:Int=17
}