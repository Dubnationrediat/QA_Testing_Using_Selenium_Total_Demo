package Day9;

public class StringEquality {


    public static void main(String[] args) {

        String s1 = "welcome";
        String s2 ="welcome";
        System.out.println(s1==s2);    // true
        System.out.println(s1.equals(s2)); // true

         // but if we use a string object like the folowing

        String s3 = new String("welcome");
        String s4 = new String("welcome");
        System.out.println(s3==s4);   // false
        System.out.println(s4.equals(s3));   // true

    }
}
