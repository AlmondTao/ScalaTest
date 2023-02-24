package com.tqy.scalaMatch

object PartialFunction {

  def main(args: Array[String]): Unit = {
    //声明偏函数
    val pf : PartialFunction[Int,String] = {case 1 => "one"}

    println(List(1,2,3,4,5).collect(pf))



  }

}
