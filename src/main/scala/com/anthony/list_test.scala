package com.anthony

/**
  * @ Description:
  * @ Date: Created in 13:31 10/07/2018
  * @ Author: Anthony_Duan
  */
object list_test extends App {

  val b = List[Int](1,2,3,4)
  val c = List(1,2,3,4,"we")

  println(b)
  println(c)
  val d = 2::3::Nil
  println(d)


  val l1 = scala.collection.mutable.ListBuffer[Int]()
  l1 += 2
  l1 += (3,4,5,6)
  l1 -= (1,2,3)  //没有1  有则减去，没有也不报错
  println(l1)

  def sum (num:Int*): Int ={
    if (num.isEmpty) {
      0
    }else{
      num.head+sum(num.tail:_*)  // :_* 可以将一个序列转换为可变参数
    }
  }
  println(sum(1,2,3,4,5))
}
