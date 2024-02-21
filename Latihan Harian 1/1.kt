import java.util.Scanner

fun main() {
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