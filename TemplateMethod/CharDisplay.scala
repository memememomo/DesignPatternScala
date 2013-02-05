class CharDisplay(ch: Char) extends AbstractDisplay {
  def open = System.out.print("<<")
  def print = System.out.print(ch)
  def close = println(">>")
}
