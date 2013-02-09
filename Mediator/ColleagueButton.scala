import java.awt.Button

class ColleagueButton(caption: String) extends Button(caption) with Colleague {
  private var mediator: Mediator = null
  def setMediator(mediator: Mediator) = this.mediator = mediator
  def setColleagueEnabled(enabled: Boolean) = setEnabled(enabled)
}
