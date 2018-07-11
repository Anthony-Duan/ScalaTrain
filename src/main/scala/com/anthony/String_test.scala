package com.anthony

/**
  * @ Description:
  * @ Date: Created in 16:19 10/07/2018
  * @ Author: Anthony_Duan
  */
object String_test extends App {

  val name = "duan"
  println(s"字符串插值操作，如hello:$name") //字符串插值

  val str =
    s"""
       |这是一个多行字符串
       |会原样输出
       |这里也可以使用字符串插值
       |比如hello:$name
    """.stripMargin

  println(str)
}
