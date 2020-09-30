package com.learnscala4

object abstract_base2 {
  //如果父类为抽象类，那么子类需要将抽象的属性和方法实现，否则子类也需声明为抽象类
  //重写非抽象类方法和属性需要用override修饰，重写抽象方法和属性则可以不加override
  var user = new user{
    override var name: String = "zhangsan"

    override def test(): Unit = {
      println("test")
    }
  }
  user.name
  user.age
}

abstract class person{
  //抽象属性
  var name:String
  //抽象方法
  def test():Unit

  var age:Int = 18

  def test1():Unit={
    println("test1")
  }
}

class user extends person{
  var name:String="zhangsan"

  def test(): Unit = {}

  override var age:Int=18
  override def test1(): Unit = super.test1()
}
