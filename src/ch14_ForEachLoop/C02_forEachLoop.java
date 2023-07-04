package ch14_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {

// task bir md array in elamanlarının çarpımını print eden code create ediniz...-> with for-each
        int [] [] arr = { {2,5,6,8 }  , {9,2,5,8 } , {3,5,7,9}};

        //for-each ile
        int carpim =1;
        for (int [] ictekiArrayler  :  arr) {
            for (int herbirEleman : ictekiArrayler) {
                // burada herbir elemana dokunabilirz
                carpim *= herbirEleman ;
            }
        }


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {


            }
        }

        System.out.println("carpim = " + carpim);


    }
}
