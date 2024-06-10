class gatot(
    private var nama: String,
    private var berat: Double,
    var umur: Int,
    var apkhNyata: Boolean = true
) {
    fun getName(): String {
        return nama
    }

    fun setNama(newNama: String) {
        nama = newNama
    }
}

fun main() {
    val menteeBootcamp = gatot("gagah berotot", 1.5, 39)
    println(menteeBootcamp.getName())
    menteeBootcamp.setNama("raihan")
    println(menteeBootcamp.getName())

}