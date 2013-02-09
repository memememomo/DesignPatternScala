trait State {
  def doClock(context: Context, hour: Int)
  def doUse(context: Context)
  def doAlarm(context: Context)
  def doPhone(context: Context)
}
