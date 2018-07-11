package com.anthony

/**
  * @ Description:
  * @ Date: Created in 15:07 10/07/2018
  * @ Author: Anthony_Duan
  */
object match_test extends App {


  /**
    * 基本的模式匹配  带守卫（判断条件）的模式匹配
    *
    * @param name
    * @param grade
    */
  def judgeGrade(name: String, grade: String): Unit = {
    grade match {
      case "A" => println("best")
      case "B" => println("good")
      case "C" if name == "张三" => println(name + "just so so")
      case "C" => println("just so so")
      case _ => println("bad")
    }
  }

  judgeGrade("张三", "C")
  judgeGrade("李四", "C")


  println("===================我是分割线========================")

  /**
    * 数组的模式匹配
    *
    * @param array
    */
  def greeting(array: Array[String]): Unit = {
    array match {
      case Array("张三") => println("只有张三")
      case Array(x, y) => println("只有两个人")
      case Array("张三", _*) => println("第一个是张三，且至少是三个人")
      case _ => println("开头不是张三，至少是3个人")
    }
  }

  greeting(Array("张三"))
  greeting(Array("李四", "张三"))
  greeting(Array("张三", "王五", "小明"))
  greeting(Array("小明", "王五", "小雪"))


  println("===================我是分割线========================")

  /**
    * List模式匹配
    *
    * @param list
    */
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


  println("===================我是分割线========================")

  /**
    * 类型的模式匹配
    *
    * @param obj
    */
  def matchType(obj: Any): Unit = {
    obj match {
      case x: Int => println("Int")
      case x: String => println("String")
      case x: Map[String, Int] => x.foreach(println) //Map[String, Int]  这里只能限定到Map类型 Map中的键值对的类型限定不了
      case _ => println("other type")
    }
  }

  matchType(1) //Int
  matchType("1") //String
  matchType(1f) //other type
  matchType(Map("anthony" -> 20)) //(anthony,20)
  matchType(Map("anthony" -> "duan")) //(anthony,duan)
  matchType(Map(20 -> "duan")) //(20,duan)


  println("===================我是分割线========================")

  /**
    * Scala的异常处理用模式匹配
    */
  try {
    println("打开资源")
  } catch {
    case e: Exception => println(e.printStackTrace())
  } finally {
    println("关闭资源")
  }

  println("===================我是分割线========================")

  /**
    * case class 模式匹配
    */
  class People

  case class CTO(name: String, floor: Int) extends People

  case class Employee(name: String, floor: Int) extends People

  case class Other() extends People

  def caseClassmatch(people: People): Unit = {
    people match {
      case CTO(name, floor) => println(name + ":" + floor)
      case Employee(name, floor) => println(name + ":" + floor)
      case Other() => println("other")
    }
  }


  caseClassmatch(CTO("boos", 22))
  caseClassmatch(Employee("anthony", 21))
  caseClassmatch(Other())

  println("===================我是分割线========================")
  /**
    * Sonme None 模式匹配
    */
  val grades = Map("anthony" -> "A", "duan" -> "B")

  def geradesMatch(name: String): Unit = {
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println(name + ":" + grade)
      case None => println("None")
    }
  }

  geradesMatch("anthony")
  geradesMatch("duan")
  geradesMatch("zhangsan")


}



