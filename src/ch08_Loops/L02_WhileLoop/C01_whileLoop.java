package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        /**
        başlangıç be bitiş değerleri bilinen değerler olan tekrarlarda for loop
         ama adım sayısı belli olmayıp bir şarta bağlı olan tekrarlarda while loop kullanılmalı
         */

        // TASK01 -> 11 den 20 ye kadar olan tamsayıları print eden code create edniniz

        System.out.println("****  for ile çözüm ******");
        for (int i=11; i<20 ; i++) {
            System.out.println(i+ " ");
        }
        System.out.println();


        System.out.println("**** while loop ile çözüm *****");
        int sayi=11;

        while (sayi<20){
            System.out.println(sayi+ " ");
            sayi++; // sosnsuz loop olmaması için sayı birer artırıldı
        }

        // task02 -> 7 kere javacan print eden code create ediniz
        System.out.println("----task02-----");
        int i=1;
        while (i<=7){
            System.out.println(i+ " javacan ");
            i++;
        }

        // task03-> 2 basamaklı tek sayıları yanytana print eden code create ediniz

        System.out.println("******** task03 ***********");
        int task03Count= 11;
        while (task03Count < 100){
            System.out.print(task03Count+ " ");
            task03Count+=2;
        }

        // task04-> girilen metni while loop ile ters den print eden code create ediniz
        System.out.println(" ___________task 04__________");
        Scanner scan=new Scanner(System.in);
        System.out.println("birşeyler gir");
        String cumle = scan.nextLine();

        int uzunluk = cumle.length()-1;
        while (uzunluk>=0){
            System.out.print(cumle.charAt(uzunluk));
            uzunluk--;
        }
        System.out.println();

        System.out.println("fori fora");

        for (int j= cumle.length()-1; j>=0 ; j--){
            System.out.println(cumle.charAt(j));
        }

    // task 05-> girilen tamsayı kadar tamsayıların toplamını print eden code create edşnşz

        System.out.println("****** task 05*********");
        System.out.println("bir sayi giriniz");

        int sayi2= scan.nextInt();
        int total=0;

        while (sayi2 >0){
            total +=sayi2;
            sayi2--;
        }
        System.out.println("total = " + total);


        // task06-> girilen tamsayının faktoriyelini print eden code create ediniz
        System.out.println("*** task 06 ********");
        System.out.println("bir tam sayı giriniz");

        int sayi3= scan.nextInt();

        int faktoriyel = 0;

        while (sayi3>0){
            faktoriyel *=sayi3;
            sayi3--;
        }
        System.out.println("faktoriyel = " +faktoriyel);

    }
}
