package com.tqy.scalaMatch

object MatchValue {
  def main(args: Array[String]): Unit = {

    println(matchMethod(5))

    println(matchMethod("hello"))
    println(matchMethod(true))
    println(matchMethod('+'))

    println(matchMethod(("zhangsan","23")))
    //会报错
    println(matchMethod(List(1,2,3)))
  }

  def matchMethod(x:Any)= x match {
    case 5 => "Int five"
    case "hello" => "String hello"
    case true => "Boolean true"
    case '+' => "Char +"
    case ("zhangsan","23") => "Tuple (\"zhangsan\",\"23\")"
  }

}
