import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Menu\n1. Login\n2. Buy\n3. Employee\nPilih : ")
    val pilih = scanner.nextInt()

    when (pilih) {
        1 -> login()
        2 -> input()
        3 -> employee()
    }
}

fun input() {
    val scanner = Scanner(System.`in`)

    println("Nama Produk : Aqua")
    val stockaqua = 100
    println("Stok Produk : $stockaqua pcs")
    val hargaaqua = 5000
    println("Harga Satuan : Rp. $hargaaqua")
    println("")

    print("Quantity Pembelian : ")
    val quantity = scanner.nextInt()

    if(quantity > stockaqua) {
        println("\n========================\nStock yang Anda beli kurang dari $stockaqua pcs")
    }
    else {
        print("Nominal Pembayaran : ")

        val total = quantity * hargaaqua
        println("\n========================")
        println("Total Harga Produk : Rp $total")
        var totalbayar: Int = total

        if (total in 50000..100000) {
            val diskon = total * 5 / 100
            println("Anda mendapatkan diskon sebesar : Rp $diskon")

            totalbayar -= diskon
        } else if (total >= 100000) {
            val diskon = total * 10 / 100
            println("Anda mendapatkan diskon sebesar : Rp $diskon")

            totalbayar -= diskon
        } else if (total < 50000) {
            println("")
        }

        println("Total yang harus Anda bayar sebesar : Rp $totalbayar")
        print("Uang pembayaran Anda sebesar : ")
        val pay = scanner.nextInt()

        if (pay % 100000 != 0) {
            print("Uang yang Anda bayarkan bukan kelipatan Rp 100.000, harap ubah nominal pembayaran")
        }
        else {
            if(pay < totalbayar) {
                println("Uang yang Anda bayarkan kurang, harap ubah nominal pembayaran")
            }
            else {
                if(pay < totalbayar) {
                    println("Uang yang Anda bayarkan kurang, harap ubah nominal pembayaran")
                }
                else {
                    val kembalian = pay - totalbayar
                    println("Kembalian Anda sebesar : Rp $kembalian")
                }
            }
        }
    }
}

fun login() {
    val scanner = Scanner(System.`in`)

    print("Username : ")
    val username = scanner.nextLine().trim()

    if (username.length in 6..15) {
        print("Password : ")
        val password = scanner.nextLine().trim()

        if (password.length in 8..20 && password.any { it in "!@#$%^&*()_+{}|:<>?-=[]',./" }) {
            println("Login berhasil\n")
        } else {
            println("Login gagal, password harus memiliki minimal 8 karakter dan maksimal 20 karakter dengan kombinasi simbol, huruf, dan angka\n")
        }
    } else {
        println("Login gagal, username harus memiliki panjang antara 6 dan 15 karakter\n")
    }
}

fun employee() {
    val scanner = Scanner(System.`in`)
    print("Nama Karyawan : ")
    val nama = scanner.nextLine()

    print("Grade : ")
    val grade = scanner.nextLine()

    print("Jumlah Jam Kerja Per Minggu : ")
    val jamker = scanner.nextInt()

    var hari: Int
    var lembur: Int
    var potong: Int

    when (grade) {
        "A" -> {
            hari = 500000
            lembur = 50000
            potong = 80
        }
        "B" -> {
            hari = 300000
            lembur = 30000
            potong = 60
        }
        "C" -> {
            hari = 200000
            lembur = 20000
            potong = 50
        }
        "D" -> {
            hari = 100000
            lembur = 10000
            potong = 30
        }
        "a" -> {
            hari = 500000
            lembur = 50000
            potong = 80
        }
        "b" -> {
            hari = 300000
            lembur = 30000
            potong = 60
        }
        "c" -> {
            hari = 200000
            lembur = 20000
            potong = 50
        }
        "d" -> {
            hari = 100000
            lembur = 10000
            potong = 30
        }
        else -> {
            println("Grade yang Anda masukkan tidak valid")
            return
        }
    }

    println("")
    println("Total Gaji\n===============================")
    println("Hai, $nama")
    if (jamker >= 40){
        val gaji = (hari/8) * 40
        val jamLembur = jamker - 40
        val gajiLembur = jamLembur * lembur
        val totalGaji = gaji + gajiLembur
        println("Gaji Anda minggu ini sebesar Rp $gaji")
        println("Anda melakukan lembur sebanyak $jamLembur jam")
        println("Upah lembur Anda sebesar Rp $gajiLembur")
        println("Total Gaji yang Anda dapatkan minggu ini sebesar Rp $totalGaji")
    }
    else {
        val gajiPerJam = hari / 8
        val jamNonLembur = 40 - jamker
        val gajiNonLembur = jamNonLembur * gajiPerJam
        val potonganGaji = (gajiNonLembur * potong) / 100
        val totalGaji = gajiNonLembur - potonganGaji

        println("Total Jam kerja Anda minggu ini kurang dari 40 jam")
        println("Anda dipotong gaji sebesar Rp $potonganGaji")
        println("Total Gaji yang Anda dapatkan minggu ini sebesar Rp $totalGaji")
    }


}

