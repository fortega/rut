def verificador(rut: String): String = {
    val modulus = 11 - rut.
        zip(LazyList.from(0).map(_ % 5 + 2)). // creamos tuplas entre caracteres y secuencia de test
        map{case (a,b) => a.toString.toInt * b}. // convertimos caracter a entero y multiplicmos
        reduce(_+_) % 11 // sumamos multiplicaciones y calculamos resto

    modulus match {
        case 11 => "0"
        case 10 => "K"
        case _ => modulus.toString
    }
}
println(verificador("1")) // 9