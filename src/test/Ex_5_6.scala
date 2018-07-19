package test

object Ex_5_6 {
  def main(args: Array[String]): Unit = {
    val g = f _
    println(g(1))
  }

  def f(i: Int) = i
}
