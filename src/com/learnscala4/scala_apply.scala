package com.learnscala4

object scala_apply {
  def main(args: Array[String]): Unit = {
    //通过伴生对象的apply方法，实现不使用new方法创建对象
    //如果想让主构造器变成私有的，可以在（）前加上private
    //apply方法可以重载
    //scala中obj的语句实际是在调用该对象的apply方法，即obj。apply（org），用以统一面向对象编程和函数式编程的风格
    //当使用new关键字创建对象时，调用的其实是类的构造方法，当直接使用类名构建对象时，调用的其实是伴生对象apply的方法
    user
  }
}
class user private(name:String){
  def this(){
    this("zhangsan1")
  }
}
object user{
  def apply(name: String): user = new user(name="zhangsan")

  def apply(): user = new user(name="zhangsan")
}