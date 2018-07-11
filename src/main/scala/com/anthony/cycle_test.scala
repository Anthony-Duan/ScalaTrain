package com.anthony

/**
  * @ Description:
  * @ Date: Created in 20:57 09/07/2018
  * @ Author: Anthony_Duan
  */
object cycle_test {


  def main(args: Array[String]): Unit = {

    val zimus = Array('a','b','c','d','e')

    for (zimu <- zimus){
      println(zimu)
    }

    zimus.foreach(zimu=>println(zimu))

    var (num,sum) = (100,0)

    while (num>0){
      sum+=num
      num-=1
    }
    println(sum)

  }

}
