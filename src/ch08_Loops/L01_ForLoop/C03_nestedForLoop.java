package ch08_Loops.L01_ForLoop;

public class C03_nestedForLoop {
    /*
eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
içiçe döngü denir
İç döngü dış döngünün her adımda tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır..
 */
    public static void main(String[] args) {

        // task-> kat daire orneği ile nested for loop yapınız kat sayuısı 10 her katta 4 daire

        for (int kat= 0; kat<=10; kat++) { // en dış döngü
            System.out.println("su an bulunduğun kat ="+ kat);

            for (int daire = 1; daire <=4; daire++) { // en içteki loop buradaki loop sayisi bitmeden dıştaki loop a geçemez
                System.out.println("daire "+ daire);

            }
        }








    }
}
