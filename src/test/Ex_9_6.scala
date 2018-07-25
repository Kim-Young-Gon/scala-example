package test

object Ex_9_6 {
  object Object1 {
    private def ma = {}
    def mb = {}
  }

  object Object2 {
//    val a = Object1.ma // 컴파일 오류
    val b = Object1.mb // 정상
  }

  def main(args: Array[String]): Unit = {
    println(Object1.mb)
    println(Object2.b)
  }
}
