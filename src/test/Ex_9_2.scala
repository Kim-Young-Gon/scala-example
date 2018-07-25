package test

object Ex_9_2 {
  def main(args: Array[String]): Unit = {
    val list = List(10, 20, 40, 55)
    val result = list.foldLeft(0)((total, item) => total + item)
    println(result)
  }
}
