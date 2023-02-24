package com.tqy.scalaMatch

import com.tqy.scalaMatch.MatchValue.matchMethod

object MatchType {
  def main(args: Array[String]): Unit = {
    println(matchMethod(5))

    println(matchMethod("hello"))
    println(matchMethod(true))
    println(matchMethod('+'))

    println(matchMethod(("zhangsan","23")))

    println(matchMethod(List(1,2,3)))
  }

  def matchMethod(x:Any)= x match {
    case i:Int => s"Int ${i}"
    case s:String => s"String ${s}"
    case flag:Boolean => s"Boolean ${flag}"
    case c:Char => s"Char ${c}"
    case t:(String,String) => s"Tuple ${t}"
    case err => "unknow type"
  }
}
