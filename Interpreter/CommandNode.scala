class CommandNode extends Node {
  private var node: Node = null
  def parse(context: Context) = {
	if (context.currentToken == "repeat") {
	  node = new RepeatCommandNode
	  node.parse(context)
	} else {
	  node = new PrimitiveCommandNode
	  node.parse(context)
	}
  }
  override def toString = node.toString
}
