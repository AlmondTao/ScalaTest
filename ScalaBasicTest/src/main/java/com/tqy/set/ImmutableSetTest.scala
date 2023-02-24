package com.tqy.set

object ImmutableSetTest {
  def main(args: Array[String]): Unit = {
    val set1 = Set("1", "2", "3", "4")
    println(set1)
    val set2 = set1 + "5"
    println(set2)
    val set3:Set[String] = set1 + ("5", "6", "7")
    println(set3)


    set3.foreach(s=>print(s))
    println()
    val set4 = Set("5", "6", "7", "8")
    val set5 = set1 ++ set4
    println(set5)

    val set6 = set4 - "5"
    println(set6)

    val set7 = set1 ++ set4
    println(set7)

    val set8 = set4 ++: set1
    println(set8)

    println(set7 eq set8)

    val set9 = Set("1", "2", "3", "4")

    println(set1 eq set9)

  }

}
