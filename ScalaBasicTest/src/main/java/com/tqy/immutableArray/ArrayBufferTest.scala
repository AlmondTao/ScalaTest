package com.tqy.immutableArray

import scala.collection.mutable.ArrayBuffer

class ArrayBufferTest {



}
object ArrayBufferTest{
  def main(args: Array[String]): Unit = {
    val arr1 = new ArrayBuffer[Int]
    println(arr1)

    arr1.append(1,2,3,4,5)
    println(arr1)

    arr1.update(1,6)
    println(arr1)

    arr1.remove(2)
    println(arr1)

    val array = arr1.toArray
    val buffer = array.toBuffer

    println(array)
    println(buffer)

  }
}
