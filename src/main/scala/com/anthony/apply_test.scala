package com.anthony

/**
  * @ Description:
  * @ Date: Created in 10:09 10/07/2018
  * @ Author: Anthony_Duan
  */
object apply_test {

  def main(args: Array[String]): Unit = {

//    for(i <- 1 to 10){
//      ApplyTest.incr
//    }
//    println(ApplyTest.count) //  10   object 本身就是个单例对象

    val a = ApplyTest()  //==>调用的是Object apply
    println("----------------------------------")

    val b = new ApplyTest()
    println(b) //com.anthony.ApplyTest@7e0ea639
    b() //this is class ApplyTest apply
    a() //this is class ApplyTest apply

    //类名（）==> Object.apply
    //对象名() ==> Class.apply

  }


}


class ApplyTest{ //伴生类

  def apply()={
    println("this is class ApplyTest apply")
  }


}

object ApplyTest{ //伴生对象

  println("object ApplyTest enter")
  var count = 0

  def incr = count+=1

  //最佳实践，在Object 的apply方法中new Class
  def apply()= {
    println("this is object ApplyTest apply")
    new ApplyTest()
  }

  println("object ApplyTest leave")
  
}
