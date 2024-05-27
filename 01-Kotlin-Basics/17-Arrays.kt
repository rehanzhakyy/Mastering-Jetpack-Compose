fun main() {
    val infiniteProgram = arrayOf("Web", "Mobile", "Game", "IBM", "Intern")

    // Change the value of Arrays
    infiniteProgram[3] = "Red Hat"

    // Printing the index of Arrays
    println(infiniteProgram[1])

    // Printing the size of Arrays
    println(infiniteProgram.size)

    // For loop in Array
    for (x in infiniteProgram) {
        println(x)
    }
}