import java.util._

class Context(text: String) {
  var currentToken: String = ""
  val tokenizer = new StringTokenizer(text)
  nextToken

  def nextToken: String = {
	if (tokenizer.hasMoreTokens) {
	  currentToken = tokenizer.nextToken
	} else {
	  currentToken = null
	}
	return currentToken
  }

  def skipToken(token: String) = {
	if (token != currentToken) {
	  throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.")
	}
	nextToken
  }

  def currentNumber: Int = {
	var number: Int = 0
	try {
	  number = Integer.parseInt(currentToken)
	} catch {
	  case e: NumberFormatException => throw new ParseException("Warning: " + e)
	}
	return number
  }
}
