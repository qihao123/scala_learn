package com.learnscala4

object scalaclassmethd2 {
  def main(args: Array[String]): Unit = {
    //柱构造方法：主要进行类的初始化，所以在类名后的构造方法为主构造方法
    //辅助构造器：函数的名称this，可以有多个，编译器通过参数的个数来区分
    //辅助构造方法不能直接构建对象，必须直接或者间接调用柱构造方法
    //构造器调用其他另外的构造器，要求被调用构造器必须提前声明
    val user:user= new user()

  }
}
//主构造器
class user(name: String){
  //辅助构造器
  def this(){
    this("zhangsan")
  }
  def this(age:Int){
    this()
    //this("zhangsan")
  }
}
