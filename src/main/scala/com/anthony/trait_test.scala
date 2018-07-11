package com.anthony

/**
  * @ Description:
  * @ Date: Created in 10:41 10/07/2018
  * @ Author: Anthony_Duan
  */
object trait_test {

  def main(args: Array[String]): Unit = {

  val flyFish = new FlyFish
    flyFish.eat
    flyFish.fly
    flyFish.swim

  }

}


trait Flyable{
  def fly
  def eat = println("i can eat")
}

trait swimable{
  def swim
}

class FlyFish extends Flyable with swimable {
  override def fly: Unit = {
    println("i can fly")
  }

  override def swim: Unit = {
    println("i can swim")
  }
}