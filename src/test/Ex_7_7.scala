package test

object Ex_7_7 {
  def main(args: Array[String]): Unit = {
    var student1Ban = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이",
      4 -> "김이불",
      5 -> "이재현",
      6 -> "정미쳐",
      7 -> "차수홍",
      8 -> "최예림",
      9 -> "최한잔"
    )

    student1Ban += (10 -> "전학생") // 전학생이 와서 추가
    student1Ban -= 9 // 9번 학생이 전학을 감

    // 사람들이 많이 전학을 와서 2반을 생성
    var student2Ban = Map(
      11 -> "고세융",
      12 -> "권육삼",
      13 -> "김융찬",
      14 -> "김참치"
    )

    // 반을 나누는 건 비효율적이라고 생각해 반을 합침
    var students = student1Ban ++ student2Ban

    students.foreach(i => print(i)) // for 형태의 루프도 가능하고, foreach를 지원하는 컬렉션이라면 이런 표현도 가능
    println()
    // 선생님이 5번에게 발표를 시킴
    val callee = 5
    println("여기 " + callee + "번 없어?")
    // 5번이 반에 있는지 확인
    println(students.contains(5))
  }
}
