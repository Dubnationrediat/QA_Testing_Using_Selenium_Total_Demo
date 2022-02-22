package Day8;

public class OverloadingMainMethod {

    void main(){
        System.out.println("this is my first main method");
    }

    void main(int a){
        System.out.println(a);
    }

    void main (int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        OverloadingMainMethod M = new OverloadingMainMethod();
        M.main();
        M.main(4);
        M.main(6,7);
    }


}
