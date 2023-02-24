package com.tqy.typemethod

class Base3ParameterClass extends Base3 with BaseChild1 with BaseChild2 {
  override def baseChild1Method(): Unit = println("Base3ParameterClass...baseChild1")
}
