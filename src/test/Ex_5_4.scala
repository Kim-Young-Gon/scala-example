package test

object Ex_5_4 {
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(i: Int) = {
    println("탑승수속을 시작합니다.")
    i
  }

  def dropship(i: => Int) = {
    println("드랍십 준비합니다.")
    println(i + "명 탑승했습니다.")
  }
}
