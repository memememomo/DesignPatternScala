class Singleton

object Singleton {
  private val singleton = new Singleton
  println("インスタンスを生成しました。")
  def getInstance: Singleton = singleton
}
