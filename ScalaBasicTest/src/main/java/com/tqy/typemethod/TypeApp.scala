package com.tqy.typemethod

object TypeApp {
  def main(args: Array[String]): Unit = {
//    val childClass = new ChildClass{
//      override type B = Int}
//    childClass.methodA("")
//    childClass.methodB(123)

//    val parentClass : ParentClass = new ChildClass{override type B = Int}
//    parentClass.methodA("")
    //子类定义type不行
//    parentClass.methodB(123)

//    new Base1ExtendsClass().method1

    val base2ExtendsClass = new Base2ExtendsClass()
    base2ExtendsClass.baseChild1Method()
    base2ExtendsClass.sayThing("come!")

  }
}
