object bucles extends App {
  var k = 0
  while (k < 20) {
    println(s"k vale $k")
    k = k + 1
  }
}

object buclesDoWhile extends App {
  var k = 0

  do {
    println(s"k vale $k")
    k = k + 1
  } while (k < 20)
}

object buclesFor extends App {
  val lenguajes = Seq("java", "scala", "gosu", "kotlin")
  val opiniones = Seq("conciso", "atrevido", "moderno", "aburrido", "estupenda")

  println("FOREACH************")
  lenguajes.foreach(l => opiniones.foreach(o => println(s"$l me parece un buen lenguaje") ) )

  println("FOR************")
  for (i <- lenguajes if i.endsWith("a") ; o <- opiniones) {
    println(s"$i me parece $o")
  }

  println("FORECH FILTER************")
  for (i <- lenguajes.filter(leng => leng.endsWith("a")) ; o <- opiniones.filter(opi => opi.endsWith("a"))) {
    println(s"$i me parece $o")
  }
}