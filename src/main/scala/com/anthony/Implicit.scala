package com.anthony

import java.io.File

//import ImplicitAspect._

/**
  * @ Description:
  * @ Date: Created in 20:27 10/07/2018
  * @ Author: Anthony_Duan
  */
object Implicit {

  def main(args: Array[String]): Unit = {
    //隐式转换可以为一个存在的类添加一个方法 增强一个类的功能  java中的动态代理的功能
    //    implicit def man2superman(man: Man): SuperMan = new SuperMan(man.name)

    import ImplicitAspect.man2superman
    val one = new Man("anthony")
    one.fly()


    println("=================我是分割线=======================")
    import ImplicitAspect.file2richfile
    //    implicit def file2richfile(file: File): RichFile = new RichFile(file)

    val file = new File("/Users/duanjiaxing/data/people.txt")
    val txt = file.read()
    println(txt)
  }


}

class Man(val name: String) {
  def eat(): Unit = {
    println(s"$name can eat")
  }
}

class SuperMan(val name: String) {
  def fly(): Unit = {
    println(s"$name can fly")
  }
}

class RichFile(val file: File) {
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }
}