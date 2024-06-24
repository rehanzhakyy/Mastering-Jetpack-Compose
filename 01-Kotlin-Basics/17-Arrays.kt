fun main() {
    val infiniteProgram = arrayOf("Web", "Mobile", "Game", "IBM", "Intern")
    val infiniteMentors = arrayOf("Raihan, Reynaldi, Reza, Rahmad, Nabila")

    // Change the value of Arrays
    infiniteProgram[3] = "Red Hat"

    // Printing the index of Arrays
    println(infiniteProgram[1])

    // Printing the size of Arrays
    println(infiniteMentors.size)

    // For loop in Array
    for (x in infiniteProgram) {
        println(x)
    }
}