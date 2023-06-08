package ch07_StringManipulations;

public class C11_valueOf_parseInt {
    public static void main(String[] args) {

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bagis1 = " 1500    ".trim();
        String bagis2 = " 2000    ".trim();

        System.out.println(bagis1+bagis2);

        int b1 = Integer.valueOf(bagis1);
        System.out.println("b1 = " + b1);

        int b2 = Integer.valueOf(bagis2);
        System.out.println("b2 = " + b2);

        System.out.println("(b1+b2) = " + (b1 + b2));

        System.out.println("parseInt ile çözüm");

        int b11=Integer.parseInt(bagis1);
        System.out.println(b11);

        int b22=Integer.parseInt(bagis2);
        System.out.println(b22);

        System.out.println("(b11+b22) = " + (b11 + b22));


    }
}
