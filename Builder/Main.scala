object Main {
  def main(args: Array[String]) = {
	if (args.length != 1) {
	  usage
	  sys.exit(0)
	}
	if (args(0) == "plain") {
	  val textbuilder = new TextBuilder
	  val director = new Director(textbuilder)
	  director.construct;
	  val result = textbuilder.getResult
	  println(result)
	} else if (args(0) == "html") {
	  val htmlbuilder = new HTMLBuilder
	  val director = new Director(htmlbuilder)
	  director.construct
	  val filename = htmlbuilder.getResult
	  println(filename + "が作成されました。")
	} else {
	  usage;
	  sys.exit(0)
	}
  }
  def usage = {
	println("Usage: scala Main plain プレーンテキストで文書作成")
	println("Usage: scala Main html  HTMLファイルで文書作成")
  }
}
