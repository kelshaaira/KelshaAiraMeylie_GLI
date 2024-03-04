import java.util.*

data class Product(val name: String, val stock: Int, val price: Int)

val products = listOf(
    Product("Aqua", 10, 5000),
    Product("Indomie", 20, 3000),
    Product("Kopi", 50, 1000)
)

data class Employee(val name: String, val grade: String, val jam: Int)

val employees = listOf(
    Employee("Abraham", "A", 40),
    Employee("Bella", "B", 45),
    Employee("Kelsha", "C", 30),
    Employee("Dedi", "D", 50),
    Employee("Erik", "B", 40)
)

fun main() {
    val scanner = Scanner(System.`in`)
    print("Menu\n1. Buy\n2. Employee\nPilih : ")
    val pilih = scanner.nextInt()

    when (pilih) {
        1 -> produk()
        2 -> employee()
    }
}

fun produk() {
    println("Stok Produk:\n===================================")

    products.forEach { product ->
        println("Nama Produk : ${product.name}")
        println("Stok Produk : ${product.stock}pcs")
        println("Harga Satuan : Rp ${product.price}")
        println("")
    }
    println("===================================\n")

    val qty = 10
    var totalKopi = 0
    var totalAqua = 0

    val kopi = products.find { it.name == "Kopi" }
    val aqua = products.find { it.name == "Aqua" }

    println("Produk yang dibeli :")
    println("===================================")

    if (kopi != null && aqua != null) {
        println("Nama Produk : ${kopi.name}")
        println("Quantity Pembelian: $qty" + "pcs")
        println("")
        println("Nama Produk : ${aqua.name}")
        println("Quantity : $qty" + "pcs")
        if (qty > kopi.stock) {
            println("\nTerdapat produk yang stoknya kurang dari yang Anda beli:\n===================================")
            println("Nama Produk : ${kopi.name}")
            println("Stock Tersedia : ${kopi.stock}" + "pcs")
            println("Quantity yang Anda beli : $qty")
            println("Harap ubah quantity Anda")
            println("")
        }
        else {
            totalKopi = qty * kopi.price
            println("===================================\n")
            println("Total Harga Produk:")
            println("===================================")
            println("Nama Produk : ${kopi.name}")
            println("Quantity Pembelian : $qty" + "pcs * Rp ${kopi.price}")
            println("Total Harga : Rp $totalKopi")
            println("")
        }
    }
    if (aqua != null) {
        if (qty > aqua.stock) {
            println("\nTerdapat produk yang stoknya kurang dari yang Anda beli:\n===================================")
            println("Nama Produk : ${aqua.name}")
            println("Stock Tersedia : ${aqua.stock}" + "pcs")
            println("Quantity yang Anda beli : $qty")
            println("Harap ubah quantity Anda")
            println("")
        }
        else {
            totalAqua = qty * aqua.price
            println("Nama Produk : ${aqua.name}")
            println("Quantity Pembelian : $qty" + "pcs * Rp ${aqua.price}")
            println("Total Harga : Rp $totalAqua \n")
        }
    }
    else {
        println("Produk tidak terdaftar")
    }

    val totalAll = totalKopi + totalAqua
    println("Total yang harus Anda bayar sebesar Rp $totalAll")

}

fun employee() {
    println("Gaji Karyawan")
    println("===================================")


    employees.forEach { employee ->
        println("Nama Karyawan : ${employee.name}")
        println("Grade : ${employee.grade}")
        println("Jam Kerja : ${employee.jam} jam")

        if (employee.grade == "A" || employee.grade == "a") {
            val upahPerHari = 500000/8
            val upahLemburPerJam = 50000
            val gajiMinggu = 40 * upahPerHari
            val upahLembur = (employee.jam - 40) * upahLemburPerJam
            val waktuLembur = employee.jam - 40
            val potonganGaji = ((40 - employee.jam) * upahPerHari) * 80/100
            val totalGaji = gajiMinggu + upahLembur
            val totalGajiPotongan = gajiMinggu - potonganGaji

            if (employee.jam == 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Total Gaji : $gajiMinggu")
            }
            else if (employee.jam < 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Potongan : Rp $potonganGaji")
                println("Total Gaji : Rp $totalGajiPotongan")
            }
            else if (employee.jam > 40) {
                val jamLembur = employee.jam - 40
                println("${employee.name} telah lembur selama $waktuLembur jam")
                println("Gaji Lembur : $jamLembur jam * Rp $upahLemburPerJam = $upahLembur")
                println("Total Gaji : $totalGaji")
            }
        } else if (employee.grade == "B" || employee.grade == "b") {
            val upahPerHari = 300000/8
            val upahLemburPerJam = 30000
            val gajiMinggu = 40 * upahPerHari
            val upahLembur = (employee.jam - 40) * upahLemburPerJam
            val totalGaji = gajiMinggu + upahLembur
            val potonganGaji = ((40 - employee.jam) * upahPerHari) * 60/100
            val totalGajiPotongan = gajiMinggu - potonganGaji

            if (employee.jam == 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Total Gaji : $gajiMinggu")
            }
            else if (employee.jam < 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Potongan : Rp $potonganGaji")
                println("Total Gaji : Rp $totalGajiPotongan")
            }
            else if (employee.jam > 40) {
                val jamLembur = employee.jam - 40
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Gaji Lembur : $jamLembur jam * Rp $upahLemburPerJam = $upahLembur")
                println("Total Gaji : $totalGaji")
            }
        } else if (employee.grade == "C" || employee.grade == "c") {
            val upahPerHari = 200000/8
            val upahLemburPerJam = 20000
            val gajiMinggu = 40 * upahPerHari
            val upahLembur = (employee.jam - 40) * upahLemburPerJam
            val potonganGaji = ((40 - employee.jam) * upahPerHari) * 50/100
            val totalGaji = gajiMinggu + upahLembur
            val totalGajiPotongan = gajiMinggu - potonganGaji

            if (employee.jam == 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Total Gaji : $gajiMinggu")
            }
            else if (employee.jam < 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Potongan : Rp $potonganGaji")
                println("Total Gaji : Rp $totalGajiPotongan")
            }
            else if (employee.jam > 40) {
                val jamLembur = employee.jam - 40
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Gaji Lembur : $jamLembur jam * Rp $upahLemburPerJam = $upahLembur")
                println("Total Gaji : $totalGaji")
            }
        } else if (employee.grade == "D" || employee.grade == "d") {
            val upahPerHari = 100000/8
            val upahLemburPerJam = 10000
            val gajiMinggu = 40 * upahPerHari
            val upahLembur = (employee.jam - 40) * upahLemburPerJam
            val totalGaji = gajiMinggu + upahLembur
            val potonganGaji = ((40 - employee.jam) * upahPerHari) * 30/100
            val totalGajiPotongan = gajiMinggu - potonganGaji

            if (employee.jam == 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Total Gaji : $gajiMinggu")
            }
            else if (employee.jam < 40) {
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Potongan : Rp $potonganGaji")
                println("Total Gaji : Rp $totalGajiPotongan")
            }
            else if (employee.jam > 40) {
                val jamLembur = employee.jam - 40
                println("Gaji Per Minggu : Rp $gajiMinggu")
                println("Gaji Lembur : $jamLembur jam * Rp $upahLemburPerJam = $upahLembur")
                println("Total Gaji : $totalGaji")
            }
        }
        println("")
    }

}