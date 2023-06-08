package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...

        Scanner scanner = new Scanner(System.in);
        System.out.println("ay no girin");
        int ayno = scanner.nextInt();
        switch (ayno) {
            default:
                System.out.println("1-12 arası br no girin");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Girdiğiniz ay kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Girdiğiniz ay ilkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Girdiğiniz ay yaz mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Girdiğiniz ay sonbahar mevsimi");
                break;
        }













    }
}
