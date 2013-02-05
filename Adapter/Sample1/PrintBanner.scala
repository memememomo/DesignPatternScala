class PrintBanner(string: String) extends Banner(string) with Print {
  def printWeak = showWithParen;
  def printStrong = showWithAster;
}
