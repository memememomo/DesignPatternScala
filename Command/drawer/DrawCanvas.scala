package drawer

import command._

import java.util._
import java.awt._
import java.awt.event._
import javax.swing._

class DrawCanvas(width: Int, height: Int, h: MacroCommand) extends Canvas with Drawable {
  val color = Color.red
  val radius = 6
  val history = h

  setSize(width, height)
  setBackground(Color.white)

  override def paint(g: Graphics) = history.execute
  override def draw(x: Int, y: Int) = {
	val g = getGraphics
	g.setColor(color)
	g.fillOval(x - radius, y - radius, radius * 2, radius * 2)
  }
}
