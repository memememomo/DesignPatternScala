import java.awt.Frame
import java.awt.Label
import java.awt.Color
import java.awt.CheckboxGroup
import java.awt.GridLayout
import java.awt.event.ActionListener
import java.awt.event.ActionEvent


class LoginFrame(title: String) extends Frame(title) with ActionListener with Mediator {
  private var checkGuest: ColleagueCheckbox = null
  private var checkLogin: ColleagueCheckbox = null
  private var textUser: ColleagueTextField = null
  private var textPass: ColleagueTextField = null
  private var buttonOk: ColleagueButton = null
  private var buttonCancel: ColleagueButton = null

  setBackground(Color.lightGray)
  setLayout(new GridLayout(4, 2))
  createColleagues

  add(checkGuest)
  add(checkLogin)
  add(new Label("Username:"))
  add(textUser)
  add(new Label("Password:"))
  add(textPass)
  add(buttonOk)
  add(buttonCancel)

  colleagueChanged

  pack
  setVisible(true)

  def createColleagues = {
	val g = new CheckboxGroup
	checkGuest = new ColleagueCheckbox("Guest", g, true)
	checkLogin = new ColleagueCheckbox("Login", g, false)
	textUser = new ColleagueTextField("", 10)
	textPass = new ColleagueTextField("", 10)
	textPass.setEchoChar('*')
	buttonOk = new ColleagueButton("OK")
	buttonCancel = new ColleagueButton("Cancel")

	checkGuest.setMediator(this)
	checkLogin.setMediator(this)
	textUser.setMediator(this)
	textPass.setMediator(this)
	buttonOk.setMediator(this)
	buttonCancel.setMediator(this)

	checkGuest.addItemListener(checkGuest)
	checkLogin.addItemListener(checkLogin)
	textUser.addTextListener(textUser)
	textPass.addTextListener(textPass)
	buttonOk.addActionListener(this)
	buttonCancel.addActionListener(this)
  }

  def colleagueChanged = {
	if (checkGuest.getState) {
	  textUser.setColleagueEnabled(false)
	  textPass.setColleagueEnabled(false)
	  buttonOk.setColleagueEnabled(true)
	} else {
	  textUser.setColleagueEnabled(true)
	  userpassChanged
	}
  }

  def userpassChanged = {
	if (textUser.getText.length > 0) {
	  textPass.setColleagueEnabled(true)
	  if (textPass.getText.length > 0) {
		buttonOk.setColleagueEnabled(true)
	  } else {
		buttonOk.setColleagueEnabled(false)
	  }
	} else {
	  textPass.setColleagueEnabled(false)
	  buttonOk.setColleagueEnabled(false)
	}
  }

  def actionPerformed(e: ActionEvent) = {
	println(e.toString)
	sys.exit(0)
  }
}
