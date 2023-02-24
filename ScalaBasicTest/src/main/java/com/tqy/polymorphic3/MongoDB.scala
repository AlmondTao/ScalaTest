package com.tqy.polymorphic3

trait MongoDB extends WriteLog {

  override def writeLog = {
    print("向MongoDB--")
    super.writeLog
  }

}
