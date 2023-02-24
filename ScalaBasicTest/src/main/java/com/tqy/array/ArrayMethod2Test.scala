package com.tqy.array

import scala.io.Source

class ArrayMethod2Test {


}

object ArrayMethod2Test {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("testFile/arrayTest.txt")
    val array = source.getLines().toArray
    source.close()

    val flatten = array.flatMap(f =>{
      f.split(" ")
    })

    val group = flatten.groupBy(f => f)

    val stringToInt = group.mapValues(g => {
      g.length
    })

    println(stringToInt.mkString(","))

    val functionToMap = array.flatMap(_.split(" ")).groupBy(_.toString).mapValues(_.size)

    println(functionToMap.mkString(","))

  }


}
