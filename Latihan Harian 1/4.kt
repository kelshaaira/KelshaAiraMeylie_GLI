import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input = ")
    var kalimat = scanner.nextLine()

    kalimat = removeConsonants(kalimat)

    println("Output = $kalimat")
}

fun removeConsonants(kalimat: String): String {
    return kalimat.replace(Regex("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]"), "")
}