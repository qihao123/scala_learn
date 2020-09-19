//package com.learnscala3
package com
class test{
  def test1():Unit={
    println("package class")
  }}
  package learnscala3 {


    object scalapackage {
      def main(args: Array[String]): Unit = {
        println("package test")
        val a:test = new test
        a.test1()
      }
    }

  }

