import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)

    print("Pilih Tugas\n===========\n1. Tugas 1\n2. Tugas 2\n3. Tugas 3\n4. Tugas 4\n5. Tugas 5\n0. Batal\n\nPilih = ")
    var pilihan = scanner.nextLine()
    println("")

    if (pilihan == "1") {
        main1()
        println("")
        main()
    }
    else if (pilihan == "2") {
        main2()
        println("")
        main()
    }
    else if (pilihan == "3") {
        main3()
        println("")
        main()
    }
    else if (pilihan == "4") {
        main4()
        println("")
        main()
    }
    else if (pilihan == "5") {
        main5()
        println("")
        main()
    }
    else if (pilihan == "0") {
        println("")
        main()
    }
    else {
        println("Pilihan tidak valid")
    }
}

fun main1() {
    println("Hitung IPK")
    while (!input()) {
        println("Hitung IPK")
    }
}

fun input(): Boolean {
    val scanner = Scanner(System.`in`)
    var IPK = 0.0
    for (i in 1..8){
        var ip: Double
        do {
            print("IP semester " + (i) + " = ")
            ip = scanner.nextDouble()
            if (ip < 0.0 || ip > 4.0) {
                println("Nilai yang Anda masukkan tidak valid")
                return false
            }
        } while (ip < 0.0 || ip > 4.0)
        IPK += ip
    }
    IPK /= 8
    println("IPK = $IPK")
    if (IPK >= 3.76 && IPK <= 4.0) {
        println("Predikat Kelulusan = Dengan Pujian (Cumlaude)")
    }
    else if (IPK >= 3.51 && IPK <= 3.75) {
        println("Predikat Kelulusan = Sangat Memuaskan")
    }
    else if (IPK >= 3.00 && IPK <= 3.50) {
        println("Predikat Kelulusan = Memuaskan")
    }
    else if (IPK >= 2.00 && IPK <= 2.99) {
        println("Predikat Kelulusan = Cukup")
    }
    else {
        println("Kurang")
    }
    return true
}

fun main2() {
    val amplitudes = mutableListOf<Int>()
    for (i in 1..11) {
        val randomNumber = (0..100).random()
        print("$randomNumber, ")
        amplitudes.add(randomNumber)
    }
    println()
    val max = amplitudes.maxOrNull()
    println("Angka terbesar = $max")

    val min = amplitudes.minOrNull()
    println("Angka terkecil = $min")

    val median: Double
    amplitudes.sort()
    if (amplitudes.size % 2 == 0) {
        median = (amplitudes[amplitudes.size / 2] + amplitudes[amplitudes.size / 2 - 1]) / 2.0
    } else {
        median = amplitudes[amplitudes.size / 2].toDouble()
    }
    println("Menengah = $median")

    val average = (max!! + min!! + median) / 3
    println("Rata-rata = $average")
}

fun main3() {
    val scanner = Scanner(System.`in`)

    print("Input = ")
    var kalimat = scanner.nextLine()

    kalimat = replace(kalimat)

    println("Output = $kalimat")
}

fun replace(kalimat: String): String {
    return kalimat.replace(Regex("[aiueoAIUEO]"), "")
}

fun main4() {
    val scanner = Scanner(System.`in`)

    print("Input = ")
    var kalimat = scanner.nextLine()

    kalimat = removeConsonants(kalimat)

    println("Output = $kalimat")
}

fun removeConsonants(kalimat: String): String {
    return kalimat.replace(Regex("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]"), "")
}


fun main5() {
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