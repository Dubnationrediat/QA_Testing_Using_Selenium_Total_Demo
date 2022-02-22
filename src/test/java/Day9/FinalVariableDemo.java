package Day9;

public class FinalVariableDemo {
    int speed = 100; // here we can chage the value anywhere  so
    // if we want the speed value not to be changed  we add a prefix called "final"
    // eg final int speed = 100;

    public static void main(String[] args) {
        FinalVariableDemo F = new FinalVariableDemo();
        F.speed=456; // it will work as long as in the initialization the prifix " final " is not implimented
        System.out.println(F.speed);
    }
}
