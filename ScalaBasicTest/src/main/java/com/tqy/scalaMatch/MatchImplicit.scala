package com.tqy.scalaMatch

import com.tqy.scalaMatch.MatchParameter.Person

object MatchImplicit {

  def main(args: Array[String]): Unit = {

    //调用apply
    val person = Person("zhangsan",18)
    println(person)
    //调用update
    person("zhangsan") = 20
    println(person)



    person match {
      //调用unapply方法
      case Person("zhangsan",20) => println("匹配Person："+person)

      case _ => println("person没匹配上")
    }

    val name = "lisi2"
    val casePerson =  Person("lisi",20)
    name match {
      //调用unapplySeq方法
      case casePerson((name,age)) => println(s"匹配casePerson,name:${name},age:${age} ")
      case _ => println("name没匹配上")
    }

  }

  private class Person(var name:String,var age:Int){
    def update(name:String,age:Int): Unit ={
      if (this.name == name )
        this.age = age

    }

//    def unapplySeq(sname:String): Option[Seq[Tuple2[String, Int]]] = sname match {
//      case null => None
//      case "lisi" => Option(List((name, age*2)))
//      case _ => None
//    }
    def unapplySeq(name:String): Option[Seq[Tuple2[String, Int]]] =  {

      if (name == null)
        None
      else if(this.name == name)
        Option(List((name, age*2)))
      else
        None
    }

    override def toString: String = s"name:${name},age:${age}"

  }
  private object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)

    def unapply(p: Person): Option[(String, Int)] = {
      if (p == null)
        None
      else
        Option(p.name, p.age)
    }


  }
}
