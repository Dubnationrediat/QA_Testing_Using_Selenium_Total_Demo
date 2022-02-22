package Day9;

// create parent class
class parent {

    void display(int a){
        System.out.println(a);
    }
}
class childone extends parent{
    void  show (int b){
        System.out.println(b);
    }
}

class childtwo extends parent{
    void print (int c){
        System.out.println(c);
    }
}


public class ForhairarchyDemo {

    public static void main(String[] args) {
          childone ch1 = new childone();
          ch1.display(4);
          ch1.show(45);

          childtwo ch2 = new childtwo();
          ch2.print(5);
          ch2.display(67);
    }
}
