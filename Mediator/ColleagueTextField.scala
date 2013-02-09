import java.awt.TextField
import java.awt.Color
import java.awt.event.TextListener
import java.awt.event.TextEvent

class ColleagueTextField(text: String, columns: Int) extends TextField(text, columns) with TextListener with Colleague {
  private var mediator: Mediator = null
  def setMediator(mediator: Mediator) = {
	this.mediator = mediator
  }
  def setColleagueEnabled(enabled: Boolean) = {
	setEnabled(enabled)
	setBackground(if(enabled) Color.white else Color.lightGray)
  }
  def textValueChanged(e: TextEvent) = mediator.colleagueChanged
}
