package com.anthony

/**
  * @ Description:
  * @ Date: Created in 16:50 10/07/2018
  * @ Author: Anthony_Duan
  */
object gaojiehansu extends App {

  /**
    * 几种简化的方式结果是一样的
    */
  val list1 = List(1, 2, 3, 4, 5)
  list1.map((x: Int) => x + 1)
  println(list1) //List(1, 2, 3, 4, 5)
  list1.map((x) => x + 1)
  println(list1) //List(1, 2, 3, 4, 5)
  list1.map(x => x + 1)
  println(list1) //List(1, 2, 3, 4, 5)
  list1.map(_ + 1)
  println(list1) //List(1, 2, 3, 4, 5)


}
