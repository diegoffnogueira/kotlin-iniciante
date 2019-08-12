fun main() {

    for (i in 100..200 step 2) {
        println(i)
    }
    println()
    invertText("Diego")
    println()
    println()
    printNumbers(10, 15, false)
    println()
    println()
    ladder(10)
}

fun invertText(str: String) {

    println(str)
    var size = str.length

    while (size > 0) {
        print(str[size - 1])
        size--
    }

}

fun printNumbers(n1: Int, n2: Int, ascending: Boolean) {

    if (ascending) {
        for (i in n1..n2) {
            println(i)
        }
    } else {
        for (j in n2 downTo n1) {
            println(j)
        }
    }

}

fun ladder(n: Int){

    for (i in 1..n){
        for (k in 1..i){
            print("#")
        }
        println()
    }

}

