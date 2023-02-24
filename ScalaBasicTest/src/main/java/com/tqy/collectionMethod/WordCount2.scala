package com.tqy.collectionMethod

object WordCount2 {
  def main(args: Array[String]): Unit = {
    val dataList = List(
      ("Hello Scala", 4), ("Hello Spark", 2)
    )

    val result = dataList
      .flatMap(t => t._1.split(" ").map((_, t._2)))
      .groupBy(_._1)
      .mapValues(_.map(_._2).sum).toList.sortBy(_._2)(Ordering.Int.reverse)

    println(result)

  }
}
