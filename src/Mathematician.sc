object buclesFor {
  val lenguajes = Seq("java", "scala", "gosu", "kotlin")
  val opiniones = Seq("conciso", "atrevido", "moderno", "aburrido", "estupenda")

  lenguajes.foreach(l => opiniones.foreach(o => println(s"$l me parece un buen lenguaje") ) )

  println("FORECH************")
  for (i <- lenguajes if i.endsWith("a") ; o <- opiniones) {
    println(s"$i me parece $o")
  }

  println("FORECH FILTER************")
  for (i <- lenguajes.filter(leng => leng.endsWith("a")) ; o <- opiniones.filter(opi => opi.endsWith("a"))) {
    println(s"$i me parece $o")
  }

}