package Day11;

import java.util.Scanner;

public class TakingInputFromKeybord {





    public static void main(String[] args) {
        // for integer

                Scanner s = new Scanner(System.in);
                System.out.println("insert the first number");
                int num1 = s.nextInt();
                System.out.println("insert the second number");
                int num2 = s.nextInt();
                System.out.println("insert the third number");
                int num3 = s.nextInt();
                System.out.println("the result is ");
                System.out.println(num1+num2+num3);

//     for desimal number
                     Scanner u = new Scanner(System.in);
                    System.out.println("insert decimal number");
                    double dou = u.nextDouble();
                    System.out.println(dou + " is the number u inserted");
//        for string
                    Scanner ss = new Scanner(System.in);
                    System.out.println(" insert your name");
                    String name = ss.next();
                    System.out.println(name);

    }



}
