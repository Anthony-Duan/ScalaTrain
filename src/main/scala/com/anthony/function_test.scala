package com.anthony

/**
  * @ Description:
  * @ Date: Created in 20:08 09/07/2018
  * @ Author: Anthony_Duan
  */
object function_test {

  def add(x:Int,y:Int):Int={   //标准的定义模式不需要return语句 最后一句就返回值
    x+y
  }

  def add2(x:Int,y:Int)={ //函数的返回值类型可以推断出来的时候，函数的返回值类型可以省略不写
    x+y
  }

  def add3(x:Int,y:Int): Unit ={  //Unit 就是没有返回值
    println(x+y)
  }

  def add4()=1+2    //当函数体只有一行的时候，可以省略花括号

  def sayHello(name:String ="anthony"): Unit ={ //参数列表的类型不能省略
    println(name)
  }


  def info(name:String,age:Int)={
    println(name+" "+ age)
  }

  def sum(a:Int*)={  //可变参数可以传入多个相同类型的值
    var result = 0
    for (one <- a){
      result += one
    }
    result
  }

  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(add4())
    println(add4)  //当函数没有参数列表的时候 调用的时候可以省略方法的括号
    sayHello()
    sayHello("duan")
    //println(sayHello)  有默认参数 及时调用的时候不需要传入参数也需要写括号
    info(age = 20,name = "anthony") //命名参数可以不遵循参数列表 使用关键字直接传入参数
    println(sum(1,2,3,4))
  }
}
