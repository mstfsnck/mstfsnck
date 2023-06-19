package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD { // burada methodlar create edeceğiz
    // buradaki methodları runner class ve switch class dan çalıştıracağız
    // buradaki methodlar ihtiyaç olduğunda istenen yerden call edilebilir.
    // bu methodları calla edeceğiniz yerde main meth olmalı

    static Scanner input = new Scanner(System.in);
    static String StaticUsername = ""; // kullanıcıdan alınan user name i kayıt etmek için create edildi

    public static void createUser() {
        System.out.println("user name gir ; ");
        String userName = input.nextLine(); //bu method için create edildi

        StaticUsername = userName; // kulllanıcın girdiği user name bizde static olan variable atandı
        // cunku asağıda ki methodlarda kullanıcı kontrolu yapılıp true ise isleme alınacak

        System.out.println("userName = " + userName);

    }

    public static void getUser() { // kullanıcı isim girmeli bu isme göre kontrol yapılıp kullanıcıya true false dönmeli
        System.out.println("sorgulamak istediğin user name gir");
        String userName = input.nextLine();
        if (userName.equals(StaticUsername)) {
            System.out.println(userName + " isimli kullanıcı sistemde mevcut");

        } else System.out.println(userName + " isimli kullanıcı sistemde mevcut değil 404 not found");

    }

    public static void updateUser() { // burada kullanıcı kendi ismini update edecek
        System.out.println("mevcut isminiz " + StaticUsername);
        System.out.println("yeni ismini gir");

        String yeniIsim = input.nextLine();

        StaticUsername = yeniIsim;

        System.out.println("isim güncelleme başarılı ");
        System.out.println("yeni isminiz " + StaticUsername);

    }

    public static void deleteUser() {
        System.out.println("silmek istediğin ismi gir");

        String silinecekIsim = input.nextLine();

        if (silinecekIsim.equals(StaticUsername)) {
            System.out.println(StaticUsername + " isimli kullanıcı sistemden silindi");
            StaticUsername = null;
            System.out.println("silinen isim " + silinecekIsim);

        } else System.out.println(silinecekIsim + " ,s,ml, kullanıcı sistemde mevcut değil");

    }

    public static void cikis() {
        System.out.println("yine bekleriz ");
    }


}
