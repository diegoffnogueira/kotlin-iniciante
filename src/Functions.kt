fun main() {
    println(numberOfCharacters("Diego Felipe"))
    numberOfCharactersText("Parametro")
}

fun numberOfCharacters(texto: String): Int{
    return texto.length
}

fun numberOfCharactersText(texto: String){
    println("A String -$texto- possui ${texto.length} caracteres.")
}