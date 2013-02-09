import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

class BigChar(charname: Char) {
  var fontdata: String = null
  try {
	val reader = new BufferedReader(
	  new FileReader("big" + charname + ".txt")
	)
	var line: String = null
	val buf = new StringBuffer
	while ({line = reader.readLine; line != null}) {
	  buf.append(line)
	  buf.append("\n")
	}
	reader.close
	this.fontdata = buf.toString
  } catch {
	case e: IOException => this.fontdata = charname + "?"
  }

  def print = System.out.print(fontdata)
}
