package com.tqy.typemethod

class ChildClass extends ParentClass {
  //不能重写
  //  override type A = Int

  type C
  override def methodA(a: A): Unit = println(a)

  override def methodB(b: B): Unit = super.methodB(b)

  def methodC(c: C): Unit ={
    println(c)
  }

}
