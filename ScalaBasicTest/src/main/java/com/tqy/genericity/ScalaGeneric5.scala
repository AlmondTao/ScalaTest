package com.tqy.genericity

object ScalaGeneric5 {
  /*
  上下文界定应用实例
  要求：使用上下文界定+隐式参数的方式，比较两个Person对象的年龄大小
  要求：使用Ordering实现比较
   */
  def main(args: Array[String]): Unit = {
    val person1 = new Person("zhangsan", 18)
    val person2 = new Person("lisi", 23)
    implicit var ctor :Ordering[Person] = new Ordering[Person]{
      override def compare(x: Person, y: Person): Int = x.age-x.age
    }

    val greaterPerson1 = new CompareCommon1(person1, person2).getGreater()
    println(greaterPerson1)

    val greaterPerson2 = new CompareCommon2[Person](person1, person2).getGreater
    println(greaterPerson2)

    val greaterPerson3 = new CompareCommon3[Person](person1, person2).getGreater
    println(greaterPerson3)




  }

  //方式1
  /*
  1.[T: Ordering]  泛型
  2.obj1: T, obj2: T  接受T 类型的参数
  3.implicit comparetor: Ordering[T]  隐式参数
   */
  class CompareCommon1[T:Ordering](obj1:T,obj2:T)(implicit comparetor:Ordering[T]){
    def getGreater()={
      if (comparetor.compare(obj1,obj2)>0) obj1 else obj2
    }
  }

  //方式2,将隐式参数放到方法内
  class CompareCommon2[T:Ordering](obj1:T,obj2:T){
    def getGreater(implicit comparetor:Ordering[T]) = if(comparetor.compare(obj1,obj2)>0) obj1 else obj2
  }

  //方式3 利用implicitly
  class CompareCommon3[T:Ordering](obj1:T,obj2:T){
    def getGreater = {
      val comparetor = implicitly[Ordering[T]]
      if (comparetor.compare(obj1,obj2)>0) obj1 else obj2

    }
  }


  class Person(var name:String,var age:Int){
    override def toString: String = this.name+"\t"+this.age
  }

}
