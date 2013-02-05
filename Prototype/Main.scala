import framework._

object Main {
  def main(args: Array[String]) = {
	// 準備
	val manager = new Manager
	val upen = new UnderlinePen('~')
	val mbox = new MessageBox('*')
	val sbox = new MessageBox('/')
	manager.register("strong message", upen)
	manager.register("warning box", mbox)
	manager.register("slash box", sbox)

	// 生成
	val p1 = manager.create("strong message")
	p1.use("Hello, world.")
	val p2 = manager.create("warning box")
	p2.use("Hello, world.")
	val p3 = manager.create("slash box")
	p3.use("Hello, world.")
  }
}
