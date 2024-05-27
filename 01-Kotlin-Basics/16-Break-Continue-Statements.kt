fun main() {
    var i = 0
    while (i < 10) {
        println(i)
        i++

        if (i == 6) {
            i++
            continue
        } else if (i == 9) {
            break
        }
    }

}