package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /**
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */

    public static void main(String[] args) {

        // Array tanımlama
        int a ; // primiticve data type tanımlandı
        int [] arr ; // declare edilen ama değer atanmayan int data type li ARRAY

        // System.out.println("a = " + a); // Variable 'a' might not have been initialized
        // System.out.println("arr = " + arr); // Variable 'arr' might not have been initialized

        // task nameArray isminde isimleri tutan array create ediniz

        String[] nameArray = {"rumeysa" , "ahmet", "zeynep", "tommy", "ali", "omer"} ;
        // HEM ATAMA HEM TANIMLAMA YAPILAN ARRAY

        // task number tutan array create ediniz
        int [] numArray = {11,22,333,66,55,44,88,99,55,2,44,55,6}; // dublicate e izin veriyor

        int [] sayiArr = new int[5];
        // heap memory de bunlar nasıl bulunur

        System.out.println("sayiArr = " + sayiArr); // sayiArr =sayiArr = [I@5f2050f6 reference value

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr)); // Arrays.toString(sayiArr) = [0, 0, 0, 0, 0]

        sayiArr[0] = 35;  // arrayın 0. indexteki elemanına 35 değerine atandı
        sayiArr[1] = 34;  // arrayın 1. indexteki elemanına 34 değerine atandı
        sayiArr[2] = 48;  // arrayın 2. indexteki elemanına 48 değerine atandı
        sayiArr[3] = 7;  // arrayın 3. indexteki elemanına 7 değerine atandı

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr)); // Arrays.toString(sayiArr) = [35, 34, 48, 7, 0]

        System.out.println("sayiArr.length = " + sayiArr.length); // sayiArr.length = 5
        System.out.println("nameArray.length = " + nameArray.length);  // nameArray.length = 6
        System.out.println("numArray.length = " + numArray.length); // numArray.length = 13

        // task herbir array in son elemanı print ediniz

        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]); // sayiArr[sayiArr.length-1] = 0

        System.out.println("nameArray[nameArray.length-1] = " + nameArray[nameArray.length - 1]); // nameArray[nameArray.length-1] = omer

        System.out.println("numArray[numArray.length - 1] = " + numArray[numArray.length - 1]); // numArray[numArray.length - 1] = 6

        // task name array deki son elemanı update ediniz

        nameArray[nameArray.length - 1] ="QA mustafa";
        System.out.println("nameArray = " + nameArray);  // nameArray = [Ljava.lang.String;@5315b42e
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray)); // Arrays.toString(nameArray) = [rumeysa, ahmet, zeynep, tommy, ali, QA mustafa]

        // loop ile array in elemanları arasında gezinme
        for (int i = 0; i <nameArray.length ; i++) {
            System.out.print( nameArray[i] + " "); // rumeysa ahmet zeynep tommy ali QA mustafa

        }

        System.out.println();

        // task NumArray deki cift index olan elemanları print ediniz
        for (int i = 0; i < numArray.length; i+=2) {
            System.out.print(  numArray[i] + " "); // 11 333 55 88 55 44 6

            System.out.println();

            // task name array in elemanlarından 5 harfli olan elemanları print ediniz
            for (int j = 0; j <nameArray.length ; j++) {
                if (nameArray[j].length()==5){
                    System.out.print(nameArray[j]);
                }
            }

            System.out.println(" // sort //");
            System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
            System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
            System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

            Arrays.sort(nameArray);
            Arrays.sort(numArray);
            Arrays.sort(sayiArr);

            System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
            System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
            System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        }


    }
}
