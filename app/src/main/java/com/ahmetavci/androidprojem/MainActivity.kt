package com.ahmetavci.androidprojem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("Merhaba Kotlin")
        println(5 * 10)

        //Değişkenler && Sabitler
        //bazı değerleri kaydetmek için kullandığımız bir takım yapılara değişken diyoruz

        //var = variable(değişkenden gelmekte)
        var a = 5
        var b = 10

        //println(a*b)

        /* değişkenleri var(variable/değişken) ile oluşutururken, sabitleri ise val(value/sabit değer) sözdizimi
        ile oluşturmaktayım.
        */

        val x = 9

        //camelCase (yasSonucu)
        //snake_case (yas_sonucu)

        /* Tanımlama (Defining) value ile belirttiğim sabit benimIntegerim Integer bir değer olarak
        tanımladım
        */

        val benimIntegerim : Int

        benimIntegerim = 5
        //dersem bu yaptığım işlem; başlatma(İnitializing), değerini atama

        /* ben benimIntegerim sabit değişkenini 5 olarak atadım bana hata vermedi, aslında vermesi
        lazımdı çünkü val olarak tanımladım. Hata vermemesinin nedeni val olarak tanımladığım
        benimIntegerim ilk defa bir değere atadım(5)
        */

        println(benimIntegerim * 7)

        //Long
        println("-------Long-------")
        var benimLong : Long = 100
        benimLong = 30000000000
        println(benimLong)

        //Double & Float
        println("-------Double-------")

        val pi = 3.14

        println(pi * 2)

        val floatPi = 3.14f
        //val floatPi :Float = 3.14f
        println(floatPi * 5)

        val yeniDouble = 5.0
        println(yeniDouble / 2)
        // integar 5 sayısını 2 ye böldüğümüzde 2 değerini görürken burda 2.5 gördük

        //String - Metin
        val benimString = "Bugün hava oldukça sıcak"
        println(benimString.length)

        val isim = "ahmet"
        val soyisim = "avci"
        val tamisim = isim + " " + soyisim
        println(tamisim)

        val string0 : String = "10"
        val string1 : String = "20"
        println(string0 + string1)

        /* farklı veri tipleri farklı davranışlara sahiptir iki string sayının toplamı integer
        daki gibi basit matematiksel işlem değildir, yan yana yazılmış birleşmiş halidir.
        */

        //Veri tipi dönüştürme
        println("-------Veri Dönüştürmek-------")

        val Int0 = 10
        val longaCevrilenInt0 = Int0.toLong()
        println(longaCevrilenInt0)

        //kullanıcıdan bir string sayı alıp bunu ikiye bölen kod satırı

        val kullaniciGirdisi = "73"
        //şuan kullanıcıdan aldığımız girdi string(metin) bir değer

        /* println(kullaniciGirdisi / 2) bu kodu logcat de göremeyiz sebebi ise
        string bi değeri ıntegar bir sayıya böldüğümüzde sonuç alamayız.
        */

        val yeniKullaniciGirdisi = kullaniciGirdisi.toFloat()
        println(yeniKullaniciGirdisi / 2)

        //Koleksiyonlar
        /*
        Koleksiyonlar birçok programlama dilinde mevcuttur. Hepsinde farklı farklı koleksiyonlar olabilir
        ama hep benzerlik göstermektedir. Koleksiyonların amacı birden fazla veriyi içerisinde tutmaktır.
        */

        //Array - Dizi
        println("-------Array(Dizi)-------")
        val ilkDizim = arrayOf("Ahmet","Mehmet","Seyyid","Erdem","Hatice",)
        // koleksiyonum içinde 5 tane eleman var farklı farklı string oluşturmak yerine tek bir değerde(val) tutmaktayım.
        // kolesiyonum yani dizimin içindeki elemanlara tek tek ulaşabilirmiyiz sorununa? evet diyebilmekteyiz.

        println(ilkDizim[3])
        //diziler index mantığı ile çalışıyor dizinin içindeki herbir elemana index atanmaktadır.

        println(ilkDizim.get(2))
        //ilkDizim[4] = ilkDizim.get(4) (aynı çıktıyı almış oluyoruz)

        ilkDizim[4] = "Emir"
        println(ilkDizim.get(4))
        ilkDizim.set(3,"Kürşat")
        println(ilkDizim[3])

        //dizimi val(value, sabit değer) olarak tanımlamam dizimin içindeki değerleri değiştiremeyeceğim anlamına gelmektedir!
        val ıntegerDizisi = intArrayOf(1,2,4,8,16,32,64,128,256,512,1024)
        println(ıntegerDizisi.get(3))
        val doubleDizisi = doubleArrayOf(3.4,4.0,5.0,6.8,9.3)
        println(doubleDizisi[4])

        //kotlin programlama dilinde diğer birçok programlama dilinden farklı olarak karışık diziler oluşturmak mümkün
        val karisikDizi = arrayOf("Ahmet",3.5,5,20000000000,"Sümeyra",45.67)
        //yukarıdaki karışıkDizi ile tanımladığım koleksiyonda farkedilmek üzere string,float,ınt,long gibi veri tipleri bulunmaktadır.
        println(karisikDizi.get(3))

        //ArrayList - Listeler
        println("-------ArrayList-------")
        /*Listeler ve Diziler arasındaki fark listeler ler dizilere göre daha esnek bir yapıya sahiptir.
        Listelerde dizilere ziyade sonradan ekleme yapmak istediğimizde daha kolay işlemler gerkçekleşmektedir.
         */

        val isimListesi = arrayListOf("Ahmet","Sümeyra","Hatice")
        // genel yapısına baktığımızda arrayOf() dan farkı yoktur.

        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Mehmet") //isimListesi mizin 3.elemanı
        isimListesi.add("Emir") //isimListesi mizin 4.elemanı
        //arrayOf() da .add dediğimizde böyle bir esnekliğe sahip olamadığımızı gözlemlemekteyiz
        println(isimListesi.get(4))
        //Logcat üzerinde Emir çıktısını almaktayız

        val karisikArrayList = arrayListOf<Any>() //<> içerisine string yada double girdiğimizde sadece bu veri tiplerinden eleman ekleyebilmekteyiz.
        //<Any> (sınıfı) şimdilik 'veri tipi' daha uygun kotlin dilinin hiyerarşisinde Herhangi anlamına gelmekte bundan sonra ekleyeceğimiz elemanlar herhangi bir veri tipinde olabilmektedir.

        karisikArrayList.add("Erdem") //string
        karisikArrayList.add("gradient")  //string
        karisikArrayList.add(5) //integar
        karisikArrayList.add(5.67) //double
        karisikArrayList.add(true) //boolean
        karisikArrayList.add(34000000000000) //Long

        println(karisikArrayList[1])
        println(karisikArrayList.get(4))

        /*
        Liste tanımlama yollarında java programlama dilinden kalma bir alternatif tanımalama daha mevcut
        "arrayListOf<Int>() = ArrayList<Int>()"" tek fark of array'in A'sının büyük olması ve of ekinin sona gelmemesi
        */

        //Set
        println("-------Set-------")
        /*Set bir koleksiyon tipidir. içerisinde birden fazla veriyi barındırabildiğimiz bir yapıya sahiptir.
        Özelliği ise aynı veri tipinden sadece bir adet barındırabilmektedir.
         */

        val ornekDizi = arrayOf(7,8,9,9,9,8,10,7,10) //örnek bi dizi oluşturduk 'Set' özelliğini daha belirgin görmek için
        println("index 2: ${ornekDizi[2]}") //string bir metin içerisinde  kod çalıştırmak istiyorsam "$+{}" süslü pazarantezin içerisine koşturacağımız kod satırını girebilmekteyiz.
        println("index 3: ${ornekDizi[3]}")
        println("index 4: ${ornekDizi[3]}")

        println(ornekDizi.size) //.size bize dizimizin boyutunu vericek (ilk elemanı 1 olarak sayıcak, index deki gibi 0 değil!)

        val ilkSet = setOf<Int>(7,8,9,9,9,8,10)
        println(ilkSet.size) //ilkSet dizimin 4 elemana sahip olduğunu logcat de gözlemledim. Nasıl bunları tek tek ekrarana yazırabilirim sorusunun basit bir cevabı mevcuttur.

        //For Each (her biri için manasına gelmektedir)
        ilkSet.forEach {
            println(it)
        } // logcat de For Each kapsamı içersinde dizimdeki bütün elemanları gözlemleyebilmekteyiz.

        val digerSet = HashSet<String>() //oluşturduktan sonra dizilerdeki gibi ekleme yapabiliyoruz
        digerSet.add("Ahmet")
        digerSet.add("Ahmet")
        digerSet.add("Ahmet")
        digerSet.add("Avci")

        digerSet.forEach {
            println(it)
        } //log cat üzerinden isim soyisim yazdığını tekrarlanan isimleri sadece bir kere yazdıracağını net bir şekilde görebilmekteyiz.

        //Map
        println("-------Map-------")
        /* bazı programlama dillerinde sözlük manasına gelir map'in karşılığı. map(maping) haritalamak işleminden yani ne demek istiyorum
        birşeyi birşeyle eşleştirmek işlemi. Burda işin özünde anahtar kelime ve değer eşleşmesi yapıyoru (key-value)
         */
        //Ahatar Kelime - Değer (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk","Havuç")
        val kaloriDizisi = arrayOf(75,300,200,23)
        //her iki diziden sırası ile indexlerini çağırırsam elma 75, et 300, tavuk 200, Havuç 23 kalori olduğunu görmekteyim.
        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}")
        println("${yemekDizisi[1]}'in kalorisi : ${kaloriDizisi[1]}")
        println("${yemekDizisi[2]}'un kalorisi : ${kaloriDizisi[2]}")
        println("${yemekDizisi[3]}'un kalorisi : ${kaloriDizisi[3]}")
        /* evet güzel istediğimiz yemeğin kalorisini logcat üzerinden çıktı alıyoruz ama sorun şurda ya 200 adet key-value varsa.
        yada internetten çektiğimiz veritabanından 1000 den fazla yiyeceğin kalorisini programımıza çekiceksek?
        HashMap Bu tür durumlarda devreye girmektedir.
         */
        val yemekKaloriMap = hashMapOf<String,Int>()  //hashMapof<Key, Value>()
        yemekKaloriMap.put("Elma",75) //.add(eklemek) dediğimiz terim burada çalışmayacaktır burda .put(koymak) "yemekKaloriMap.put(Key, Value)"
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)
        yemekKaloriMap.put("Havuç",23)
        //daha düzenli bir yapıya büründü

        println(yemekKaloriMap.get("Havuç"))
        /*
        dizilerde .get dediğimizden bizden index girdisi isterken
        şuan key anahtar kelimemizi girmemizi istiyor. bunun çıkrısı olarak anahtar kelimenin value değerini yazdıracaktır.
        Ayrıca Anahtar kelimemiz baştan string bir ifade olarak bildirdiğimden string bir ifade istemektedir.
        */
        println(yemekKaloriMap.get("Et"))

        //hashMapOf<Key,Value>()=HashMap<Key, Value>()

        val testMap = hashMapOf<String, Double>("Ahmet" to 1.78, "Mehmet" to 1.72, "Seyyid" to 1.70)
        println(String.format("%.2f",testMap.get("Ahmet"))) //logcat üzerinde çıktı aldığımda virgülden sonra iki basamak olarak sınırlamaktadır.
        println(String.format("%.2f",testMap.get("Seyyid"))) //virgülden sonraki basamak sayıları çoğaltmak istiyorsak .2f yerine .(ne kadar basamak istiyorsak)f şeklinde düzenlenebilir.
        println(String.format("%.2f",testMap.get("Mehmet")))

        //Matematiksel işlemler
        println("-------Matematiksel İşlemler-------")

        /*
        sayi++ (sayi ya 1 ekler), sayi-- (güncel sayi değerinden 1 çıkartır)
        && -> VE
        || -> VEYA
        < (küçüktür), > (büyüktür)
        <= (küçük eşit), >= (büyük eşit)
         */

        println(8+7) //toplama
        println(10-4) //çıkarma
        println(20*5) //çarpma
        println(10/2) //bölme

        //Remainder - Kalanı Bulmak
        println(10%3) //'%' işareti kalanı bul demek. bunun çıktısını logcat de 10 değerinin 3 ile bölümünden kalan 1 değerini vermektedir.

        //If Kontrolleri
        println("-------If Statements (Eğer Kontrolleri/İfadeleri)-------")
        val skor = -470

        if (skor < 10) {
            println("Oyunu Kaybettin!")
        } else if (skor >= 10 && skor < 20){
            println("Skorun 10 ile 20 arasında, iyi deneme")
        } else if (skor >=20 && skor <= 30){
            println("Skorun 20 ile 30 arasında, gayet başarılı")
        } else  {
            println("Skorun 30'un üzerinde, efsaneler kadrosuna girdin!")
        }

        //When (Bazı programlama dillerinde switch diye geçebilir)
        println("-------When-------")
        /* When in çalışma prensibi If e benzer yapıda. 'When' ne zaman kullanıyoruz sorusuna gelirsek; else if lerin çok olduğu dallanık budaklandığı kod bloklarında etkin olarak kullanabiliriz.
         */

        var notRakami = 1 //0 <= not rakamı >= 4
        var notStringi = ""

        when (notRakami) {
            0 -> notStringi = "FF, 0.0 - 1.5 Katsayısı ile çarpılır"
            1 -> notStringi = "DD, 1.5 - 2.0 Katsayısı ile çarpılır"
            2 -> notStringi = "CC, 2.0 - 2.5 Katsayısı ile çarpılır"
            3 -> notStringi = "BB, 2.5 - 3.0 Katsayısı ile çarpılır"
            4 -> notStringi = "AA, 3.0 - 4.0 Katsayısı ile çarpılır" //alternatif yol olarak 4 yerine else yazabiliriz if deki yapı when de aynı mantık ile çalışmaktadır.
        }
        //yukarıdaki yapı else if yapısına kıyasla daha düzenli ve kararlı bir yapıya sahip olmuştur.

        println(notStringi)

        //Döngüler
        /*Döngüler bütün programlama dillerinde olduğu gibi kotlin programlama dilinde mevcuttur. Belli bir koşula bağlı olarak
        işlemlerimizi tekrarlamamıza yardımcı olmaktadır.*/
        println("-------For Döngüsü-------")

        val numDizi = arrayOf(5,10,15,20,25,30)
        //numDizi sindeki her bir elemanı 5'e bölüp 3 eklemek istiyorum

        println("Döngü Başladı")
        for (num in numDizi){ //bunun anlamı numDizi si içerisindeki elemanlar tek tek "num" isimli değişkene atama yapılacak (num değişkeni başka bir yerde tanınmlı değil for döngüsüne başlamadan oluşturulmuştur)
            //bu döngü 6 kere çalışcaktır sebebi ise "numDizi" mizin boyutu(size) 6 olduğundan dolayı.
            println(num / 5 + 3)
        }
        println("Döngü Bitti")
        //for döngüsünden çıkması "numDizi" içerisindeki elemanları tüketmesi/bitmesi ile mümkündür.

        //Eğer bizim belirlediğimiz koşul ile loop dan çıkmasını istersek birazdan görüceğimiz "While" loop'u ile mümkün olacaktır

        for (indeks in numDizi.indices){ //geçerli indexlerini bize vermek için .indices ekini kullanabiliriz
            println(numDizi[indeks] / 5 + 3)
        }
        //yukarıda yaptığımız kod bloğu ile aynı mantıkda çalışmaktadır.

        /*
        Extra bilgi: for döngüsü sadece diziler ile çalışmaz farklı şekiller ile de kullanılabilir ama dizi ler ile o kadar senkronize ve uyumlu çalışıyorki dizilerle kullanmak artık standart(zorunlu) hale gelmiştir.
         */

        println("-------While Döngüsü-------")
        /*While kelime manası olarak sırasında/olduğu zaman/olurken manası gelmektedir.
        Kotlin programlamada  ise görevi; şu koşul sağlandığı sürece yapmaya devam et */

        var j = 0
        while (j <= 10){
            println(j) //bu kodu çalıştırısam logcat üzerinde program sonsuz bir döngüye girecektir.
            j++

        }

    }

}