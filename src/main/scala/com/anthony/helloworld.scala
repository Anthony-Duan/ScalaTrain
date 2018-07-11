package com.anthony

/**
  * @ Description: scala关于数据类型的几个知识点
  * @ Date: Created in 20:24 28/06/2018
  * @ Author: Anthony_Duan
  */
object helloworld {

  def main(args: Array[String]): Unit = {
    //getClass.getSimpleName 可以获得该变量的数据类型
    val a = 1.1
    println(a.getClass.getSimpleName) //double 1.1被scala自动解释为Double类型
    val b :Float = 1.1f
    println(b.getClass.getSimpleName) //float
    val c = 1.1f
    println(c.getClass.getSimpleName) //float   在小数后面加上f会被解释为float类型
    val d = 1.1.asInstanceOf[Float]   //  asInstanceOf[T]  这个方法是为类型转换
    println(d.getClass.getSimpleName) //float
    println(c.isInstanceOf[Float]) //true   isInstanceOf[T] 判断数据类型
  }
}
