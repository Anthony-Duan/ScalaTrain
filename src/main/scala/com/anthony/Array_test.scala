package com.anthony

/**
  * @ Description:
  * @ Date: Created in 12:32 10/07/2018
  * @ Author: Anthony_Duan
  */
object Array_test extends App {


  val a = Array("hadoop","flink","spark")
  println(a)
  val b = Array(1,2,3,4,5,6)
  println(b)
  println(b.length)
  println(b.toString)
  println(b.mkString)
  println(b.mkString("<",",",">"))

  val c = scala.collection.mutable.ArrayBuffer[Int]()
  c += 1
  c += (2,3,4)
  c ++= Array(5,6,7)
  c.insert(2,100)
  println(c)
  println(c.remove(2,3))
  println(c.max+"   "+ c.min)

  println(c.reverse)
  for (ele <- c.reverse) {
    println(ele)
  }
  for (i <- 0 until  c.length){
    println(c(i))
  }
    println(c)


  c -= 1
  c -= (2,3,4)
  c --= Array(5,6)
  println(c)
}
