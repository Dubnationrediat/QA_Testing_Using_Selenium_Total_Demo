package Day11;

import java.util.Scanner;

public class HandelingException {




    public static void main(String[] args) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("enter a number");
                    int num = sc.nextInt();
                    try{
                        System.out.println(100/num);
                    }
                    catch (ArithmeticException e){
                        System.out.println("Invalid input provided....");
                    }
// እዚ ጋር ምናልባት ሊሰጥ የሚሽለውን ኢረር ካላወቀቅን መልቲፕል ካች ብሎክ ማስቀመጥ እንችላላን።
//        ለምሳሌ
            //        try{
            //            System.out.println(100/num);
            //        }
            //        catch (ArithmeticException e){
            //            System.out.println("Invalid input provided....");
            //        }
            //        catch (NullPointerException e){
            //            System.out.println("Invalid input provided....");
            //        }catch (NumberFormatException e){
            //            System.out.println("Invalid input provided....");
            //        }
//        ግን ይሄንን ስናረግ ሁሉንም ኤክሰፕሽን አይነት ጽፈን አንጨርሰውም ስለዚ ጥሩ ሚባል አማራጭ አይደለም ከዚ የተሻለው አንድ ካች ሰርቶ ኤክሰፕሽን ሚለውን ብቻ መጠቀም ነው
//                    try{
//                        System.out.println(100/num);
//                    }catch(Exception e)
//                    {
//                        System.out.println("invalid input provided....");
//                    }

                        System.out.println("program is completed");
                        System.out.println("program is exited");


    }
}
