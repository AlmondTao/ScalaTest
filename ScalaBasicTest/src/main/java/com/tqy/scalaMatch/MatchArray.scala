package com.tqy.scalaMatch

object MatchArray {


  def main(args: Array[String]): Unit = {
      for(arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90),Array("match",1,2,3))){
        val value = arr match {
          case Array(0) => "0"
          case Array(x, y) => x + "," + y
          case Array(0, _*) => "以0开头的数组"
          case Array(x:String,y:Int) => "String + int"
          case Array(x:String,_*) =>"String + int*"
          case _ => "something else"
        }
        println(value)
      }
  }

}
