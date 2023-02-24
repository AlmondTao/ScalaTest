package com.tqy.typemethod

trait Base1 {

  val t = new Base3  with BaseChild1 with BaseChild2 {
    override def baseChild1Method(): Unit = println("Base3...baseChild1")
  }
}
