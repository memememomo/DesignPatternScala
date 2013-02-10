package drawer

import command.Command
import java.awt.Point

class DrawCommand(d: Drawable, p: Point) extends Command {
  val drawable = d
  val position = p
  def execute = drawable.draw(position.x, position.y)
}
