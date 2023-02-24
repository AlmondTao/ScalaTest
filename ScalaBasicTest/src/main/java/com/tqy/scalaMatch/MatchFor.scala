package com.tqy.scalaMatch

object MatchFor {
  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "a", 2 -> "b", 3 -> "c",4->"b")
//    for(kv <- map){
//      println("k:"+kv._1+",v:"+kv._2)
//    }
    //匹配
//    for((k,v)<-map){
//      println(s"k:$k,v:$v")
//    }
    //过滤
//    for((k,"b")<-map){
//      println(s"k:$k,v:b")
//    }

    for((k,v)<-map if v != "b"){
      println(s"k:$k,v:b")
    }





  }

}
