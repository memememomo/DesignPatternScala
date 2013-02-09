class NoSupport(name: String) extends Support(name) {
  def resolve(trouble: Trouble): Boolean = false
}
