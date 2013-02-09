class LimitSupport(name: String, l: Int) extends Support(name) {
  val limit = l
  def resolve(trouble: Trouble): Boolean = {
	if (trouble.getNumber < limit) {
	  return true
	} else {
	  return false
	}
  }
}
