package com.learnscala2

object function5 {
  def main(args: Array[String]): Unit = {
    //传递函数有两个参数
    def f(a: Int,b: Int,op: (Int,Int)=> Int):Int={
      op(a,b)
    }
    //标准版
    println(f(2,3,(x:Int,y:Int)=> (x+y)))
    //如果只有一行，则大括号也可以省略
    println(f(2,3,(x:Int,y:Int) => x+y))
    //参数的类型可以省略，会根据形参进行自动的推导
    println(f(2,3,(x,y)=> x+y))
    //如果参数只出现一次，则参数省略且后面参数可以用——代替
    println(f(2,3, _+_))
  }
}
