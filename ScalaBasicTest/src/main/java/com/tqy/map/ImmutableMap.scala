package com.tqy.map

object ImmutableMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)

    //添加数据
    val map2 = map1 + ("d" -> 4)
    println(map1)
    println(map2)

    //删除数据
    val map3 = map1 - "a"
    println(map3)

    val map4 = Map("d" -> 4, "e" -> 5, "f" -> 6)
    val map5 = map1 ++ map4
    println(map5)

    val map6 = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1 eq map6)

    val map7 = map1 ++: map4
    println(map7)

    val map8 = map1.updated("a", 4)
    println(map8)

    val emptyMap = Map.empty
    println(emptyMap)

    println(map1.apply("a"))

    //报异常NoSuchElementException: key not found: d
//    println(map1.apply("d"))
    //不报异常
    println(map1.get("d"))

    println(map1.getOrElse("d",123))



  }

}
