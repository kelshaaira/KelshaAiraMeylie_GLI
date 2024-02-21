import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input = ")
    var kalimat = scanner.nextLine()
    
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0

    kalimat = kalimat.toLowerCase()
    for (i in 0..kalimat.length - 1) {
        val ch = kalimat[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            ++vowels
        } else if (ch in 'a'..'z') {
            ++consonants
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
}