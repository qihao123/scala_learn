package com.learnscala2

object SimpleRule {
  def main(args: Array[String]): Unit = {
    //函数至简原则
    /*
    1、return可以省略，Scala会使用函数体的最后一行代码作为返回值
    2、如果函数体只有一行代码，可以省略花括号
    3、返回值类型如果能过推断出来，那么可以省略
    4、如果有return，则不能省略返回值类型
    5、如果函数明确声明Unit，那么即使函数体中使用return关键字也不起作用
    6、scala如果期望是无返回值的类型，可以省略等号
    7、如果函数无参数，但是申明了参数列表，那么调用时，小括号，可加可不加
    8、如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    9、如果不关心名称，只关心逻辑处理，那么函数名可以省略
     */
    def f1(name:String):String={
      name + "1"
    }
    def f2(name:String):String = name+"1"
    //def f3(name:String) = name + "1"
    //println(f3("1"))
    def f4(name:String):String=return name + "1"
    //def f5(name:String):Unit=return name + "1"
    def f6(name:String){name + "1"}
    def f7(){"1"}
    //def f8{"1"}



  }


}
