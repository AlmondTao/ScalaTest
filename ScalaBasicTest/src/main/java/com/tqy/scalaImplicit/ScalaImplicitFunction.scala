package com.tqy.scalaImplicit

object ScalaImplicitFunction{
  def main(args: Array[String]): Unit = {

    implicit def ->(p:Person)=new Man(p.pName)
    implicit def translate(i:Int)={
      i.toDouble
    }


    val person = new Person("zhangsan")
    val man:Man = person

    //插值器
    implicit class StringToPerson(str:StringContext){
      def $(any: Any*) = new Person("default")
    }
//    implicit def $(any: Any*) = new Person("default")
    def changeToMan(person: Person) ={
      new Man(person.pName)
    }
//    new StringToPerson(new StringContext("123"))

    changeToMan($"123")

    val name = "Tom"

    println(s"My name is ${name}")


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
