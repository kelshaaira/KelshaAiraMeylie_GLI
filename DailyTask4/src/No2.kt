open class Classification(name: String, classification: String) {
    init {
        println("Hewan $name merupakan jenis hewan $classification")
    }
}

class Mamalia(name: String) : Classification(name, "Mamalia")

class Reptil(name: String) : Classification(name, "Reptil")

class Aves(name: String) : Classification(name, "Aves")

class Amphibia(name: String) : Classification(name, "Amphibia")

class Pisces(name: String) : Classification(name, "Pisces")

class Insecta(name: String) : Classification(name, "Insecta")

class Arachnida(name: String) : Classification(name, "Arachnida")

fun main() {
    Mamalia("Kucing")
    Reptil("Kura - kura")
    Aves("Burung")
    Amphibia("Katak")
    Pisces("Ikan")
    Insecta("Lebah")
    Arachnida("Laba - laba")
}