package Day11;

import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();
        try{
            a[pos]=num;
        }
        catch (Exception e){
            System.out.println("Invalid input provided....");
        }
        finally{
            System.out.println(" this will be excuted anyways");
        }

    }
}
