import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input = ")
    var kalimat = scanner.nextLine()

    kalimat = replace(kalimat)

    println("Output = $kalimat")
}

fun replace(kalimat: String): String {
    return kalimat.replace(Regex("[aiueoAIUEO]"), "")
}