package com.tqy.scalaMatch

import com.tqy.scalaMatch.MatchParameter.Person
import com.tqy.typechange.Person

import scala.beans.BeanProperty

object MatchParameter {
  def main(args: Array[String]): Unit = {
    var (x,y) = (1,"2")
    println(s"$x+$y")

    val Array(first,second,_*) = Array(1, '2', "3", true)
    println(s"数组变量匹配：$first+$second")

    val c = 'a'
    val i = (c.toInt + 1).toChar
    println(i)

    val Person(name,age) = Person("zhangsan", 18)
    println(s"Person:$name,$age")

  }

  case class Person(name:String,age:Int) {
    @BeanProperty val pName = this.name
    @BeanProperty var pAge = this.age
  }
//  object Person{
//    def apply(name:String,age:Int) ={
//      new Person(name,age)
//    }
//    def unapply(person: Person) ={
//      if (person == null){
//        None
//      }else{
//        Option(person.getPName,person.getPAge)
//      }
//    }
//  }

}
