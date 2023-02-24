package com.tqy.genericity

object ScalaGeneric3 {

  def main(args: Array[String]): Unit = {

    val test1:Test[User] = new Test[User]
    val test2:Test[User] = new Test[Parent]//不报错
//    val test3:Test[User] = new Test[SubUser]//报错
  }

  class Parent

  class User extends Parent

  class SubUser extends User
  //泛型逆变
  class Test[-T]
}
