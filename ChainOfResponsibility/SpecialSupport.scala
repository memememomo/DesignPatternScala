class SpecialSupport(name: String, n: Int) extends Support(name) {
  val number = n
  def resolve(trouble: Trouble): Boolean = {
	if (trouble.getNumber == number) {
	  return true
	} else {
	  return false
	}
  }
}
