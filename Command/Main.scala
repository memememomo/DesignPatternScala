import command._
import drawer._

import java.awt._
import java.awt.event._
import javax.swing._


class Main(title: String) extends JFrame(title) with ActionListener with MouseMotionListener with WindowListener {
  private val history = new MacroCommand
  private val canvas = new DrawCanvas(400, 400, history)
  private val clearButton = new JButton("clear")

  this.addWindowListener(this)
  canvas.addMouseMotionListener(this)
  clearButton.addActionListener(this)

  val buttonBox = new Box(BoxLayout.X_AXIS)
  buttonBox.add(clearButton)
  val mainBox = new Box(BoxLayout.Y_AXIS)
  mainBox.add(buttonBox)
  mainBox.add(canvas)
  getContentPane.add(mainBox)

  pack
  setEnabled(true)

  def actionPerformed(e: ActionEvent) = {
	if (e.getSource == clearButton) {
	  history.clear
	  canvas.repaint
	}
  }

  def mouseMoved(e: MouseEvent) = {}
  def mouseDragged(e: MouseEvent) = {
	val cmd = new DrawCommand(canvas, e.getPoint)
	history.append(cmd)
	cmd.execute
  }

  def windowClosing(e: WindowEvent) = {
	sys.exit(0)
  }
  def windowActivated(e: WindowEvent) = {}
  def windowClosed(e: WindowEvent) = {}
  def windowDeactivated(e: WindowEvent) = {}
  def windowDeiconified(e: WindowEvent) = {}
  def windowIconified(e: WindowEvent) = {}
  def windowOpened(e: WindowEvent) = {}
}


object Main {
  def main(args: Array[String]) = {
	val main = new Main("Command Pattern Sample")
  }
}
