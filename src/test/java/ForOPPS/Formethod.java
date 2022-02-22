package ForOPPS;

public class Formethod {
 int x= 10;
 int y=7;
 //methods can be done in 4 ways
//    1) No Params   No return value
//2) No Params   Return value
//3) Take params  No Return
//4) Take params  Return a value

//     1) No Params   No return value
//                void add(){
//                    System.out.println(x+y);
//                }
//    2)No params Return value
//                int add(){
//                    return  x+y;
//                }
//    3)take params No Return value
//            void add(int n, int b){
//                System.out.println(n+b);
//            }
//    4) take params Return values
          int  add(int n , int b){
                return  n+b;
            }

    public static void main(String[] args) {
               Formethod m = new Formethod();
             //  m.add();   // for type 1
//        ----------------------------------
             //  int responce = m.add();
             //  System.out.println(responce); // for type 2
//        ---------------------------------------
          // m.add(2,4);       // for type 3
//        -----------------------------------------
             int responce2 = m.add(3,6);
            System.out.println(responce2);     // for type 4
//        -------------------------------------------------

    }
}
