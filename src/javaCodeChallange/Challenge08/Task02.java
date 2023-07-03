package javaCodeChallange.Challenge08;

public class Task02 {
    public static void main(String[] args) {

        /*
        *dizi elemanlarının ortalama değerini hesapşlayan ve ortalamadan büyük olan elemanları print eden code create ediniz

         */

        int arr[]={1,2,3,4,5,6,7};

        int toplam=0; // arr elemanları toplanıp atanacak boş bir kutu tanımlandı
        for (int i = 0; i < arr.length ; i++) { // arr elemanlarını tekrara alan lopp tanımlandı
            toplam += arr[i] ; // döngüdeki herbir arr elemanı toplama eklendi

        }
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama :" + (toplam/ arr.length));
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>toplam/ arr.length){
                System.out.print(arr[i]+ " ");
            }

        }





    }
}
