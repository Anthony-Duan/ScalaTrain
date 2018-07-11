package com.anthony

/**
  * @ Description:
  * @ Date: Created in 21:18 10/07/2018
  * @ Author: Anthony_Duan
  */
object ImplicitClass extends App {

  //隐式类指的是用implicit关键字修饰的类。在对应的作用域内，带有这个关键字的类的主构造函数可用于隐式转换。

  implicit class Caculator(x: Int) {
    def add(a: Int) = a + x
  }

  println(2.add(3)) //此时Int类型的2已经多了add方法


}
