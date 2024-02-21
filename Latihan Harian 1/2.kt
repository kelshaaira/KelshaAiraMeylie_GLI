import kotlin.random.Random

fun main() {
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