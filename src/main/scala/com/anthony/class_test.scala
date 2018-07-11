//package com.anthony
//
///**
//  * @ Description:
//  * @ Date: Created in 21:26 09/07/2018
//  * @ Author: Anthony_Duan
//  */
//object class_test {
//
//  def main(args: Array[String]): Unit = {
////    val one = new People()
////    one.name = "anthony"
////    one.eat()
////    one.eat("橘子")
////    one.info()
//
//
////    val student = new Student("anthony",20)
////    println(student.name+" "+student.age+" "+student.school)
//
////    val student2 = new Student("anthony",20,"male")
////    println(student2.name+" "+student2.age+" "+student2.school+" "+student2.gender)
//    val student3 = new Student("anthony",30,"male")
//
////    println(student3.name+" "+student3.age+" "+student3.gender)
//
//    student3.eat()
//  }
//
//
//}
//
////class Student(val name:String,val age:Int){ //主构造器
////
////  val school = "Neusoft"
////
////  var gender:String = _
////
////  def this (name:String,age:Int,gender:String){//附属构造器
////    this(name,age) //附属构造器的第一句必须调用主构造器或者其他构造器
////    this.gender =gender
////  }
////
////
////}
//
//class Student(name:String,age:Int,var gender:String)extends People(name:String){
//
//  override def eat(): Unit = println("子类中重写方法")
//
//
//}
//
//class People(var name:String){
//
////  var name:String = name  //   _  为占位符  此时变量的类型不能省略
//  val age:Int= 20
//
////  private [this] val gender = "male"    // private[this]   权限修饰符
//
//
//  def eat(): Unit ={
//    println(name+"在吃饭")
//  }
//
//  def eat(food:String)={
//    println(name+"在吃"+food)
//  }
//
//
////  def  info ()={
////    println(name+"\n"+age+"\n"+gender)
////  }
//
//}