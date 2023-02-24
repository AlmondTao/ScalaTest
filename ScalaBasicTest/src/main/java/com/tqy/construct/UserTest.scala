package com.tqy.construct

object UserTest {
  def main(args: Array[String]): Unit = {
    val u1 = new User()
    println("--------------")
    val u11 = new User("李四")
    println("--------------")
    val u2 = User();
    println("--------------")
    lazy val u3 = User

    u1.setUserage(16)

  }
}
