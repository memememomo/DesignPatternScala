class OddSupport(name: String) extends Support(name) {
  def resolve(trouble: Trouble): Boolean = {
	if (trouble.getNumber % 2 == 1) {
	  return true
	} else {
	  return false
	}
  }
}
