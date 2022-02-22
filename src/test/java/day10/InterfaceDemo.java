package day10;

// interface
/*
            -An interface in java is a blueprint of a class.
            -Interface contains final and static variables by default
            -Interface contains abstract methods.( also allowed default methods & Static methods from java8 onwards)
            -An abstract method is a method contains definition but not body.
            -Methods in interface are public by default.
            -Interface supports the functionality of multiple inheritance.
            -We can define interface with interface keyword.
            -A class extends another class, an interface extends another interface but a class implements an interface.
            -We can create Object reference for Interface but we cannot instantiate interface.
 */
/*

                                packages & access modifiers
                --------------------------
                public - we can access every where
                protected - we can access outside of the package but through inheritance
                default - only withing the package
                private  - only within the class

 */

interface  shape{
    //  interface contains abstract method , default methods, static methods
    // interface contains final and static variables
    int length =10; // this variable is static(can be called directly from static method)
                    // and final(means constant or cant be changed) variable by default
    int width = 20;  // again static and final variable

    void circle();   // abstract method   and if no access modifier is declared its by default "bublic" in interface

    static void square(){   // static method  its also bublic by default
        System.out.println(" i am square");
    }

    default void rectangle(){
        System.out.println("area of rectangel is " + (length*width));
    }

}
public class InterfaceDemo implements shape {

   public void circle(){    // public access modifier mechemere alebete
        System.out.println("i am circle ");
    }
    public static void main(String[] args) {
           InterfaceDemo id = new InterfaceDemo();   // instantiation
        // since shape is an interface it cant be instantiated like;-  shape a = new shape();
        // but instade we can do  using the class name like ;- shape a = new interfaceDemo();
           id.circle();   // abstract method
           id.rectangle();  // default method
           shape.square();   // static method
    }
}
