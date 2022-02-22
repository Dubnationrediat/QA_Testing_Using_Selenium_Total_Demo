package Day9;

class temp{
    void m1(){    // but if we add "final" prifix before the void here the method cant be overright that method anywhere
        System.out.println(" this is m1 method....");
    }

}

// also if we add " final " keyword for the class that means the class will not be or cant be extended to another class
class  tempchild extends temp{
    void m1(){
        System.out.println(" this is m1 override mehtod");
    }
}


public class FinalMethodDemo {
    public static void main(String[] args) {

    }
}
