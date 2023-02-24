package com.tqy.scalaImplicit

object ScalaImplicitParameter {

  def main(args: Array[String]): Unit = {

    implicit val helloStr = "helloStr"

    def prt(implicit str:String)=println(str)



    prt

  }

}
