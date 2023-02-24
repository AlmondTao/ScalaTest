package com.tqy.reflect

import com.tqy.reflect.User.modify

class User {

  def login: Unit ={
    modify
    println("User login")
  }

  private def deleteUser(){
    println("User delete")
  }

}

object User{
  def logout: Unit ={
    println("User logout")
  }

  def modify: Unit ={
    println("wait....")
  }


}
