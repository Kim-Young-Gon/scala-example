package test

object Ex_4_6 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal2
    pig.eat
  }
}

class Animal2 extends Eating {
  def eat: Unit = println("먹습니다. 쩝쩝~")
}
