import scala.collection.mutable

object maps extends App {
  val mapa = Map(1 -> "pepito", 2 -> "maria", 3 -> "pedro", 4 -> "carlos")
  mapa.keySet
  mapa.values
  mapa.get(1)
  mapa.get(9)
  mapa.getOrElse(9, null)
  mapa.contains(9)
  mapa.contains(2)
}


object mapsConcats {
  val mapa = Map(1 -> "pepito", 2 -> "maria")
  val mapa2 = Map(6 -> "juanita", 7 -> "jose")
  mapa + (3 -> "Luis", 4 -> "carlos")
  mapa - 1

  mapa ++ mapa2
}

object mapsMutable {
  val mapa = mutable.Map(1 -> "renault", 2 -> "bmw")

  mapa += (3 -> "opel")
  mapa.put(4, "Toyota")
  mapa(5) = "Mazda"
  mapa

  mapa -=1
  mapa

  mapa.clear()
}
