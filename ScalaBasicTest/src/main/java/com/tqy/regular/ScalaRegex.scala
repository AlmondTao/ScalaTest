package com.tqy.regular

import scala.util.matching.Regex


object ScalaRegex {

  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    var str = "Scala is Scalable Language"


    //匹配字符串 - 第一个
    println(pattern findFirstIn str)

    //匹配字符串 - 所有
    val iterator: Regex.MatchIterator = pattern findAllIn str

    while (iterator.hasNext){
      println(iterator.next())
    }

    println("*******************")

    val regex = new Regex("(S|s)cala")

    println((regex findAllIn str).mkString(","))

  }

}
