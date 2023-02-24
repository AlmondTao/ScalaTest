package com.tqy.scalaMatch

object MatchList {
  def main(args: Array[String]): Unit = {
    for (list<- List(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))){
      val value = list match {
        case List(0) => "0" //匹配List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"


      }
      println(value)
    }
  }

}
