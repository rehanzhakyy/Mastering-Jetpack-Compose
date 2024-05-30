fun main() {
    // Initialize Ranges - Chars
    for(chars in 'a' .. 'z') {
        println(chars)
    }

    // Ranges - Number
    for(x in 1..20) {
        println(x)
    }

    // Ranges - Check Availability
    val validation = arrayOf(1,13,35,42,4242,5245,233,235,35,25)
    if (13 in validation) {
        println("It's Exist")
    } else {
        println("It's doesn't Exist")
    }

    // Ranges - Break & Continue
    for (number in 2 .. 10) {
        if (number == 5) {
            continue
        } else if (number == 7) {
            break
        }
        println(number)
    }
}