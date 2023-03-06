package com.tqy.regular

import scala.util.matching.Regex

object ScalaTest {

  def main(args: Array[String]): Unit = {

    //var不行
    val reg:Regex = """local\[(\*)\]""".r


    var str = "local[*]"

   val result = str match {
     case "local" => "match local"
     case reg(t) => s"match reg ${t}"
   }

  println(result)
  }

  // Regular expression used for local[N] and local[*] master formats
  val LOCAL_N_REGEX = """local\[([0-9]+|\*)\]""".r
  // Regular expression for local[N, maxRetries], used in tests with failing tasks
  val LOCAL_N_FAILURES_REGEX = """local\[([0-9]+|\*)\s*,\s*([0-9]+)\]""".r
  // Regular expression for simulating a Spark cluster of [N, cores, memory] locally
  val LOCAL_CLUSTER_REGEX = """local-cluster\[\s*([0-9]+)\s*,\s*([0-9]+)\s*,\s*([0-9]+)\s*]""".r
  // Regular expression for connecting to Spark deploy clusters
  val SPARK_REGEX = """spark://(.*)""".r

  private[regular] def numDriverCores(master: String): Int = {
    def convertToInt(threads: String): Int = {
      if (threads == "*") Runtime.getRuntime.availableProcessors() else threads.toInt
    }
    master match {
      case "local" => 1
      case LOCAL_N_REGEX(threads) => convertToInt(threads)
      case LOCAL_N_FAILURES_REGEX(threads, _) => convertToInt(threads)
      case _ => 0 // Either driver is not being used, or its core count will be interpolated later
    }
  }





}
