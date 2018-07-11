package com.anthony

/**
  * @ Description:
  * @ Date: Created in 14:39 10/07/2018
  * @ Author: Anthony_Duan
  */
object tuple_test extends App {


  val a = (1, 2, 3, 4, 5)
  println(a._2)
  println(a._3)
  println(a.productElement(0))
  for (i <- 0.until(a.productArity)) {
    println(a.productElement(i))
  }

}
