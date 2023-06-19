package ch09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        // task -> girilen 7 tane tamsayinin 10 ile 20 arasındakiler haric toplamını print eden kode create ediniz

        Scanner input =new Scanner(System.in);

        int toplam = 0; // sayilarin toplamını yazdırmak için kaydetmek için create edildi
        int count = 0; // bu 7 sayi alabilmek için create edildi

        while (count < 7){
            int num= input.nextInt();
            if(num >= 10 && num <= 20){ // sayi 10 ile 20 arasında ise
                count++;
                continue;
            }

            toplam += num;
            count++;

        }
        System.out.println("girilen 7 sayının 10 ile 20 arasındakiler haric toplam " + toplam);









    }
}
