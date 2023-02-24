package com.tqy.array

import scala.collection.mutable.ArrayBuffer

class ArrayMethodTest {

}
object ArrayMethodTest{

  def main(args: Array[String]): Unit = {
    val arrayBuffer1 = ArrayBuffer(1, 2, 3, 4)
    arrayBuffer1.foreach(x =>print(x + ","))
    println
    println(arrayBuffer1.filter(_ % 2 == 1))

    arrayBuffer1.update(2,5)
    println(arrayBuffer1)
    arrayBuffer1.remove(1)
    println(arrayBuffer1)

    val arrayBuffer2 = ArrayBuffer(1, 2, 3, 4, 5)
    val i = arrayBuffer2.reduce(_ + _)
    println(i)

    val i1 = arrayBuffer2.reduce(_ - _)
    println(i1)

    val i2 = arrayBuffer2.reduceRight(_ - _)
    println(i2)

    val ints = arrayBuffer2.map(_ * 2)
    println(ints)

    val i3 = arrayBuffer2.fold(1)(_ + _)
    println(i3)

    val i4 = arrayBuffer2.foldRight(6)(_ - _)
    println(i4)







  }
}
