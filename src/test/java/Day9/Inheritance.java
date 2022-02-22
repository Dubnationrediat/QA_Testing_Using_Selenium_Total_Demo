package Day9;

class A {
    int a = 100;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b = 200;
    void show (){
        System.out.println(b);
    }
}
// the above is example of single inheritance
//the below class is for multi level inheritance
 class C extends B {
    int H =40;
    void print(){
        System.out.println(a);
    }
}



public class Inheritance {

    public static void main(String[] args) {

//         ---for single inheritance part-----
        B fromB = new B();
        fromB.a=500;
        fromB.b=345;
        fromB.display();
        fromB.show();
//        -----end of single inheritance part----
//        -------------start of multi leve inheritance----
        C fromc = new C();
        fromc.show();// coming from B class
        fromc.display();//came from A class
        fromc.print(); // from C it self
//        -------------end of multi level---------



    }

}
