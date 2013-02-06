package tablefactory
import factory._

class TableFactory extends Factory {
  def createLink(caption: String, url: String) = new TableLink(caption, url)
  def createTray(caption: String) = new TableTray(caption)
  def createPage(title: String, author: String) = new TablePage(title, author)
}
