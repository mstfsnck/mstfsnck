package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase_ATM_Project {
 static String password = "12345" ; // kullanıcının banka kayıtlı şifresi gibi düsünün
    public static void main(String[] args) {
        //database mantığınca bankada tutulan şifre creat edin
         /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
 çıkış işlemlerinin yapıldıgı bir
 ATM app. code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("****JAVABANK ATMA SİNE HOSGELDİNİZ******");

        System.out.println("sifreni gir ;");
        String sifre = input.nextLine();

        if(sifre.equals(password)){
            System.out.println("sifreniz eşleşti devam edebilirsiniz");

            System.out.println("bakiye sorgulama için 1\n para yatırma için 2 \n +" +
                    "\n para çekme için 3 \n cıkıs için 4 tuşlarına basınız");

                    int secim = input.nextInt();
            // baslangıc bakiyesi create edildi
            int bakiye = 1000;

            switch (secim) {
                case 1:
                    System.out.println("bakiye " + bakiye);
                    break;

                case 2:
                    System.out.println("ne kadar yatırmak istersiniz ");
                    int yatırılacakMiktar = input.nextInt();
                    bakiye += yatırılacakMiktar;
                    System.out.println("guncek bakiyeniz =" + bakiye);
                    break;

                case 3:
                    System.out.println("ne kadar cekmek istersiniz");
                    int cekilecekmiktar = input.nextInt();
                    if (cekilecekmiktar <= bakiye) { // bakiye yeterli olma senaryosu
                        bakiye -= cekilecekmiktar;
                        System.out.println("cekilen miktar =" + cekilecekmiktar);
                        System.out.println("kalan miktar =" + bakiye);


                    } else System.out.println("bakiyeniz yetersiz");
                    break;

                case 4:
                    System.out.println("yine bekleriz");
                    break;

                default:
                    System.out.println("hatalı secim yaptınız");

            }

        }else System.out.println("hatalı şifre girdiniz 2 hakkınız kaldı");










    }
}
