package com.learnscala2

object function4 {
  def main(args: Array[String]): Unit = {
    //匿名函数
    //1、参数的类型可以省略，会根据形参进行自动的推导
    //2、类型省略之后，发现只有一个参数，则圆括号可以省略，其他情况：没有参数和参数超过1的永远不能省略圆括号
    //3、匿名函数如果只有一行，则大括号也可以省略
    //4、如果参数只出现一次，则参数省略且后面参数可以用_代替

    //定义函数
    def f(arr: Array[Int],op: Int => Int)={
      for (elem <- arr) yield  op(elem)
     }
    //操作函数
    def op(ele : Int):Int={
      ele + 1
    }
    //调用方式
    val arr=f(Array(1,2,3,4),op)
    println(arr.mkString(","))

    val arr1=f(Array(1,2,3,4),(ele:Int)=>{ele + 1})
    println(arr1.mkString(","))

    val arr2=f(Array(1,2,3,4),(x)=>{x + 1})
    println(arr2.mkString(","))
  }
}
