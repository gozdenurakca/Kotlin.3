package com.gna.thirdapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gna.thirdapplication.ui.theme.ThirdApplicationTheme

class MainActivity : ComponentActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myTextView2: TextView
    private lateinit var myTextView3: TextView


    private lateinit var myButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        myTextView = findViewById(R.id.textView)
        myTextView2= findViewById(R.id.textView2)
        myTextView3= findViewById(R.id.textView3)



        // Fonksiyonlar
        // fonksiyonlar girdiler alıp çıktılar verebiliyor.

        val deger = 0
        if(deger == 0) {
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(10,20)
        var x = toplama(20,30)
        myTextView2.text = "Sonuç : ${x}"

        myButton.setOnClickListener {

            val toplamaSonucu = toplama(10,50)
            myTextView2.text = "Sonuç : ${toplamaSonucu} "

        }

        sinifCalismasi()
        nullGuvenligi()



    }

    fun ilkFonksiyon () {
        println("İlk fonksiyon çalıştırıldı.")
    }
    fun ikinciFonksiyon() {
        println("İkinci fonksiyon çalıştırıldı.")
    }

    // Girdi Almak

    fun cikarma(x : Int, y: Int) {
        myTextView.text = "Sonuç : ${x-y} "

    }

    // Çıktı vermek -> Döndürtmek(Return)

    fun toplama(a: Int, b: Int) : Int {

        return a + b

    }

    /*
    fun degistir(view : View) {
        val toplamaSonucu = toplama(10,50)
        myTextView2.text = "Sonuç : ${toplamaSonucu} "
    }
     */

    fun sinifCalismasi() {

        var superman = SuperKahraman("Superman", "Gazeteci",50)

        var batman = SuperKahraman("Batman","Gazeteci" ,20)

        myTextView3.text = "Yaş : ${superman.yas} "

        superman.testFonksiyonu()

        println(superman.sacRenginiAl())
    }

    fun nullGuvenligi() {
        // Null, Nullability, Null Safety
        // Null = boş, herhangi bir değer alınmamış anlamına gelir.

        // Tanımlama (Defining)
        var benimStringim : String?

        // String? = string nullable

        // Defining ile initialization arasında bu ifade aslında null, yani değere sahip değil.

        // Initialization = başlatma
        benimStringim = "Gözde"

        var benimYasim : Int? = null
        println(benimYasim)

        // 1. Yöntem
        if(benimYasim != null) {
            println(benimYasim*2)
        } else {
            println("Null geldi, hesaplanamaz.")
        }

        // 2. Yöntem

        // !! : null olmayacak
        // ?  : null olabilir

        benimYasim = 23

        println(benimYasim!!.minus(2))
        // eğer burada yaşın değeri null ise uygulama çöker, hele ki başına "!!" getirilmiş ise..

        // 3. Yöntem
        // elvis operatörü

        val sonuc = benimYasim?.minus(2) ?: 10
        println(sonuc)
        // elvis operatörü = eğer burada soldaki sonuç null geliyorsa sağdakini al demek


        // 4. Yöntem
        benimYasim?.let {

            // buradaki it benimYasim'a referans veriyor.
            // eğer burada benimYasim = null ise hiç çalışmayacak ama herhangi bir değere sahip ise
            // it = benimYasim olarak bu işlem yapılacak.

            println(it * 5)
        }
    }
}
