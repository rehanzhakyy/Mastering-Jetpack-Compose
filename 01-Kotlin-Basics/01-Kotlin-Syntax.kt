data class minjemBuku(val name: String, val publisher: String, val review: Double)

fun main() {
    // Inisialisasi
    val minjemBuku = minjemBuku("Raihan", "Amabel Media", 4.8)
    // Copy
    val minjemBukuCopy = minjemBuku.copy()
    // Modify
    val minjemBukuModify = minjemBuku.copy("Fiastara", "Gatot Jaya Makmur", 5.0)

    println(minjemBukuCopy)
    println(minjemBukuModify)
}