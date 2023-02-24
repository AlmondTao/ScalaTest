package com.tqy.typemethod

class Base1ExtendsClass extends Base1 {

  override val t:Base3ParameterClass = new Base3ParameterClass

  def method1: Unit ={
    t.baseChild1Method()
  }

}
