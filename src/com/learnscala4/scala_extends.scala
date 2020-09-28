package com.learnscala4

import com.learnscala3.Person

object scala_extends {
  def main(args: Array[String]): Unit = {
    //如果父类存在有参构造方法，那么子类构建对象时，必须显示调用父类的有参构造方法
    //如果需要子类的参数传递给父类的构造方法
    val user: user = new user("qh1")

  }
}
class person(name:String){
  println(name)
  def this(){
    this("qh3")
    println("111")
  }
}
class user(name:String) extends person("qh"){
  println(name)

  def this(){
    this("qh2")
    println("222")
  }
}
