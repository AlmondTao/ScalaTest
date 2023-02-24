package com.tqy.construct

import scala.beans.BeanProperty


class User(name:String) extends Person(name,18) {
  @BeanProperty var userage:Int = _
  val username = name
  //不可重写可变的父类成员变量
//  override var personName = ""
  override val personAddress:String = "北京昌平"
  override def sayHello(): Unit = println("hello class User")

  println("user有参构造函数")



  def this(){
    this("zhangsan")
    super.sayHello()

    println("user无参构造函数")
  }
}

object User extends App {

  println("user代码块")

  def apply(): User = {
    println("user apply函数")
    new User
  }

}
