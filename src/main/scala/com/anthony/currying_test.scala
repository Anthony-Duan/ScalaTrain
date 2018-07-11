package com.anthony

/**
  * @ Description:柯里化函数
  * @ Date: Created in 16:33 10/07/2018
  * @ Author: Anthony_Duan
  */
object currying_test extends App {

  def add(x: Int, y: Int) = {
    x + y
  }

  def add2(x: Int)(y: Int) = {
    x + y
  }

  println(add(1, 2))
  println(add2(1)(2))
  val x = 2
  println(add2(1)(x))


}
