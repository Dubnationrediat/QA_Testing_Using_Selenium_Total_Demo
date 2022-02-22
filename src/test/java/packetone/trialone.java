package packetone;

import java.util.Scanner;

public class trialone {

    public static void main (String[] arg) {

                    trialone excute = new trialone();
            //      excute.reverserwithpalindrome();
            //      excute.toCheckLength();
            //      excute.toCountEvenAndOdd();
            //      excute.forSum();
                }

          public void reverserwithpalindrome(){
              Scanner sc = new Scanner(System.in);
              System.out.println("please inter the nubmer to be refersed");
              int inputNumber = sc.nextInt();
              int initializer = 0;
              int validation = inputNumber;

              while ( inputNumber !=0){
                  initializer = initializer*10 + inputNumber%10;
                  inputNumber=inputNumber/10;
              }

              System.out.println("the reversed value is "+ initializer);
              if(initializer==validation){
                  System.out.println("the number is palindrome");
              }else {
                  System.out.println("the number is not palindrome");
              }

  }
    public void toCheckLength(){
        int numforcheckforlength = 34567;
        System.out.println(String.valueOf(numforcheckforlength).length());

    }

            public void toCountEvenAndOdd(){
                int givenNumber = 12345;
                int evenCount = 0;
                int oddCount=0;
                while (givenNumber!=0){
                    int remender = givenNumber%10;
                    if (remender%2==0){
                        evenCount=evenCount+1;
                    }else{
                        oddCount=oddCount+1;
                    }
                    givenNumber=givenNumber/10;
                }
        System.out.println("the number of evens digites in the number is "+evenCount);
        System.out.println("the number of odd digites in the number is "+ oddCount);
    }

                public void forSum(){
                    int givenNumber = 12344;
                    int foradding = 0;
                    while (givenNumber != 0) {
                        int remender = givenNumber%10;
                        foradding=foradding+remender;
                        givenNumber=givenNumber/10;
                    }
                    System.out.println(foradding);
                }
}
