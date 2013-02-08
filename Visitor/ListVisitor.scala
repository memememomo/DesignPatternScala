import java.util.Iterator

class ListVisitor extends Visitor {
  private var currentdir: String = ""
  def visit(file: File) = println(currentdir + "/" + file)
  def visit(directory: Directory) = {
	println(currentdir + "/" + directory)
	val savedir: String = currentdir
	currentdir = currentdir + "/" + directory.getName
	val it = directory.iterator
	while (it.hasNext) {
	  val entry = it.next.asInstanceOf[Entry]
	  entry.accept(this)
	}
	currentdir = savedir
  }
}
