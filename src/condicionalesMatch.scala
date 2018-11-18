object condicionalesMatch extends App {

  def calculateMonth(monthNumber : Int) = {
    var result : String = ""
    mes match {
      case 1 => result ="Enero"
      case 2 => result ="Febrero"
      case 3 => result="Marzo"
      case 4 => result="Abril"
      case 5 => result="Mayo"
      case 6 => result="Junio"
      case 7 => result="Julio"
      case 8 => result="Agosto"
      case 9 => result="Septiembre"
      case 10 => result="Octubre"
      case 11 => result="Noviembre"
      case 12 => result="diciembre"
      case _ => result="Ninguno"
    }
    result
  }

  val mes = 10
  var cmonth = calculateMonth(mes)
  println(cmonth)

}
