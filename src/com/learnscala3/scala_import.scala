package com.learnscala3
import java.sql.Date
object scala_import {
  def main(args: Array[String]): Unit = {
    //和java一样，可以在顶部使用import导入，在这个包中的所有类都可以使用
    //局部导入；什么时候用什么时候导入
    import java.io.BufferedInputStream
    //导入多个类：
    import java.util.{ArrayList,List}
    //通配符导入包内所有类：
    import java.util._
    //屏蔽类；例如将java.util包下将Date屏蔽，
    import java.util.{Date =>_,_}
    //scala中默认导入的三个包分别书
    import java.lang._
    import scala._
    import scala.Predef._
    //给类改名：
    import java.util.{ HashMap=>JavaHashMap}
    //导入包的绝对路径
    new _root_.java.util.HashMap
  }
}
