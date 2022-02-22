package Day9;

class x{
    void m1(int a){   // but if we add "final" prefix to this method then overriding is impossible
                     // but overloading is possible because the methods are diffrent
        System.out.println(a);
    }
}
class y extends x{
    void m1(int a){
        System.out.println(a + 3); // overriding and this will be impossible if we add "final"prefix on the parent method
    }
    void m1(int a , int b){  // overloading
        System.out.println(a+b);
    }
}
public class OverloadFinalMethods {



}
