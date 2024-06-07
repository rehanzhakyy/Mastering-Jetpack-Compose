fun main() {
    // lambda
    val sum = { x: Int, y: Int -> x + y }

    val result = sum(10, 20)
    println(result)
}