package com.tqy.typechange

class Person {
  def write(): Unit ={
    println("Person...write")
  }
}
object Person{
  override def equals(obj: Any): Boolean = super.equals(obj)

  def objWrite(): Unit ={
    println("Obj Person....write")
  }
}

class InnerPerson{

}
