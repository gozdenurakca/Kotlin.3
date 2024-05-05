package com.gna.thirdapplication

// Primary Constructor:
// class SuperKahraman(var isim : String, var meslek : String, var yas : Int)

class SuperKahraman(var isim : String, var meslek : String, var yas : Int) {

    fun testFonksiyonu() {
        println("test")
    }
    private var sacRengi = "Sarı"

    // GETTER
    fun sacRenginiAl() : String{
        return this.sacRengi        // buradan sarı gelir.
    }

    // SETTER
    fun sacRenginiDegistir()  {
        this.sacRengi = "Yeşil"     // burada sarıyı yeşile çevirdik, değiştirdik
    }
    // Access Levels - Erişilebilirlik Seviyeleri
    // private - protected - internal - public



    /*
    // Property

    var isim = ""
    var meslek = ""
    var yas = 0


    // Constructor : bir sınıftan bir nesne oluşturduğunuz zaman çağrılan bir fonksiyondur.

    constructor(isim : String, meslek : String, yas : Int) {
        this.isim = isim
        this.meslek = meslek
        this.yas = yas
        println("Constructor çağırıldı.")

    }
    */
}