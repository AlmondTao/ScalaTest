package com.tqy.polymorphic3

trait HbaseDB extends WriteLog {
  override def writeLog = {
    print("向HbaseDB--")
    super.writeLog
  }
}
