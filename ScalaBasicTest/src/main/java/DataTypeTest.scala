import com.tqy.construct.User

object DataTypeTest {


  def main(args: Array[String]): Unit = {

    val byteData : Byte = 1
    val shortData : Short = 2
    val charData : Char = 2
    val intData : Int = 4
    val longData : Long = 8l
    val floatData : Float = 4f

    val doubleData : Double = 8d



//    println(byteData.*(2))

    val l = (child:Long,typeName:String) => println("值:"+child+",类型:"+typeName +"隐式转换成 long ")
    val f = (child:Float,typeName:String) => println("值:"+child+",类型:"+typeName +"隐式转换成 float ")
    val d = (child:Double,typeName:String) => println("值:"+child+",类型:"+typeName +"隐式转换成 double ")



    anyValChild(byteData)
    anyValChild(shortData)
    anyValChild(charData)
    anyValChild(intData)
    anyValChild(floatData)
    anyValChild(longData)
    this anyValChild doubleData
    println("#######################################")
    shortTransform(byteData,byteData.getClass.toString)
    println("#######################################")
    intTransform(shortData,shortData.getClass.toString)
    this intTransform (charData,charData.getClass.toString)

    l (intData,intData.getClass.toString)

    f (longData,longData.getClass.toString)

    d (floatData,floatData.getClass.toString)

    println("#######################################")

//    anyRefChild()


  }

  new User

  def anyValChild(child:AnyVal): Unit ={
    println("value:"+child+",type:"+child.getClass.toString +" is anyVal 's child")
  }

  def anyRefChild(child:AnyRef): Unit ={
    println("value:"+child+",type:"+child.getClass.toString +" is anyRef 's child")
  }

  def shortTransform(child:Short,typeName:String){
    println("值:"+child+",类型:"+typeName +"隐式转换成 short ")
  }

  def intTransform(child:Int,typeName:String) = println("值:"+child+",类型:"+typeName +"隐式转换成 int ")





}
