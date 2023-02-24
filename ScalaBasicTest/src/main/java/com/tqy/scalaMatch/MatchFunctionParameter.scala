package com.tqy.scalaMatch

object MatchFunctionParameter {

  def main(args: Array[String]): Unit = {
    val list = List(("a", 1), ("b", 2), ("c", 3))

//    val tuples = list.map(t => (t._1, t._2 * 2))
//    println(tuples)

    val tuples1 = list.map {
      case (k, v) => (k, v * 2)
    }
    println(tuples1)

  }

}
