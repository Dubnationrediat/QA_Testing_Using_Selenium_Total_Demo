package Day8;

public class StaticExample {

    static int a = 18 ;// static variable
    int c=67;  // non-static

    static void m1(){
        System.out.println("this is tatsic method");
    }
    void m2(){
        System.out.println("non static method");
    }
    void m(){
        System.out.println("non static method ");
        System.out.println(a);
        System.out.println(c);
        m1();
        m2();
        // non static mehod we can call everything directely
    }

    public static void main(String[] args) {
        // without using any object static method can access static method and static variables
                System.out.println(a);
               // System.out.println(c); // this is error since b is not static variable
        m1();   // no object needed since its static method
        //m2();   // is error since its not a static method

//           so to access the methods and variables which are static we need an object since static methods can
 //          access non static variable or methods through object.
//         so... to access b and m2 we do the following
                    StaticExample sta = new StaticExample();
                    System.out.println(sta.c);
                    sta.m2();
//                    ሜን ሜትዱን ለብቻ ካረግ ነው ስታቲክ ቫሪያብል እና ሜትድን ስለማያገኛቸው አክሰስ ለማረግ የክላስ ስም ዶት አርገን ቫርያብል ወይም ሜትድን መጻፍ

    }
}
