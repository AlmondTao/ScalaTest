package com.tqy.exception

object ScalaException {
  def main(args: Array[String]): Unit = {
    try{
      var n = 1/0
    }catch {
      case e:Exception =>{

        //对异常处理
        println("捕获Exception")
        e.printStackTrace()

      }
    }finally {
      println("执行finally")
    }
    println("main方法执行完毕")


  }
}
