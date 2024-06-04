fun main() {
    val safeText: String? = null
    val safeTextLength = safeText?.length?:5

    println(safeTextLength)
}