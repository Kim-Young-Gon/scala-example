package test

object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly
  }

  class Animal extends Flying with Swimming {
    override def fly = println("오버라이드된 메서드")
  }

  trait Swimming {
    def swim = println("수영을 합니다. 촤아~")
  }

  trait Flying {
    def fly = println("납니다. 휘리릭~")
  }

  trait Running {
    def run = println("달립니다. 슈웅~")
  }

  trait Eating {
    def eat
  }
}
