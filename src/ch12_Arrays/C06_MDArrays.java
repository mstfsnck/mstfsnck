package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {
    public static void main(String[] args) {
          /**
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
       *  icerdeki  array'lere  inner->Daire array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

          // MD array tanımla
        int [] arr = new int [3];
        int [][] arr1 = new int [3][5]; // 3 satır 5 sütün olacak

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1)); // Arrays.toString(arr1) = [[I@19dfb72a, [I@17c68925, [I@7e0ea639]


        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1)); // Arrays.deepToString(arr1) = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        int [][][] arr2 = new int [2] [ 3] [5];

        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2)); // Arrays.deepToString(arr2) = [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]

        // task 24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array olarak tanımlanır

        int sinif24 [] [] = new int [3] [24];
        int sinif21 [] [] = new int [5] [21];




    }
}
