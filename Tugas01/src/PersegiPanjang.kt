class PersegiPanjang(private val panjang: Int, private val lebar: Int) {

    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}

// Fungsi main harus berada di luar kelas
fun main() {
    print("Masukkan panjang: ")
    val panjang = readLine()?.toIntOrNull() ?: return
    print("Masukkan lebar: ")
    val lebar = readLine()?.toIntOrNull() ?: return

    val persegiPanjang = PersegiPanjang(panjang, lebar)
    println("Luas: ${persegiPanjang.hitungLuas()}")
    println("Keliling: ${persegiPanjang.hitungKeliling()}")
}
