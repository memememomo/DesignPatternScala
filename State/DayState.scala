class DayState extends State {
  def doClock(context: Context, hour: Int) = {
	if (hour < 9 || 17 <= hour) {
	  context.changeState(NightState.getInstance)
	}
  }
  def doUse(context: Context) = context.recordLog("金庫使用(昼間)")
  def doAlarm(context: Context) = context.callSecurityCenter("非常ベル(昼間)")
  def doPhone(context: Context) = context.callSecurityCenter("通常の通話(昼間)")
  override def toString: String = "[昼間]"
}


object DayState {
  private val singleton = new DayState
  def getInstance: State = singleton
}
