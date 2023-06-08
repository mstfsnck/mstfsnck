package ch07_StringManipulations;

import java.util.Scanner;

public class C06_subString {
    public static void main(String[] args) {

        /**
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

        String str =" Çalıştıkça daha çok şey bilmediğimi farkediyorum";
        System.out.println("str.substring(0,5) = " + str.substring(0, 5)); //Çalı

        //TASK str datasının son 12 karakterini print ediniz
        int sonOnIkiKarakterIndexş = str.length() -12 ;

        System.out.println("sonOnIkiKarakterIndexş = " + sonOnIkiKarakterIndexş); //37

        System.out.println("str.charAt(sonOnIkiKarakterIndexş) = " + str.charAt(sonOnIkiKarakterIndexş)); // f

        System.out.println("str.substring(sonOnIkiKarakterIndexş) = " + str.substring(sonOnIkiKarakterIndexş)); //farkediyorum


        //TASK str datasının ilk 10 karakterini print ediniz. (sonuç olarak ilk 10 karakterini hepsi)

        System.out.println("str.substring(0,11) = " + str.substring(0, 11)); // Çalıştıkça

        // task -> girilen 4 harfli kelimeyi tersten yan yana print eden code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli kelime giriniz :");
        String kelime = scan.nextLine();

        System.out.print(kelime.substring(kelime.length() - 1)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));




    }
}
