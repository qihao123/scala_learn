package com.learnscala3

object scalaPower {
  def main(args: Array[String]): Unit = {
    //1、scala中属性和方法的默认访问权限为public，但是scala中无public关键字
    //2、private为私有权限，只在类的内部和伴生对象中可用
    //3、private【包名】，包访问权限，包下的其他类也可以使用
    //4、protected为受保护权限。scala中保护权限比java更严格。同包无法访问，同类，子类可以
    val user: user = new user
    println(user.name)
    user.email
  }
}
class user{
  var name:String="qh"
  private var age:Int=18
  private[learnscala3] var email:String="qh@qh.com"
  protected var sex:String="f"
  def test():Unit={
    println(age)
    println(sex)
  }
}
object user{
  def main(args: Array[String]): Unit = {
    val user:user=new user
    println(user.age)
  }
}
class person extends user{
  println(sex)
}