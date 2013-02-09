import java.awt.Frame
import java.awt.Label
import java.awt.Color
import java.awt.Button
import java.awt.TextField
import java.awt.TextArea
import java.awt.Panel
import java.awt.BorderLayout
import java.awt.event.ActionListener
import java.awt.event.ActionEvent

class SafeFrame(title: String) extends Frame(title) with ActionListener with Context {
  private val textClock = new TextField(60)
  private val textScreen = new TextArea(10, 60)
  private val buttonUse = new Button("金庫使用")
  private val buttonAlarm = new Button("非常ベル")
  private val buttonPhone = new Button("通常通話")
  private val buttonExit = new Button("終了")

  private var state_ = DayState.getInstance

  setBackground(Color.lightGray)
  setLayout(new BorderLayout)

  add(textClock, BorderLayout.NORTH)
  textClock.setEditable(false)

  add(textScreen, BorderLayout.CENTER)
  textScreen.setEditable(false)

  val panel = new Panel
  panel.add(buttonUse)
  panel.add(buttonAlarm)
  panel.add(buttonPhone)
  panel.add(buttonExit)

  add(panel, BorderLayout.SOUTH)

  pack
  setVisible(true)

  buttonUse.addActionListener(this)
  buttonAlarm.addActionListener(this)
  buttonPhone.addActionListener(this)
  buttonExit.addActionListener(this)

  def actionPerformed(e: ActionEvent) = {
	println(e.toString)
	if (e.getSource == buttonUse) {
	  state_.doUse(this)
	} else if (e.getSource == buttonAlarm) {
	  state_.doAlarm(this)
	} else if (e.getSource == buttonPhone) {
	  state_.doPhone(this)
	} else if (e.getSource == buttonExit) {
	  sys.exit(0)
	} else {
	  println("?")
	}
  }

  def setClock(hour: Int) = {
	var clockstring = "現在時刻は"
	if (hour < 10) {
	  clockstring += "0" + hour + ":00"
	} else {
	  clockstring += hour + ":00"
	}
	println(clockstring)
	textClock.setText(clockstring)
	state_.doClock(this, hour)
  }

  def changeState(state: State) = {
	println(this.state_ + "から" + state + "へ状態が変化しました。")
	this.state_ = state
  }

  def callSecurityCenter(msg: String) = textScreen.append("call! " + msg + "\n")
  def recordLog(msg: String) = textScreen.append("record ... " + msg + "\n")
}
