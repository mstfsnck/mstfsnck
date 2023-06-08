package ch04_JavaOperators;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // String Örneği
        String adSoyad = input.nextLine();
        // Sayı Örnekleri
        int yas = input.nextInt();
        double maas = input.nextDouble();
        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);

    }
}









