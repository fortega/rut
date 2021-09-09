def verificador(rut: String) = {
    def testSeq(length: Int, last: Int = 7, acc: List[Int] = List()): List[Int] = {
        if(length > 0){
            val next = if(last == 7) 2 else last + 1
            testSeq(length - 1, next, next :: acc)
        } else acc
    }
    
    def charToInt(a: Char) = a.toString.toInt
    
    11- rut.
        map(charToInt).
        zip(testSeq(rut.length)).
        map{case (a,b) => a*b}.
        reduce(_+_) % 11
}

val rut = "1"
println(verificador(rut))