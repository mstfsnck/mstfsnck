package ch09_Break_Continue;

import java.util.Scanner;

public class C01_breake {
    public static void main(String[] args) {

        //break
      /**
break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

      // Task-> girilen bir mail hesabının @ sembolune kadar olan karakterlerini print eden code create edinz

        Scanner scan= new Scanner(System.in);
        System.out.println("mail gir");

        String mail = scan.nextLine();

        for (int i = 0; i <mail.length(); i++) { // girilen mail in sonuna kadar git

            if(mail.charAt(i) == '@') { // her bir karakterin @ ile eşit olmasına bakar
                break; // if şartı true olduğunda loop kırılır
            }
            System.out.println(mail.charAt(i));
        }

















    }
}
