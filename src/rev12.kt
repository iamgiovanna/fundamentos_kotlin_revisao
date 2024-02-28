package fundamentos
fun main(args: Array<String>){
    val nota = 9

    if(nota in 9 ..10)
    {
        println("Fantastico")
    }else if(nota in 7 ..8)
    {
        println("Parabéns")
    }else if(nota in 4..6)
    {
        println("Tem como recuperar!")
    }
    else if(nota in 0 ..6)
    {
        println("Te vejo o no próximo ano!")
    }
    else{
        println("Nota inválida!")
    }

}