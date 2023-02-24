package com.tqy.typemethod

class Base2ExtendsClass extends Base2 with Base3 with BaseChild1 with BaseChild2 {

  override def baseChild1Method(): Unit = println("Base2ExtendsClass...baseChild1Method")

  //Base2条件
  def sayThing(word:String): Unit ={
    println("Base2ExtendsClass...sayThing:"+word)
  }

}
