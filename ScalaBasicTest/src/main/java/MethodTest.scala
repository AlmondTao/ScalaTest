object MethodTest {

  def changeStr(originalStr : String) : String ={
    originalStr.toUpperCase()

  }

  def main(args: Array[String]): Unit = {
//      val anyRef = changeStr("abc")
//    println(anyRef)

//    println(test1(1)(2))
    fun((a:String)=>a)
  }

  def test1(a:Int): Int => Int={
    (b:Int) => a+b

  }

  def fun (a:String=>Any): Unit ={
    println(a("123"))
  }

}
