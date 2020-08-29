package com.learnscala

object CharOutput {
  //字符串输出
  def main(args: Array[String]): Unit = {
    //字符串，通过+号连接
    //ptintf用法：字符串，通过%传值
    //字符串模板；通过$获取变量值
    val name:String = "qh"
    val age:Int = 23

    println(name+ "   " + age)

    printf("name=%s,age=%d", name, age)

    val s:String =
      s"""
        |select
        | name,
        | age
        |from
        | user
        |where
        | name = $name
        |""".stripMargin
    println(s)
  }
}
