package javaCodeChallange.Challenge08;

public class Task03 {
    public static void main(String[] args) {
        /*
        task->
        "HeySiri" stringini "ByeSiri" ye çeviriniz
         */
        System.out.println("HeySiri");
        System.out.println("HeySiri".replace("Hey", "Bye"));

        // 2. yol
        String arr[]="HeySiri".split("y");
        arr[0] ="Bye";
        System.out.println(arr[0] + arr[1]);


    }
}
