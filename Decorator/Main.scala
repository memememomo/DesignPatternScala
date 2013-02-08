object Main {
  def main(args: Array[String]) = {
	val b1 = new StringDisplay("Hello, world.")
	val b2 = new SideBorder(b1, '#')
	val b3 = new FullBorder(b2)
	b1.show
	b2.show
	b3.show
	val b4 =
	  new SideBorder(
		new FullBorder(
		  new FullBorder(
			new SideBorder(
			  new FullBorder(
				new StringDisplay("こんにちは。")
			  ),
			  '*'
			)
		  )
		),
		'/'
	  )
	b4.show
  }
}
