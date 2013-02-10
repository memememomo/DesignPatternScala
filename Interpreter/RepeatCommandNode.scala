class RepeatCommandNode(context: Context) extends Node {
  private var number: Int = 0
  private var commandListNode:CommandListNode = null

  def this() = this(null)

  def parse(context: Context) = {
	context.skipToken("repeat")
	number = context.currentNumber
	context.nextToken
	commandListNode = new CommandListNode
	commandListNode.parse(context)
  }

  override def toString: String = "[repeat " + number + " " + commandListNode + "]"
}
