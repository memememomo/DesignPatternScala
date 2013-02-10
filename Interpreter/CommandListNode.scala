import java.util.ArrayList

class CommandListNode extends Node {
  private val list = new ArrayList[Node]
  def parse(context: Context): Unit = {
	while (true) {
	  if (context.currentToken == null) {
		throw new ParseException("Missing 'end'")
	  } else if (context.currentToken == "end") {
		context.skipToken("end")
		return
	  } else {
		val commandNode = new CommandNode
		commandNode.parse(context)
		list.add(commandNode)
	  }
	}
  }

  override def toString = list.toString
}
