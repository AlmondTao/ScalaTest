package com.tqy.scalaMatch

object MatchTest {
  def main(args: Array[String]): Unit = {
      var a : Int = 10
      var b : Int = 20
      var tmp = 'd'

    val value = tmp match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case err => "illegal"
    }
    println(value)
  }
}
