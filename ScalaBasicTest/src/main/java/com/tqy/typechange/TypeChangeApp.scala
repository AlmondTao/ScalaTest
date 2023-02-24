package com.tqy.typechange

import com.tqy.typechange.Person.equals

class TypeChangeApp  {




}

object TypeChangeApp extends App{
  private val p1 = new Person()
  private val p2 = new Person
  p1.write()
  p2.write()

  private val c1:Person = new Child()

  println(p1.isInstanceOf[Person])
  println(p2.isInstanceOf[Person])
  println(c1.isInstanceOf[Person])
  println(c1)
  private val child: Child = c1.asInstanceOf[Child]
  println(child)

}
