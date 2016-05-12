object StringReverse {

  def main(args: Array[String]) {
    args.transform(_.reverse).foreach(println)
  }

}
