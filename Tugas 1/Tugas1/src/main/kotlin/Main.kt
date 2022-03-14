class Mobil{
    var warna = ""
    var tahunProduksi = 0
}
fun main(args: Array<String>) {
    //membuat object
    val mobil1= Mobil()

    //memanggil atribut dan memberikan nilai
    mobil1.warna = "merah"
    mobil1.tahunProduksi= 1905
    println("Warna : "+mobil1.warna)
    println("Tahun Produksi : "+mobil1.tahunProduksi)
}
