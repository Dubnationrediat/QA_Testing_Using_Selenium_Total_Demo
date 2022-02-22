package day10;
// abstraction is a process of hiding the implementation details and showing one funcitonality to the user.
// ther are two ways to achieve abstraction in java
// Abstract class ----- baseics
// interface ------ advanced
    /*
                Abstract class
                ------------
                An abstract class must be declared with an abstract keyword.
                It can have abstract and non-abstract methods.
                An abstract method is a method contains definition but not body.
                It cannot be instantiated.  --- can't create an object
                It can have constructors and static methods also.
     */


// void m1(){ //----------------> non-abstract method

// implimentation
// }

// abstract void m11();   //---------> abstract mehtod

// key point here is,-- abstract method cant be defined in normal class but in abstract class normall method  can be defined
abstract class animal{    // abstract class

    abstract void eat();   // abstract method

    void run(){            // non abstract method
        System.out.println("runs fast");
    }

    static void sleep(){     // static method
        System.out.println("i was sleeping");
    }

   animal(){                   // constractor method
       System.out.println("eat grass");
   }
}

class Horse extends animal{     // ሌላ ግዜ ቢሆን ኢንህሬት ስናደርግ ሁሉም ከፓረንት ክላስ ይመጣሉ ነገር ግን አብስትራክት ከሆነ እራሳችን ኢንፕሊመንት ማረግ አለብን
  void eat(){
      System.out.println("eat grass again");   // የሄንን ያረግነው አብስትራክት ክላስ በኖርማል ክላስ ውስጥ ኢንህሬት መደረግ ስለማይቻል።
  }
}
//-------------------------------------------------- end of abstract part------------------------------


public class Abstraction {

    public static void main(String[] args) {

//---------------------------------for abstract part ------------------------------
        Horse h = new Horse();
        h.eat();    // invoking abstract method
        h.run();    // invoking non abstract method
       animal.sleep();  // invoking static method without object

        // animal h = new animal();  // this will be error since abstract classes cant be instantiated.but
        //we can use other extended methods like horse eg. animal h = new Horse(); and it will give as the same result.
        // since horse have everything animal class have since its extended from animal.
 //_________________________________ end of abstract ------------------------------------------------





    }


}
