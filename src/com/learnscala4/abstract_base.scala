package com.learnscala4

object abstract_base {
  //抽象类：使用abstract关键字声明的类
  //一个属性没有初始化，就是抽象属性
  //只声明而没有实现的方法，就是抽象方法
  //如果一个类为抽象类，那么属性和方法不是必须为抽象属性，抽象方法
  //抽象类是无法做实例化操作的
  var user = new user{
    override var name: String = "zhangsan"

    override def test(): Unit = {
      println("test")
    }
  }
  user.name
  user.age
}

abstract class user{
  //抽象属性
  var name:String
  //抽象方法
  def test():Unit

  var age:Int = 18

  def test1():Unit={
    println("test1")
  }
}