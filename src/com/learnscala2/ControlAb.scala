package com.learnscala2

object ControlAb {
  def main(args: Array[String]): Unit = {
    //抽象控制，值调用，把计算后的值传递
    def f=()=>{
      println("f...")
      10
    }
    foo(f())
    //名调用，把代码传递过去
    foo1(f())
  }
  def foo(a: Int):Unit={
    println(a)
    println(a)
  }
  def foo1(a: =>Int):Unit={
    println(a)
    println(a)
  }
}
