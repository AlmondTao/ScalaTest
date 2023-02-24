package com.tqy.set
import scala.collection.mutable._
import scala.collection.mutable.{Set=>MSet}




object MutableSetTest {


  def main(args: Array[String]): Unit = {
    val set1 = Set("1", "2", "3", "4")
    val mSet =  MSet("5", "6", "7", "8")

//    val set2 = MSet("1", "2", "3", "4")

    //增加数据
    set1.add("5")
    println(set1)

    //添加数据
    set1.update("6",true)
    println(set1)

    //删除数据
    set1.update("1",false)
    println(set1)

    //删除数据
    set1.remove("2")
    println(set1)


    //交集
    val set2 = set1 & mSet
    val set3 = set1 intersect mSet
    println("交集")
    println(set2)
    println(set3)

    //差集
    val set4 = set1 &~ mSet
    val set5 = mSet diff set1
    val set6 = mSet -- set1
    println("差集")
    println(set4)
    println(set5)
    println(set6)


    val set7 = set1 union mSet
    val set8 = set1 ++ mSet
    println("合集")
    println(set7)
    println(set8)

  }

}
