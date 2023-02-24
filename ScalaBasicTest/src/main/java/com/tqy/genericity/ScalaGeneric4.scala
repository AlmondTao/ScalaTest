package com.tqy.genericity

object ScalaGeneric4 {
  def main(args: Array[String]): Unit = {


    def f[A:Test](a:A) = println(a)

    implicit var test:Test[Parent] = new Test[Parent]

    val unit = f(new Parent)
  }

  class Parent

  class User extends Parent

  class SubUser extends User

  class Test[T]
}
