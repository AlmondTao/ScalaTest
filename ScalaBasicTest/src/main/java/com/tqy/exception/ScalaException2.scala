package com.tqy.exception

object ScalaException2 {
  def main(args: Array[String]): Unit = {

    try{
      method()
    }catch {
      case e : Exception => println("捕获Exception")
      case e: ArithmeticException => println("捕获ArithmeticException")

    }


  }

  @throws[Exception]
  def method(): Unit ={
    println("执行method")
    var n = 1/0
  }
}
