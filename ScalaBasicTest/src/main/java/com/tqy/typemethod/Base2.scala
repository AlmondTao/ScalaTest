package com.tqy.typemethod

trait Base2 {
//  this:Base3 with BaseChild1 with BaseChild2 =>

  aaa : Base3 with BaseChild1 with BaseChild2{
    def sayThing(word:String):Unit
  } =>

}
