package com.tqy.parallel

object ParallelMapTest {

  def main(args: Array[String]): Unit = {
    val inclusive : Range  = 1 to 100
    println(inclusive)
    println(inclusive.getClass)

    val tName1 = (0 to 100).map(x => Thread.currentThread().getName)
    val tName2 = (0 to 100).par.map(x => Thread.currentThread().getName)

    println(tName1)
    println(tName2)
    println("*************")
//    val value = 0 to 100 map Thread.currentThread().getName

//    println(value)

  }

}
