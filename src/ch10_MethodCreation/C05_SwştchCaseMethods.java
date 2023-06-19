package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.createUser;

public class C05_SwştchCaseMethods { //CRUD class daki methodları burada switch edeceğiz

    // karşılama methodu yazalım

    public static void menu() {
        System.out.println("sistemimize hosgeldin");
        System.out.println("uygulamaya kayıt için 1 \n kullanıcı sotgulamak icin 2 \n +" +
                "kullanıcı bilgi güncelleme 3\nkullanıcı silme 4\n cikis 5 e basınız");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim) {
            case 1:
                createUser();
                menu();
                break;
            case 2:
                C05_CRUD.getUser();
                menu();
                break;
            case 3:
                C05_CRUD.updateUser();
                menu();
                break;
            case 4:
                C05_CRUD.deleteUser();
                menu();
                break;
            case 5:
                C05_CRUD.cikis();
                break;

            default:
                System.out.println("hatalı bir seçim yaptınız");
                menu();
                break;

        }


    }


}
