package Day8;

public class OverloadingConstractors {

    public OverloadingConstractors() {
        System.out.println("this is a default constractor");
    }

    public OverloadingConstractors(int a , int b) {
        System.out.println("this is constractor with parameter called parameterized constractor");
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        OverloadingConstractors co = new OverloadingConstractors(); // this will automatically invoke the first default constractor
        OverloadingConstractors bo = new OverloadingConstractors(3,4); // this will call the second constractor

    }



}
