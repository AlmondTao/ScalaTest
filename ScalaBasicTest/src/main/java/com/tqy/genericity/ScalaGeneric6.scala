package com.tqy.genericity

object ScalaGeneric6 {
  def main(args: Array[String]): Unit = {
    val parent = new Parent
    val user = new User
    val subUser = new SubUser

    //test(parent)//error
    test(user)//ok
    test(subUser)//ok


    test2(parent)//ok
    test2(user)//ok
    test2(subUser)//ok

    test2[Parent](parent)//ok
    test2[User](user)//ok
//    test2[SubUser](subUser)//error

  }

  //设置泛型上界
  def test[A<:User](a:A): Unit ={
    println(a)
  }

  def test2[B>:User](b:B): Unit ={
    println(b)
  }


  class Parent{}

  class User extends Parent{}

  class SubUser extends User{}

}
