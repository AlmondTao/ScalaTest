package com.tqy.map

import scala.collection.mutable.{Map => MMap}
import scala.collection.mutable

object MutableMap {

  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = MMap("d" -> 4, "e" -> 5, "f" -> 6)

    val list = map1.toList
    val seq = map1.toSeq
    val set = map1.toSet
    val array = map1.toArray
    println(list)
    println(seq)
    println(set)
    println(array)

    val map3 = map1.zip(map2)
    println(map3)
    val map4 = map3.unzip

    println(map4)

    //修改数据
    map1.update("a",11)
    println(map1)
    map1("a") = 111
    println(map1)

    val values = map1.values

    println(values)


  }

}
