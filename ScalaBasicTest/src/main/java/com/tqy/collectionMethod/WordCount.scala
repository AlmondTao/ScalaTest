package com.tqy.collectionMethod

import java.nio.file.FileSystem
import scala.io.Source

object WordCount {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("testFile/wordcount.txt")
    val list = source.getLines().toList


    println(
      list.flatMap(lines => lines.split(" ")).groupBy(w => w).mapValues(_.size).toList.sortBy(_._2)(Ordering.Int.reverse)
    )

  }
}
