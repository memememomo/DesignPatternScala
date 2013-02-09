package pagemaker

import java.io.FileWriter
import java.io.IOException
import java.util.Properties

object PageMaker {
  def makeWelcomePage(mailaddr: String, filename: String) = {
	try {
	  val mailprop = Database.getProperties("maildata")
	  val username = mailprop.getProperty(mailaddr)
	  val writer = new HtmlWriter(new FileWriter(filename))
	  writer.title("Welcome to " + username + "'s page!")
	  writer.paragraph(username + "のページへようこそ。")
	  writer.paragraph("メールまっていますね。")
	  writer.mailto(mailaddr, username)
	  writer.close
	  println(filename + " is created for " + mailaddr + " (" + username + ")")
	} catch {
	  case e: IOException => e.printStackTrace
	}
  }
}
