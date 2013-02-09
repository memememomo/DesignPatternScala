import java.util.HashMap

class BigCharFactory {
  private val pool = new HashMap[String, BigChar]

  def getBigChar(charname: Char): BigChar = {
	synchronized {
	  var bc = pool.get("" + charname).asInstanceOf[BigChar]
	  if (bc == null) {
		bc = new BigChar(charname)
		pool.put("" + charname, bc)
	  }
	  return bc
	}
  }
}


object BigCharFactory {
  private val singleton = new BigCharFactory
  def getInstance = singleton
}
