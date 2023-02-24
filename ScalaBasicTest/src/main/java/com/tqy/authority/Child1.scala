package com
package tqy{

  import com.tqy.authority.Parent1

  class Child2 extends Parent1{
//    privateMethod()
//    privatePMethod()
    defaultMethod()

  }
  package authority{

    import com.tqy.authority.PublicData._
    class Child1 extends Parent1 {
      privatePMethod()
      defaultMethod()
      //    privateMethod()


      def method1(): Unit ={
        //    val privateBirthday = privateTime
        val privatePBirthday = privatePTime
        //    val protectedBirthday = protectedTime
        val defaultBirthday = defaultTime
      }


    }

    object Child1{
      def main(args: Array[String]): Unit = {

      }
    }
}







}
