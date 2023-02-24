package com.tqy.scalaImplicit

object ScalaImplicitClass {

  def main(args: Array[String]): Unit = {

//    所谓的隐式机制，就是一旦出现编译错误时，编译器会从哪些地方查找对应的隐式转换规则
//    	当前代码作用域
//    	当前代码上级作用域
//    	当前类所在的包对象
//    	当前类（对象）的父类（父类）或特质（父特质）
//    其实最直接的方式就是直接导入。


    val parent = new Parent("zhangsan")

    parent.insert("parent")
    parent.update("parent")

    println("parent.name:"+parent.cName)

  }

  class Parent(name:String){
    val pName = name
    def insert(str:String)= println("insert:"+str)
  }

  implicit class Child(p:Parent){
    val cName = p.pName+"2号"
    def update(str:String) = println("update:"+str)
  }

}
