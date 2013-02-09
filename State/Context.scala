trait Context {
  def setClock(hour: Int)
  def changeState(state: State)
  def callSecurityCenter(msg: String)
  def recordLog(msg: String)
}
