class Mobil{
    var warna = ""
    var tahunProduksi = 0
}
fun main(args: Array<String>) {
    //membuat object
    val mobil1= Mobil()
    var mobil2 = MobilDemo2()

    //memanggil atribut dan memberikan nilai
    mobil1.warna = "merah"
    mobil1.tahunProduksi= 1905
    println("Warna : "+mobil1.warna)
    println("Tahun Produksi : "+mobil1.tahunProduksi)

    mobil2.hidupkanMobil()
    mobil2.ubahGigi(2)
    println(mobil2.getgigi())
    mobil2.ubahGigi(6)
    println(mobil2.getgigi())
}
