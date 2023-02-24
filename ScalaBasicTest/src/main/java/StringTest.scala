object StringTest {

  def main(args: Array[String]): Unit = {
    val str:String = "a"+"b"+"c";
    var str2 = s"hello ${str}";
    val str3 = s"""
                  |select
                  |*
                  |from
                  |$str
                  |where
                  |id
                  |=
                  |"$str2"
                  |""".stripMargin

    val str4 =
      s"""
         %hello
         %everybody
         %""".stripMargin('%')

    println(str)
    println(str2)
    printf("hello %S\n","print")
    println(str3)
    println(str4)




  }

}
