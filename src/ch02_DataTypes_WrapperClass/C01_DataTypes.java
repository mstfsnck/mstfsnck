package ch02_DataTypes_WrapperClass;

public class C01_DataTypes {
    public static void main(String[] args) {

        String name = "Hasan";
        String yas = "23";
        int age= 35;
        int yıl = 2023;
        boolean emeklimi = false;
        boolean testermi = true;
        // char ch = '$a'; // Too many characters in character literal hatası alınır

        char ch = '$';
        char harf = 'A';

        //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız... variable crate ederek hesaplayiniz hepsini atama yapiniz

        int dogumtarihi = 1999;
        int buguntarihi = 2023;
        int yasiniz = buguntarihi - dogumtarihi;

        System.out.println("yasınız = " + yasiniz);

        float f1 = 12.45f ; // ondalıklı sayılar yazılırken nokta koyulur. bazı bilgisayarlarda virgül kabul edilir
        float f2 = 15.45f ;

        double d = 25.55;

        System.out.println("f1*f2 = " + f1*f2);

        byte sayi1=100;
        byte sayi2=28;
        byte toplam = (byte) (sayi1+sayi2);
        System.out.println("toplam =" +toplam);

        // Task -> iki farklı tamsayı türünde sayı tanımlayıp toplamını print ediniz
        int c=33;
        byte by = 120;
        System.out.println("c + by = "+(c + by)); // 153
        System.out.println("c + by = " + c + by); // c + by = 33120 toplama işleminde dikkat edilmeli çünkü toplama işleminin öncesinde

        // Task-> tamsayı ve ondalıklı sayi tanımlayıp toplamıo print ediniz
        int sayi5 = 10;
        double sayi6 = 10.5;
        System.out.println(sayi5 + sayi6); // 20.5

        // Task -> tamsayı ve char data type iki variable tanımlayıp toplam print ediniz
        int sayi7= 45;
        char para = '$';
        System.out.println(sayi7+para); // 81
        System.out.println(para + 1); // 37
        //$ in ASCII değeri 36 olduğundan char ve int variable toplama işlemine dahil olurlar

        System.out.println("sayi7 + para = " + sayi7 + para); // sayi7 + para = 45$ concatination

        // Task-> ad ve soyadınızı ve yasınızı print ediniz.

        String isim = "mustafa";
        String soyisim = "şenocak";
        int yass = 34;

        System.out.println(isim +" " + soyisim+ " "+ " " +yass);


    }
}
