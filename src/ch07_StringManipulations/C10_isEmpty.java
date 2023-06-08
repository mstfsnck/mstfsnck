package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {


        String hi = "hello";
        System.out.println("hi.isEmpty() = " + hi.isEmpty()); // false

        //Task->  2: kullanıcının girdiği ismin boş olup olmadığını kontrol edin. isim girdiyse devam etsin. girmediyse yeniden denesin

        Scanner input = new Scanner(System.in);
        System.out.println("ismini gir");
        String name = input.nextLine();

        if(name.isEmpty()){ // boşluk kabul ediyor
            System.out.println("isminizi girmeden ilerleyemezsiniz");
        }else System.out.println("hosgeldin " + name);

        if(name.isBlank()) { // boşluk kabul etmez
            System.out.println("isminizi girmeden ilerleyemezsiniz");
        }else System.out.println("hosgeldin blank ile " + name);




    }
}
