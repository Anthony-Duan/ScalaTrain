package com.anthony

/**
  * @ Description:
  * @ Date: Created in 09:26 10/07/2018
  * @ Author: Anthony_Duan
  */
object abstract_test {

  def main(args: Array[String]): Unit = {

    val stu = new ST()
    stu.sleep


  }

}

abstract class People{

  val name:String

  val gender:String

  def eat

  def sleep
}

class ST extends People{

  override val name: String = "Anthony"

  override val gender: String = "male"

  override def eat=
  {println("实现eat")}

  override def sleep={
    println("实现sleep")
  }


}



