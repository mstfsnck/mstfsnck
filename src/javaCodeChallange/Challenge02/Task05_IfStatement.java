package javaCodeChallange.Challenge02;

import java.util.Scanner;

public class Task05_IfStatement {
    /** Task->
        Girilen jobTitle data için : Eger jobTitle
        qa ise print "is unvaniniz Quality Analyst."
        dev ise print "is unvaniniz Developer."
        ba ise print "is unvaniniz Business Analyst."
        pm ise print "is unvaniniz Project Manager."
        code create ediniz...
       */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("job title giriniz :");
        String jobTitle = input.next();

        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("is unvaniniz Quality analist");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("is ünvanınız developer");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("is unvaniniz besines analyst");
        }else System.out.println("düzgün bilgi giriniz");


    }
}
