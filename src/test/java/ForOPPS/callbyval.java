package ForOPPS;
// here values of actual parameters will be copied to formal parameters and these two different parameters store values
// in different locations;



class cal {
    int x;
    public void additon(int a){
        x = a+5;
    }
}




public class callbyval {
    public static void main(String[] args) {
        cal c = new cal();
        int x = 10;
        c.additon(x);
        System.out.println(x);

//        to get the value of x at the cal method we shold use "call by value" mehod as follows
           System.out.println(c.x);

    }

}
