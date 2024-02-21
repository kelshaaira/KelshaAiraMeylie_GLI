import java.util.Scanner

fun main() {
    input()
}

fun input() {
    val scanner = Scanner(System.`in`)

    print("Nama Produk : ")
    var produk = scanner.nextLine().trim()
    
    if (produk.isEmpty()) {
        println("Nama Produk tidak boleh kosong")
        return input()
    }
    
    print("Quantity : ")
    val quantity = try {
        val inputQuantity = scanner.nextInt()
        if (inputQuantity == 0) {
            throw Exception("Quantity tidak boleh 0")
        }
        inputQuantity
    } catch (e: Exception) {
        println("Quantity harus berupa angka dan tidak boleh 0")
        return input()
    }
    scanner.nextLine()

    print("Harga Satuan : ")
    val harga = try {
        val inputHarga = scanner.nextInt()
        if (inputHarga == 0) {
            throw Exception("Harga tidak boleh 0")
        }
        inputHarga
    } catch (e: Exception) {
        println("Harga harus berupa angka dan tidak boleh 0")
        return input()
    }
    scanner.nextLine()

    println("")
    println("Nama Produk : $produk")
    println("Quantity : ${quantity}pcs")
    println("Harga Satuan : Rp $harga")

    val total = quantity * harga
    println("Total Harga Produk : Rp $total")

    if (total in 50001..100000) {
        val diskon = total * 5 / 100
        println("Diskon : Rp $diskon")
        val bayar = total - diskon
        println("Total bayar : Rp $bayar")
    } else if (total > 100000) {
        val diskon = total * 10 / 100
        println("Diskon : Rp $diskon")
        val bayar = total - diskon
        println("Total bayar : Rp $bayar")
    }
}