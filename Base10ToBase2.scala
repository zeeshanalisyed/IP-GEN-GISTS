import scala.annotation.tailrec

object Base10ToBase2 extends App {
  val base: Int = 2;
  
  println(toBinary(294))

  def toBinary(num: Int): String = {
    var result: List[Int] = List();
    // @tailrec
    def binary(n: Int): String = {
      if (n == 1) "1" else (binary(n/base).toString) + ((n%2).toString)
    }
    binary(num);
  }
}
