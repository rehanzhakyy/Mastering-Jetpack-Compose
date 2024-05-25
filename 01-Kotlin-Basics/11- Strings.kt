fun main() {
    // Initilize String
    val selamat = "Hello Guys, How Are you?"

    // Initialize String with define the Data Types
    val selamatDatang: String = "Hello Guys"

    // Initialize Empty String
    val selamatDatangBelakangan: String
    selamatDatangBelakangan = "Hello Guys telat"

    // Print String
    println(selamat)

    // Print String with Define the Data Types
    println(selamatDatang)

    // Print Empty String
    println(selamatDatangBelakangan)

    // get value by index
    println(selamat[0])

    // get the string length
    println(selamat.length)

    // string function
    println(selamat.uppercase())
    println(selamatDatangBelakangan.lowercase())

    // find string in string
    println(selamat.indexOf("Guys"))
}