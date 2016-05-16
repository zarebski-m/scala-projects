object FizzBuzz {

  def main(args: Array[String]) {
    (1 until 100).map(fizzBuzz).foreach(println)
  }

  private def fizzBuzz(n: Int) = {
    (n % 3, n % 5) match {
      case (0, 0)  => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case (_, _) => n
    }
  }

}
