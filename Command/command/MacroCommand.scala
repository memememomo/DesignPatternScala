package command

import java.util.Stack
import java.util.Iterator

class MacroCommand extends Command {

  private var commands = new Stack[Command]

  def execute = {
	val it = commands.iterator
	while (it.hasNext) {
	  it.next.asInstanceOf[Command].execute
	}
  }

  def append(cmd: Command) = {
	if (cmd != this) {
	  commands.push(cmd)
	}
  }

  def undo = {
	if (!commands.empty) {
	  commands.pop
	}
  }

  def clear = commands.clear
}
