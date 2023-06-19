package ch10_MethodCreation;

import java.util.Scanner;

public class C06_ReqursiveMethod {
    public static void main(String[] args) {

         /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek
 konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

        //Task kullanicidan aldiginiz sayinin foktoriel ini hesaplayan method create edini

        Scanner input= new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();


        System.out.println("factorial(sayi) = " + factorial(sayi));


    }

    public static int factorial(int sayi){
        if (sayi>=1){
            return sayi*factorial(sayi-1);
        }else return 1;

    }

}
/**
CHAT GPT çözümü

Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorial(number);
        System.out.println(number + "! = " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negatif sayıların faktöriyeli tanımlı değildir.");
        }

        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);

 */

/**
Loop ile çözüm

 int baslangıç = 1;
 for (int=i ; i<=sayi; i++) {
    baslangıç *=i;
 }
 return baslangıç;

 }
 */