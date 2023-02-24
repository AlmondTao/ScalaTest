package com.tqy.polymorphic

abstract class Animal {
  val eyes : String
  var mouth : String
  val heart : String = "heart"

  def see(): Unit ={
    println(eyes)
  }

  private def call(): Unit ={
    println(mouth)
  }

  def heartBeat



}
