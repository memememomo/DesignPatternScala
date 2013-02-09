import java.awt.Checkbox
import java.awt.CheckboxGroup
import java.awt.event.ItemListener
import java.awt.event.ItemEvent


class ColleagueCheckbox(caption: String, group: CheckboxGroup, state: Boolean) extends Checkbox(caption, group, state) with ItemListener with Colleague {
  private var mediator: Mediator = null
  def setMediator(mediator: Mediator) = this.mediator = mediator
  def setColleagueEnabled(enabled: Boolean) = setEnabled(enabled)
  def itemStateChanged(e: ItemEvent) = mediator.colleagueChanged
}
