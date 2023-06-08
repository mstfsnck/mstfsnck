package javaCodeChallange.Challenge03;

import java.util.Scanner;

public class Task06_SwitchCase {

    /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("A;B;C harflerinden birini giriniz");
        // char harf = scan.next().toUpperCase().charAt(0);

        // switch ((harf)){
        switch ((scan.next().toUpperCase().charAt(0))){
            case 'A':
                System.out.println("java is easy");
                break;
                case 'B':
                    System.out.println("java is fun");
                    break;
                    case 'C':
                        System.out.println("I need study");
            default:
        }







    }
}
