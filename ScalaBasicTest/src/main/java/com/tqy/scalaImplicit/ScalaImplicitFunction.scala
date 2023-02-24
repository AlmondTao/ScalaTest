package com.tqy.scalaImplicit

object ScalaImplicitFunction{
  def main(args: Array[String]): Unit = {

    implicit def ->(p:Person)=new Man(p.pName)
    implicit def translate(i:Int)={
      i.toDouble
    }

    val person = new Person("zhangsan")
    val man:Man = person

    println(man.mName)
  }
  class Person(name:String){
    val pName = name
  }
  class Man(name:String){
    val mName = name
  }

  def prt =  println("")
}
