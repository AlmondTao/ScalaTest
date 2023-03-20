package com.tqy.scalaMatch

object MatchTest2 {
  def main(args: Array[String]): Unit = {

    method("1")()
  }

  def method(str:String): PartialFunction[Any,Unit] ={
    case "1" => println(str)
    case _ =>println("other str")
  }
}
