package com.learnscala

object mul_for {
  //多重循环，打印99乘法表
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(j + "*" + i + "=" + (i*j) + "\t")
      }
      println()
    }
  }
}
