object EvaluatePi {

  def main(args: Array[String]) {
    args map (s => s.toInt) map (n => Evaluator.calcPi(n)) foreach (x => println(x))
  }

}
