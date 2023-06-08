package ch06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        // girilen haftanın gününü hafta içi veya hafta sonu olduğunu print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bir gün ismi giriniz :");
        String gun = scan.nextLine().toUpperCase();

        switch (gun){

            case "PAZARTESI":
            case"SALI":
            case "CARSAMBA":
            case"PERSEMBE":
            case"CUMA":
                System.out.println("girilen gun hafta icidir");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("girilen gün hafta sonudur");
                break;

        }





    }
}
