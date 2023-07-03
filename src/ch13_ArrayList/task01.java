package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class task01 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> names = new ArrayList<>(List.of("Ali","Serap","Zeynep","Fuat"));
        ArrayList<String> newnames = new ArrayList<>();

        for (int i = 0; i < names.size() ; i++) {
            if(! names.get(i).toLowerCase().contains("a")){ // a harfi olmayanlari alir
                newnames.add(names.get(i)); // a harfi olmayan her elemanı namesListe ekler
            }

        }
        System.out.println(newnames);// [Zeynep]
        names.clear();

        System.out.println(names);
        names.addAll(newnames);

        System.out.println(names); // [Zeynep]




    }
}
