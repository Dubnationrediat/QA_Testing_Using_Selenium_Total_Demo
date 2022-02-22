package Day9;
public class Forsuper {
    String color = "white";
    void  eat(){
        System.out.println("eating....");
    }

    Forsuper(){System.out.println("animal is created");}//constractro
}

class Dog extends Forsuper{
    String color ="black";
    void displayColor(){
        System.out.println(color);
        System.out.println(super.color); // for refering from parent
    }
    void eat(){
        System.out.println("eating bread");
        super.eat(); // for refering from parent
    }
    Dog(){
//        System.out.println("dog is created");
        super(); // to invoke the above parent constractor
                 // from Dog constractor
    }
}
// then the main method is done in separate class with the same packet so look for TESTSUPER CLASS ON THE LIST


