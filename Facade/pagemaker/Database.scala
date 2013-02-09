package pagemaker

import java.io.FileInputStream
import java.io.IOException
import java.util.Properties

object Database {
  def getProperties(dbname: String): Properties = {
	val filename = dbname + ".txt"
	val prop = new Properties
	try {
	  prop.load(new FileInputStream(filename))
	} catch {
	  case e: IOException => println("Warning: " + filename + " is not found.")
	}
	return prop
  }
}
