package com.learnscala2

object recursive {
  //递归
  def main(args: Array[String]): Unit = {
    def test(i: Int):Int={
      if(i == 1) {1}
      else
        {
          i * test(i -1)
        }
    }
    println(test(5))
  }
}
