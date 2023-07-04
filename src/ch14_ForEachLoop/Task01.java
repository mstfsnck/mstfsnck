package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK :
Bir öğretmenden girmek istediği kadar notu alınız, ve
ortalamayı geçen öğrenci sayısını bulan code create ediniz.

*/

        List<Integer> listNotlar = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String devamMi;
        do {
            System.out.println("istediğin kadar not gir");
            int ogrncNot = input.nextInt();
            System.out.println("devam edeceksen misin? devam icin(E) devam etmek istemiyorsan (H) ye bas");
            devamMi = input.next();
            listNotlar.add(ogrncNot);
        }while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println(listNotlar);

        // ortaalama hesapla
        int notlarToplamı = 0;
        for ( int w : listNotlar) {
            notlarToplamı += w;
        }
        double ortalama = notlarToplamı/listNotlar.size();

        System.out.println("ortalama = " + ortalama);

        // ortalama ustu olan not sayisi
        int ortalamaGecen = 0 ;
        for (int each : listNotlar) {
            if (each>ortalama){
                ortalamaGecen++;
                System.out.println("ortalamayı gecen not " + each);
            }
        }

        System.out.println();
        System.out.println("ortalamaGecen = " + ortalamaGecen);


    }
}
