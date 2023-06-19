package javaCodeChallange.Challenge05;

public class Task02 {
    public static void main(String[] args) {

        // Interview Question
        // 0-255 e kadar olan sayıların karakter değerini print een code create ediniz

        for (int i = 0; i <=255 ; i++) {
            char karakter= (char) i; // döngüden gelen herbir i tamsayının ASCII değer, karaktere atandı
            System.out.println(i+" 'nin karakter değeri ->"+karakter);
        }

        int a=0;

        System.out.println(" *** while ***");

        while (a<=255) {
            char c= (char) a;
            System.out.println(a +" 'nin karakter değeri "+c);

            a++;
        }





    }
}
