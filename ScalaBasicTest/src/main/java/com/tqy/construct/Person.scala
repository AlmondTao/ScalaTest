package com.tqy.construct

class Person (name:String,age:Int){
  println("person有参构造函数")
  var personName:String = name
  var personAge = this.age
  val personAddress:String = "北京"

  def this(){
    this("lisi",18)
    println("person无参构造函数")

  }
  def sayHello(): Unit ={
    Person.sayHello()
    println("hello class Person")
  }

}

object Person{
  println("person代码块")
  def sayHello(): Unit ={
    println("hello object Person")
  }
  def apply() {
    println("person apply函数")
    new Person()
  }
}
