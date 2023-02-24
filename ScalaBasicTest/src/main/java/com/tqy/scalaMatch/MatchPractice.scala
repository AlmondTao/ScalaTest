package com.tqy.scalaMatch

object MatchPractice {

  def main(args: Array[String]): Unit = {
    //将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串。
    val list = List(1, 2, 3, 4, 5, 6, "test")

    //不使用偏函数
//    val result = list.map(v => {
//      if (v.isInstanceOf[Int]) {
//        v.asInstanceOf[Int] + 1
//      }else{
//        v
//      }
//    }).filter(!_.isInstanceOf[Int])
//    println(result)

    //使用偏函数
    val result2 = list.collect {
      case i: Int => i + 1
    }
    println(result2)


  }

}
