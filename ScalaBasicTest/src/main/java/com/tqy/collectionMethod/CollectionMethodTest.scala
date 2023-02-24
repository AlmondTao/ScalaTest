package com.tqy.collectionMethod

object CollectionMethodTest {

  def main(args: Array[String]): Unit = {
    val list1 = List("1", "2", "3", "4", "5", "6")

    list1.map(x => "No." + x)
    //集合映射
    println("map: "+list1.map(x => "No." + x))

    //集合扁平化
    val list2 = List(
      List("1", "2"),
      List("3", "4")
    )

    val list3 = List(
      "Hello world",
      "Hello scala"
    )

    println("flatten: "+list3.flatten(l => l.split(" ")))
    //集合扁平映射
    println("flatMap: "+list3.flatMap(l => l.split(" ")))

    //集合过滤数据
    println("filter: "+list1.filter(_ != "4"))
    println("filter: "+list1.filter(_.toInt%2 == 0))

    //集合分组数据
    println("groupBy: "+ list1.groupBy(_.toInt%2))

    val list4 = List(2, 5, 1, 3, 6  ,4 )
    //集合排序
    println("sortBy: "+ list4.sortBy(num => num)(Ordering.Int.reverse))
    println("sortBy: "+ list1.sortBy(num => num.toInt)(Ordering.Int.reverse))

    val list5 = List("1","111",  "11","3", "33","4", "5", "2","6")

    println("sortWith: "+ list5.sortWith((x,y)=>x < y))
    println("sortWith: "+ list5.sortWith((x,y)=>x.toInt < y.toInt))


  }


}
