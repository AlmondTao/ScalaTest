import com.sun.deploy.util.StringUtils

import java.io.{BufferedReader, InputStreamReader}
import java.net.ServerSocket



object ServerTest {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    while(true){
      val socket = server.accept()
      val reader = new BufferedReader(new InputStreamReader(socket.getInputStream,"UTF-8"))

      var s = ""
      var flg = true
      while(flg){
        s = reader.readLine()
        if(s != null && !"".equals(s)){
          println(s)
        }else{
          flg = false
        }
      }

      socket.close()
    }
    server.close()

  }
}
