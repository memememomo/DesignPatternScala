import java.util._
import java.io._


object Main {
  def main(args: Array[String]) = {
	try {
	  val reader = new BufferedReader(new FileReader("program.txt"))
	  var text: String = ""
	  while ({text = reader.readLine; text != null}) {
		println("text = \"" + text + "\"")
		val node = new ProgramNode
		node.parse(new Context(text))
		println("node = " + node)
	  }
	} catch {
	  case e: Exception => e.printStackTrace
	}
  }
}
