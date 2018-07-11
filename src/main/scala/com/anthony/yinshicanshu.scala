package com.anthony

/**
  * @ Description:
  * @ Date: Created in 21:01 10/07/2018
  * @ Author: Anthony_Duan
  */
object yinshicanshu {

  //  implicit val s3 = "xiaoduan"   //这里也可以找到

  def main(args: Array[String]): Unit = {


    def test(implicit name: String): Unit = {
      println(name)
    }

    test("anthony")
    implicit val s = "duan" //与变量名无关 根据变量的类型限定
    //    implicit val s2 = "duan2"  //    Error:(21, 5) ambiguous implicit values:both value s2 of type String
    // and value s of type String match expected type String
    test


  }

}
