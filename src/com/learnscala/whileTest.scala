package com.learnscala

import scala.util.control.Breaks._

object whileTest {
  def main(args: Array[String]): Unit = {
    var i = 1
    //正常while
    while (i < 10){
      println(i.toString)
      i += 1
    }
    //正常dowhile语句
    do{
      println(i.toString)
      i += 1
    } while (i < 10)
    //循环跳出，break
    breakable {
      for (elem <- 1 to 5) {
        if (elem == 3) {
          break
        }
        println(elem)
      }
    }
    //实现continue
    breakable {
      for (elem <- 1 to 5) {
        if (elem == 3) {
          break
        }else{
          println(elem)
        }
      }
    }
  }
}
