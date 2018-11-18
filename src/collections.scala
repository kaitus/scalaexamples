object collections extends App {
  val frutas = Array("Pera","Manzana","Naranja","Uvas")

  println(frutas.apply(2))
  println(frutas.indexOf("Pera"))
  println(frutas indexOf "Pera")
  println(frutas.length)
  println(frutas.isEmpty)
  println(frutas.nonEmpty)
}

object collectionsMap extends App {
  val numeros = List(4,8,15,23,42)
  println(numeros.map { x => x * x })

  val carros = List("mazda","mercedes","renault")
  println(carros.map { carro => carro.toUpperCase()})
  println(carros.map { _.toUpperCase() })
}

object collectionsFlatten extends App {
  val lista = List( List(1,2,6), List(2,3,5), List(5,7,1), List(4,8,3))
  lista.flatten
  lista.map { (x: List[Int]) => x.map { n => n * 2 }}.flatten
  lista.flatMap { (x: List[Int]) => x.map { n => n * 2 }}

  val numeros = List( 4,8,15,16,23,42)
  numeros.flatMap { x => List(x, x * 2) }

  val carros = List("mazda","mercedes","renault","seat")
  carros.flatMap { c => c.toUpperCase}.distinct
  carros.flatMap { _.toUpperCase}
}