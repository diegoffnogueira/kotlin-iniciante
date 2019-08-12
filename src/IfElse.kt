fun main() {
    println(higherNumber(20, 12))
    println(greaterNumberOrEqual(40, 40))
    pineapple(9)
    boxingFighters("Pena")
}

fun higherNumber(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun greaterNumberOrEqual(a: Int, b: Int): String {
    return when {
        a > b -> "Maior número $a"
        a < b -> "Maior número $b"
        else -> "Valores iguais"
    }
}

fun pineapple(quantity: Int){
    val total = if (quantity < 10){
        quantity * 3
    }else{
        quantity * 2
    }
    println("O valor total da compra é $total")
}

fun boxingFighters(description: String){
    when (description){
        "Pena" -> {
            println("Menos de 57 kg")
        }
        "Leve" -> {
            println("Mais de 57 kg e menos de 61 kg")
        }
        "Médio" -> {
            println("Mais de 61 kg e menos de 73 kg")
        }
        "Pesado" -> {
            println("Igual ou acima de 73 kg")
        }
    }
}