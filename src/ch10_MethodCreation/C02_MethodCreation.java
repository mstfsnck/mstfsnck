package ch10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // girilen üç notun ortalamasını creat eden method creat ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("1.notu giriniz");

        double not1 = input.nextDouble();


        System.out.println("ikinci notunu gir");
                double not2 = input.nextDouble();


        System.out.println("üçünü notu gir");
        double not3 = input.nextDouble();


        System.out.println(ortalamahesapla(not1, not2, not3));


    }

    private static double ortalamahesapla(double not1, double not2, double not3) {
        return (not1 + not2 + not3) /3 ;

    }
}
