class PrimitiveCommandNode extends Node {
  private var name: String = ""
  def parse(context: Context) = {
	name = context.currentToken
	context.skipToken(name)
	if (name != "go" && name != "right" && name != "left") {
	  throw new ParseException(name + " is undefined")
	}
  }

  override def toString = name
}
