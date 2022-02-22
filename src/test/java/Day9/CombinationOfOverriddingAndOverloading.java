package Day9;

class ABC {
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}
class XYZ extends ABC{
    void m1(int a){
        System.out.println(a*a); //implimentation change to give you a square so here overriding is done with in inheritance
    }
    void m2(int b, int n){
        System.out.println(b+n); // this is overloading  with in inheritance
    }

    // so as we can see XYZ have thee methods one m1(int a) , m2( int b and m2(int a, int n)
}


public class CombinationOfOverriddingAndOverloading {
    public static void main(String[] args) {
                 XYZ xyz = new XYZ();
                 xyz.m1(5);
                 xyz.m2(7);
                 xyz.m2(4,5);

    }
}
