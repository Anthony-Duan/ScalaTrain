package com.anthony

import java.io.File

/**
  * @ Description:
  * @ Date: Created in 20:53 10/07/2018
  * @ Author: Anthony_Duan
  */
object ImplicitAspect {

  implicit def man2superman(man: Man): SuperMan = new SuperMan(man.name)

  implicit def file2richfile(file: File): RichFile = new RichFile(file)


}
