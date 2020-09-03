package com.learnscala

object For {
  def main(args: Array[String]): Unit = {
    //scala的for
    for(i <-1 to 5){
      println(i.toString)
    }
    //需要-1的情况用until
    for (elem <- 1 until  5) {
      println(elem.toString)
    }
    //循环守卫
    for (elem <- 1 to 5 if elem != 2) {
      println(elem.toString)
    }
    for (elem <- 1 to 5 by 2) {
      println(elem.toString)
    }
    for (i <- 1 to 5 ; j <- 1 to 5) {
      println(i.toString)
    }
    for (i <- 1 to 5 ; j = i + 1) {
      println(i.toString)
    }
    //yield
    var res = for(i <- 1 to 10) yield i + 2
    //倒叙
    for (elem <- 1 to 10 reverse) {
      println(elem.toString)
    }
  }
}
