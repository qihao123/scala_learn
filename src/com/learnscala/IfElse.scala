package com.learnscala

object IfElse {
  def main(args: Array[String]): Unit = {
    //单分支
    if(true){
      1
    }
    //多分支
    if(true){
      1
    } else {
      2
    }
    //if可以有返回值
    val res = if(true){
       0
    }
    else if(false){
       1
    }
    else {
       2
    }
    //三元运算符
    var b:Boolean = true
    var res1 = if(b) true else false
    //scala没有switch此处不提
  }
}
