object Fibonacci {

  def main(args: Array[String]) {
    args.map(_.toInt).foreach(i =>println(fibonacciList(i)))
  }

  def nthFibonacci(i: Int): BigInt = fib.drop(i-1).head

  def fibonacciList(i: Int): List[BigInt] = fib.take(i).toList

  /**
   * @return Stream of sequential Fibonacci numbers.
   */
  private def fib: Stream[BigInt] = {
    def tail(h: BigInt, n: BigInt): Stream[BigInt] = h #:: tail(n, h + n)
    tail(0, 1)
  }

}
