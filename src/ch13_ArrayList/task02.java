package ch13_ArrayList;

import java.util.ArrayList;

public class task02 {
    public static void main(String[] args) {
         /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve
 harf sırasına göre yazdıran bir METHOD yazınız.
Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
 */

        String[] [] mdArray = {{"Ali","Fatih","Hasan"},{"Derya","Zeynep"}, {"Toomy"}};
        arrayConvertList(mdArray);


    }

    private static ArrayList<String> arrayConvertList(String[][] str) {
        ArrayList<String>nameList = new ArrayList<>();

        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j < str[i].length; j++) {
                nameList.add(str[i][j]);

            }
        }
        System.out.println(nameList);

        return nameList;
    }
}
