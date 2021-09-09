def verificador(rut: String) = {
    def testSeq(length: Int, last: Int = 7, acc: List[Int] = List()): List[Int] = {
        if(length > 0){
            val next = if(last == 7) 2 else last + 1
            testSeq(length - 1, next, next :: acc)
        } else acc
    }
    
    11 - rut.
        map(_.toString.toInt).
        zip(testSeq(rut.length)).
        map{case (a,b) => a*b}.
        reduce(_+_) % 11
}
println(verificador("1")) // 9