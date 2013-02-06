package listfactory
import factory._

class ListFactory extends Factory {
  def createLink(caption: String, url: String) = new ListLink(caption, url)
  def createTray(caption: String) = new ListTray(caption)
  def createPage(title: String, author: String) = new ListPage(title, author)
}
