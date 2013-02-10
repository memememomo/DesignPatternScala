class ProgramNode extends Node {
  private var commandListNode: Node = null
  def parse(context: Context) = {
	context.skipToken("program")
	commandListNode = new CommandListNode
	commandListNode.parse(context)
  }
  override def toString = "[program " + commandListNode + "]"
}
