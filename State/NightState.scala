class NightState extends State {
  def doClock(context: Context, hour: Int) = {
	if (9 <= hour && hour < 17) {
	  context.changeState(DayState.getInstance)
	}
  }
  def doUse(context: Context) = context.callSecurityCenter("非常：夜間の金庫使用！")
  def doAlarm(context: Context) = context.callSecurityCenter("非常ベル(夜間)")
  def doPhone(context: Context) = context.recordLog("夜間の通話録音")
  override def toString: String = "[夜間]"
}


object NightState {
  private val singleton = new NightState
  def getInstance: State = singleton
}
