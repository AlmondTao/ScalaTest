package com.tqy.typemethod

class ParentClass {
  type A = String
  type B
  def methodA(a:A): Unit ={
    println("methodA...")
  }

  def methodB(b:B): Unit ={
    println(b)
  }
}
