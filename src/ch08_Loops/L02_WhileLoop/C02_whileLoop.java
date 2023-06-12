package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {

        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz :");
        int sayi = scan.nextInt();

        int bolen = 1;

        int bolenSayısı = 0;

        while (bolen<=sayi){ // bolen sayi alınan sayıdan kucuk oldugu muddetce calıs
            if(sayi % bolen == 0){ // tam bolunme sartı
                bolenSayısı++;
            }
            bolen++; // bu kod olmazsa loop b,itmez
        }
        System.out.println("bolen sayısı " + bolenSayısı);






    }
}
