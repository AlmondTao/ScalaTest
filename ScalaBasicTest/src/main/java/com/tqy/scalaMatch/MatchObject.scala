package com.tqy.scalaMatch


object MatchObject {
  def main(args: Array[String]): Unit = {
    val user =  new User("zhangsan", 23)

    val result = user match {
      case User("zhangsan", 23) => "yes"
      case _ => "no"
    }
    println(result)

  }

}
//	样例类就是使用case关键字声明的类
//	样例类仍然是类，和普通类相比，只是其自动生成了伴生对象，并且伴生对象中自动提供了一些常用的方法，如apply、unapply、toString、equals、hashCode和copy。
//	样例类是为模式匹配而优化的类，因为其默认提供了unapply方法，因此，样例类可以直接使用模式匹配，而无需自己实现unapply方法。
//	构造器中的每一个参数都成为val，除非它被显式地声明为var（不建议这样做）
case class User(str: String,var i: Int)
//class User(name:String,age:Int){
//  val uname = name;
//  val uage = age;
//
//  def this(){
//    this("",0)
//  }
//}
//
//object User{
//  def unapply(user : User):Option[(String ,Int)] ={
//    if(user == null)
//     None
//    else
//     Option(user.uname,user.uage)
//  }
//
//
//}
