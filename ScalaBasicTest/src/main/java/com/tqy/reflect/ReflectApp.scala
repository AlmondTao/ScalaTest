package com.tqy.reflect

import java.lang.reflect.Method

object ReflectApp extends App {

  private val user = new User()
  private val classUser: Class[User] = classOf[User]

  private val loginMethod: Method = classUser.getDeclaredMethod("login")

  loginMethod.invoke(user)

  private val deleteUser: Method = classUser.getDeclaredMethod("deleteUser")

  deleteUser.setAccessible(true)
  deleteUser.invoke(user)



}
