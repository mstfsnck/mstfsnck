package javaCodeChallange.Challenge05;

public class Task01 {
    public static void main(String[] args) {

//        Task-> 100 den 0 a 13 e bölünen sayıları ve toplamlarını print eden code create ediniz

        int toplam=0; // döngüdeki 13 e bölünen sayıların toplanacağı boş container atandı


        for (int i = 100; i >0 ; i--) { // başlangıc değeri 100 bitiş değeri 0 olan ve bir azalan döngü tanımlandı
            if (i % 13 == 0) { // döngüden gelen herbir sayı 13 e bölünme şartı
                toplam += i; // 13 e tam bölünen döngü sayıları toplama eklendi
            }


        }
        System.out.println(toplam);

    }

}
