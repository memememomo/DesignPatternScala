abstract class Visitor {
  def visit(file: File)
  def visit(directory: Directory)
}
