import com.sun.corba.se.impl.orbutil.ObjectWriter
import com.tqy.construct.User

import java.io.{OutputStreamWriter, PrintWriter}
import java.net.Socket

object ClientTest {

  def main(args: Array[String]): Unit = {
    val socket = new Socket("localhost",9999)
    val channel = socket.getChannel

//    val out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream,"UTF-8"))
//    out.println("hello scala")
//    out.print(65)
//    out.close()



    val writer = new OutputStreamWriter(socket.getOutputStream,"UTF-8")
    writer.write("hello scala!!")
    writer.flush()

    val user = new User()





    socket.close()


  }

}
