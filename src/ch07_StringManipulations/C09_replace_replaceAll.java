package ch07_StringManipulations;

public class C09_replace_replaceAll {
    public static void main(String[] args) {

/** replace()
 * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
 * (update -set) saglar. Sonuc String'dir..
 *
 */

// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

//   "\\w" tum harf ve rakamlar [A-Z a-z 0-9]

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        System.out.println("str.replace('a','$') = " + str.replace('a', '$'));

        System.out.println("str.replace(\"tir\",\"*\") = " + str.replace("tir", "*"));

        System.out.println("str.replaceFirst(\"e\",\"*\") = " + str.replaceFirst("e", "*"));

        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));

        System.out.println("str.replaceAll(\"\\\\W\",\"*\") = " + str.replaceAll("\\W", "*"));

        // sadece harfleri yıldıza çevirin

        System.out.println("str.replaceAll(\"[A-Z a-z]\",\"*\") = " + str.replaceAll("[A-Z a-z]", "*"));

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
// formatta print eden code create ediniz.

// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

       String isim = "Meryem";
       String soyisim ="Hanım";
       String kartNo = "1234567891234567";

       String yeniIsimCiktisi = isim.charAt(0) + isim.substring(1).replaceAll("\\w","*");

        System.out.println("yeniIsimCiktisi = " + yeniIsimCiktisi);

        String yeniSoyIsimCiktisi = soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w","*");
        System.out.println("yeniSoyIsimCiktisi = " + yeniSoyIsimCiktisi);

        String yeniKartNoCiktisi = "**** **** **** " + kartNo.substring(12);
        System.out.println("yeniKartNoCiktisi = " + yeniKartNoCiktisi);


    }
}
