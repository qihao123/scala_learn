package com.learnscala4

object scala_trait {
  def main(args: Array[String]): Unit = {

  }
}

trait person{
  //类似于java的接口
  var name:String
  def test():Unit
  var age:Int=18
  def test1():Unit={}
}
class user extends person{
  override var name: String = _

  override def test(): Unit = {}

}
