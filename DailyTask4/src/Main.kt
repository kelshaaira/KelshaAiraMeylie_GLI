open class HasilHitung(shape: String, result: Int) {
    init {
        println("Volume $shape = $result")
    }
}

class RumusKubus(sisi: Int) : HasilHitung(shape = "Kubus", result = sisi * sisi * sisi)

class RumusBalok(panjang: Int, lebar: Int, tinggi: Int) : HasilHitung(shape = "Balok", result = panjang * lebar * tinggi)

class RumusTabung(jari: Int, tinggi: Int) : HasilHitung(shape = "Tabung", result = (Math.PI * (jari * jari) * tinggi).toInt())

class RumusKerucut(jari: Int, tinggi: Int) : HasilHitung(shape = "Kerucut", result = (1.0 / 3.0 * Math.PI * (jari * jari) * tinggi).toInt())

class RumusBola(jari: Int) : HasilHitung(shape = "Bola", result = (4.0 / 3.0 * Math.PI * (jari * jari * jari)).toInt())

fun main() {
    RumusKubus(5)
    RumusBalok(5, 10, 8)
    RumusTabung(7, 15)
    RumusKerucut(7, 15)
    RumusBola(10)
}

