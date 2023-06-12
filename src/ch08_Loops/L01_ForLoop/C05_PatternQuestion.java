package ch08_Loops.L01_ForLoop;

public class C05_PatternQuestion {
     /*
A
A B
A B C
A B C D
A B C D E
A B C D E F
şeklini yazdırınız.  65=A'nın ascıı değeri

*/

    public static void main(String[] args) {

        int harf=65; // ascii degeri kullanılması için create edildi

        for(int i = 0; i<6; i++){
            for (int j=0; j<=i; j++){
                //System.out.print("* ");
                System.out.print((char)(harf + j )+" ");
            }
            System.out.println(); // dummy kod, donguden sonra alt satıra geçirmek için kullanıldı
        }









    }
}
