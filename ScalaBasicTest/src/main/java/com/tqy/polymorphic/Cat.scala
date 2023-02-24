package com.tqy.polymorphic

class Cat extends Animal
//  with LivingThings
{
  override val eyes : String = "黑色眼睛"
  var mouth : String = "喵"

  def heartBeat : Unit ={
    println("一秒2次")
  }



}
