
// here bolth acutal and formal parameters refers to same memory location. therefore , any changes made to the formal
//parameters will get reflected to acutal parameters.

// here instade of passing values , we pass adresses.


package ForOPPS;

class calc{
    int x ;
    void add(calc a){
        x=a.x+5;
    }
}

public class Callbyreference {

    public static void main(String[] args) {
        calc v = new calc();
        v.x=10;
        v.add(v);
        System.out.println(v.x);
    }
}
