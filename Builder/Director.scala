class Director(builder: Builder) {
  def construct = {
	builder.makeTitle("Greeting")
	builder.makeString("朝から昼にかけて")
	builder.makeItems(Array(
	  "おはようございます。",
	  "こんにちは。"
	))
	builder.makeString("夜に")
	builder.makeItems(Array(
	  "こんばんは。",
	  "おやすみなさい。",
	  "さようなら。"
	))
	builder.close
  }
}
