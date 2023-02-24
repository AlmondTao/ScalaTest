package com.tqy.innerclass

class OutClass {
  class Inner

  private val inner = new Inner
  private val inner1 = new this.Inner
  private val inner2 = new OutClass.this.Inner



}

class OtherClass{


}
