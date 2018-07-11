package com.anthony

/**
  * @ Description:
  * @ Date: Created in 14:08 10/07/2018
  * @ Author: Anthony_Duan
  */
object map_list extends App {

  val a = Map("a" -> 1, "b" -> 2)
  println(a)
  val b = scala.collection.mutable.Map[String, Int]()
  b.+=("c" -> 2)
  b ++= Map("e" -> 5, "g" -> 7)
  println(b)
  for ((k, v) <- b) {
    println(k + ":" + v)
  }
  for (k <- b.keySet) {
    println(b.getOrElse(k, 9)) //getOrElse 是比较安全的获取方式
  }
  for (v <- b.values) {
    println(v)
  }
  //  val c = scala.collection.mutable.HashMap[String,Int]()
}
