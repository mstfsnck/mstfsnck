import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yıl giriniz ;");
        String harf=scanner.next();

        if(harf.toLowerCase().equalsIgnoreCase("a")){
            System.out.println("ilk küçük har ");
        }else System.out.println("ilk küçük  hgarf değil");
        { if (harf.toUpperCase().equalsIgnoreCase("Z")) {
            System.out.println("Z");
        }else   System.out.println("son büyük harf değil");



    }}}