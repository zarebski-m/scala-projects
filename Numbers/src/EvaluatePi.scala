import scala.math.BigDecimal.RoundingMode

object EvaluatePi {

  def main(args: Array[String]) {
    args map (_.toInt) map calcPi foreach println
  }

  def calcPi(n: Int): BigDecimal = List.range(0, n)
    .map(n => nthPiDigit(n))
    .foldLeft(BigDecimal(0))(_ + _)
    .setScale(n, RoundingMode.FLOOR)

  /**
   * Find n-th digit of PI in base 16.
   * Implementation of Bailey-Borwein-Plouffe formula:
   * https://en.wikipedia.org/wiki/Bailey%E2%80%93Borwein%E2%80%93Plouffe_formula
   */
  private def nthPiDigit(n: Int): BigDecimal = 1 / BigDecimal(16).pow(n) *
    (poly(4, 1)(n) - poly(2, 4)(n) - poly(1, 5)(n) - poly(1, 6)(n))

  private def poly(nom: Int, k: Int)(n: Int): BigDecimal = nom / BigDecimal(8 * n + k)

}
