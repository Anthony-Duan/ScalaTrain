package com.anthony

/**
  * @ Description:
  * @ Date: Created in 18:35 10/07/2018
  * @ Author: Anthony_Duan
  */
object partitionFunction extends App {

  def greeting(list: List[String]): Unit = {
    list match {
      case "张三" :: Nil => println("只有张三")
      case x :: y :: Nil => println("只有两个人")
      case "张三" :: tail => println("张三是第一个，至少2个人")
      case _ => println("开头不是张三，至少是3个人")
    }
  }

  greeting(List("张三"))
  greeting(List("李四", "张三"))
  greeting(List("张三", "王五", "小明"))
  greeting(List("小明", "王五", "小雪"))


  println("================我是分割线======================")

  /**
    * 将上面的模式匹配用偏函数更改
    *
    * 偏函数就是被包括在花括号内的没有match的一组case语句
    *
    * PartialFunction[-A, +B]   两个参数 A 输入参数类型 B 输出参数类型
    *
    * @return
    */

  def partitalFunction: PartialFunction[List[String], String] = {
    case "张三" :: Nil => "只有张三"
    case x :: y :: Nil => "只有两个人"
    case "张三" :: tail => "张三是第一个，至少2个人"
    case _ => "开头不是张三，至少是3个人"
  }

  println(partitalFunction(List("张三")))
  println(partitalFunction(List("李四", "张三")))
  println(partitalFunction(List("张三", "王五", "小明")))
  println(partitalFunction(List("小明", "王五", "小雪")))

}
