package com.learnscala4

object sigobj {
  def main(args: Array[String]): Unit = {
    //单例对象（伴生对象）采用object关键字声明
    //单例对象（伴生对象）对应的类称之为伴生类，伴生对象的名称应该和伴生类名一致。
    //单例对象（伴生对象）中的属性和方法都可以通过伴生对象名，直接调用访问
    println(user.name)

  }
}
//伴生对象
object user{
  var name:String="zhangsan"
}
//伴生类
class user{
  var age:Int=18
}
