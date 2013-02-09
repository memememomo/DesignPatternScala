abstract class Support(name: String) {
  var next: Support = null
  def setNext(n: Support): Support = {
	next = n
	return next
  }
  def support(trouble: Trouble): Unit = {
	if (resolve(trouble)) {
	  done(trouble)
	} else if (next != null) {
	  next.support(trouble)
	} else {
	  fail(trouble)
	}
  }
  override def toString = "[" + name + "]"
  def resolve(trouble: Trouble): Boolean
  def done(trouble: Trouble) = println(trouble + " is resolved by " + this + ".")
  def fail(trouble: Trouble) = println(trouble + " cannot be resolved.")
}
