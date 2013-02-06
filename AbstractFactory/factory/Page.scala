package factory
import java.io._
import scala.collection.mutable.ArrayBuffer

abstract class Page(title: String, author: String) {
  val content = new ArrayBuffer[Item]
  def add(item: Item) = content += item
  def output = {
	try {
	  val filename = title + ".html"
	  val writer = new FileWriter(filename)
	  writer.write(this.makeHTML)
	  writer.close
	  println(filename + " を作成しました。")
	} catch {
	  case e: IOException => e.printStackTrace
	}
  }
  def makeHTML: String
}
