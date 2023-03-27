package com.tqy.collectionMethod

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ListMethodTest {

  def main(args: Array[String]): Unit = {
    val list1 = List("1", "2", "3","4","5","6")
    val list2 = List("1", "2", "3")
    val list3 = List("a", "b", "c")

    //集合头
    println("head: "+list1.head)
    //集合尾
    println("tail: "+list1.tail)
    //集合尾迭代
    println("tails: "+list1.tails.mkString(","))
    //集合初始值
    println("init: "+list1.init)
    //集合初始值迭代
    println("inits: "+list1.inits.mkString(","))
    //集合最后元素
    println("last: "+list1.last)

    //集合并集
    println("union: "+ (list1 union list2))
    //集合交集
    println("intersect: "+list1.intersect(list2))
    //集合差集
    println("diff: "+ list1.diff(list2))
    //切分集合
    println("splitAt: "+ list1.splitAt(2))
    //滑动（窗口）
    println("sliding: "+ list1.sliding(2).mkString(","))
    //滚动
    println("sliding: "+ list1.sliding(2,2).mkString(","))

    println("sliding: "+ list1.sliding(3,4).mkString(","))
    //拉链
    println("zip: "+ list1.zip(list2))
    //数据索引拉链
    println("zipWithIndex: "+ list3.zipWithIndex)

    //集合最小值
    println("min: "+ list1.min)
    //集合最大值
    println("max: "+list1.max)

    val list4 = List(1, 2, 3, 4)
    //集合求和
    println("sum: "+ list4.sum)
    //集合乘积
    println("product: "+ list4.product)

    //集合简化规约
    println("reduce: "+list4.reduce(_-_))

    //简化规约左
    println("reduceLeft: "+list1.reduceLeft("("+_+"-"+_+")"))

    //简化规约右
    println("reduceRight: "+list1.reduceRight("("+_+"-"+_+")"))

    //集合折叠
    println("fold: "+list1.fold("1")(_+_))

    val list5: ListBuffer[String] = mutable.ListBuffer("a", "b", "c")

    //集合折叠左
    println("foldLeft: "+list1.foldLeft(list5)(
      (x:ListBuffer[String],y:String)=>{
        val x2: ListBuffer[String] = x.map(_ + y)
        x2

      }))
    //集合折叠右
    println("foldRight: "+list1.foldRight("foldRight")(_+_))

    //集合扫描
    println("scan: "+list1.scan("scan")(_+"+"+_))
    //集合扫描左
    println("scanLeft: "+list1.scanLeft("scanLeft")(_+"+"+_))
    //集合扫描右
    println("scanRight: "+list1.scanRight("scanRight")(_+"+"+_))




  }

}
