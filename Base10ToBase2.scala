import scala.annotation.tailrec
// Input Examples: 255,294,and 200
object Base10ToBase2 {
  val base: Int = 2;
  
  
  def parser(str: String): String = {
    val lentobe = 8 - str.length
    (1 to lentobe).map(_*0).mkString + str
  }
  
  def toBinary(num: Int): String = {
    var result: List[Int] = List();
    // @tailrec
    def binary(n: Int): String = {
      if (n == 1) "1" 
      else if (n < 1) "0" 
      else (binary(n/base).toString) + ((n%2).toString)
    }
    parser(binary(num));
  }
}
