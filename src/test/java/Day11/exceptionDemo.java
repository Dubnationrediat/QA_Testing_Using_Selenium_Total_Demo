package Day11;

import java.util.Scanner;

public class exceptionDemo {

    public static void main(String[] args) {

                System.out.println("program is started");
                System.out.println("program is inprogress..");
                //        Arithemtic Exception
                Scanner sc = new Scanner(System.in);
                System.out.println("enter a number");
                int num = sc.nextInt();
                System.out.println(100/num);
        // if user insert "0" the statement will through an error  of artimhemtic and the rest will not be excuted
//        --------------------------------------
        // ArrayIndexOutoBoundsExcetption
                int a[]=new int[5];
                Scanner scc = new Scanner(System.in);
                System.out.println("enter number value");
                int num2 = scc.nextInt();
                System.out.println("where do u want to insert");
                int position = scc.nextInt();
                a[position]=num2;
//                if we put an index greter than the existing index it will throw this error
         //---------------------------------------------------
        // numberFormatException
        Scanner dd = new Scanner(System.in);
        System.out.println("enter a string");
        String ss=dd.next();
        int num4 = Integer.parseInt(ss);
        System.out.println(num4);
        // if we pass a string it will throw this ecxetpion
//-------------------------------------------
//        NullPointer exception
        Scanner jj = new Scanner(System.in);
        System.out.println("enter a string");
           String j= jj.next();
        System.out.println(j.length());
//        but if the value is null it will throw the nullpointerexception eg. String J = null; null means unknown but latter we can add a value
        System.out.println("program is completed");
        System.out.println("program is exirted");



    }
}
