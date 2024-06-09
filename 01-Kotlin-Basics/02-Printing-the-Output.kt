/*fun main() {
    // HOF
    printResult(50, sum)
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = {value -> value + value}

 */

fun main() {
    printResult(50) { value ->
        value + value + value
    }
}
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

