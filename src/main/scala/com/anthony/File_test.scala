package com.anthony

/**
  * @ Description:
  * @ Date: Created in 21:34 10/07/2018
  * @ Author: Anthony_Duan
  */

import scala.io.Source

object File_test extends App {

  val file = Source.fromFile("/Users/duanjiaxing/data/people.txt")(scala.io.Codec.UTF8)

  def readLine(): Unit = {
    //    for (line <- file.getLines()) {
    //      println(line)
    //    }
    file.getLines().foreach(println)
  }


  def readChar(): Unit = {
    for (char <- file) {
      println(char)
    }
    file.foreach(println)
  }

  //  readLine()
  //  readChar()

  def readURI(): Unit = {
    val file_uri = Source.fromURL("http://www.baidu.com")
    file_uri.getLines().foreach(println)
  }

  readURI()
}
