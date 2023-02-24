package com.tqy.genericity

object ScalaGeneric {

  def main(args: Array[String]): Unit = {

    //泛型不可变
    val test1:Test[User] = new Test[User]
//    val test2:Test[User] = new Test[Parent]//报错
//    val test3:Test[User] = new Test[SubUser]//报错

  }
  class Parent

  class User extends Parent

  class SubUser extends User

  class Test[T]

}
