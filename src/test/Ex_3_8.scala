package test

object Ex_3_8 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 until 5 ; y <- 1 until 5) {
      print(x + " * " + y + " = " + x * y + "|")
    }
  }
}
