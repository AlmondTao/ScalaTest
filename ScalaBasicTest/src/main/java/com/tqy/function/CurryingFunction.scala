package com.tqy.function

object CurryingFunction {

  def main(args: Array[String]): Unit = {

    def method(i:Int)(j:Int):Int = {
      i * j

    }

    val unit = method(2)(3)

    println(unit)
  }
}
