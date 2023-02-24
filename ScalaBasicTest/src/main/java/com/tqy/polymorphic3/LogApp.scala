package com.tqy.polymorphic3

class LogApp extends MongoDB with HbaseDB {



}

object LogApp extends App{
  private val app: LogApp = new LogApp

  app.writeLog

}
