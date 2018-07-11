package com.anthony

/**
  * @ Description:
  * @ Date: Created in 06:37 11/07/2018
  * @ Author: Anthony_Duan
  */


import scala.xml.XML

object readXML extends App {


  val xml = XML.load("/Users/duanjiaxing/IdeaProjects/scala-train/src/main/resources/hive-site.xml")
  //  println(xml)
  //  val xm2 = XML.load(this.getClass.getClassLoader.getResource("hive-site.xml"))
  //  val xm3 = XML.load(new FileInputStream("/Users/duanjiaxing/IdeaProjects/scala-train/src/main/resources/hive-site.xml"))
  //  println(xm2)

  (xml \\ "property" \\ "name").map(_.text).foreach(println)

}
