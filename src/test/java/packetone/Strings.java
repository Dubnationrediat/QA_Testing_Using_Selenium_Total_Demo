package packetone;

public class Strings {

    public static void main(String[] args) {

        String name ="john";                        // normal assignment
        String namee = new String("john");  // object reference variable type of declaration since string is pre-defined class
                                                   // or its non primitive type of class

       //  CLASS is a colleciton of methods
       //  METHOD is a group of statement which will perfom some operations
              //  by using the class name we can access those methods

                            String s = "wlcome";
                            System.out.println(s);
           // TO KNOW THE LENGTH OF A STRING WE HAVE A METHOD CALLED length().
                     s.length();
                     System.out.println(s.length());
                      // or
                        int lenght = s.length();
                        System.out.println(lenght);
          // joinning can be done using CONCATINATION which use + sign
                        System.out.println("rediat"+" terefe");
        // or we can use method called concat()...but it is used only for string
        //example
                    String ST1 = "HI ";
                    String ST2 ="MR ";
                    String ST3="SINTAE";
                     System.out.println(ST1.concat(ST2).concat(ST3));

//        ONOTHER METHOD IS TRIM---IT WILL REMOVE SPACING
//            example
                          s="  automation   ";
                          System.out.println(s);
                          System.out.println(s.length());
//                  using trim()
                          System.out.println(s.trim());
                          System.out.println(s.trim().length());
//                     ANOTHER MTHOD IS charAt() method ---it will return a single character based on the index
                             String  R="rediat";
                               R.charAt(4);  // for is index  and index start from zero
                            System.out.println(R.charAt(4));
//                ANOTHER MEHTOD IS CONTAINS() AND WILL RETURN A TRUE OR FALSE
                               String  b = "selenium";
                               System.out.println(b.contains("sele"));

//                 ANOTHER METHOD IS EQUALS() and EQUALSIGNORECASE() WHICH WILL COMPARE TWO STRINGS AND RETURN BOOLIEN
//                                 EQUALS() ---IS CASE SENSITIVE
//                                 EQUALIGNORECASE()---IS NOT CASE SENSITIVE

                                 String Q = "this is training ";
                        System.out.println(Q.equals("thsi is training"));
                        System.out.println(Q.equalsIgnoreCase("THIS IS TRAINING "));

//        ANOTHER METHOD IS REPLACE() METHOD TO REPLACE SINGLE OR MULTIPLE CHARACTERS IN A STRING
                              String nb = "welcome to the beautiful land";
                              nb.replace('e','u');
                              System.out.println( nb.replace('e','u'));
//               To replace everything
                               nb.replace(("welcome"),"hi");
                               System.out.println( nb.replace(("welcome"),"hi"));
//         ANOTHER METHOD IS SUBSTRING() METHOD WHICH WILL EXTRACT SUBSTRING OF THE MAIN STRING  ("STARTING INDEX", "ENDING INDEX")
                                String nm = "welcome";
             /*
             starting index ---> 0123456
                text -->         welcome
                ending index --->1234567
              */
                           nm.substring(0,3);
                        System.out.println(nm.substring(0,3));



//        ANOTHER METHODS ARE CALLED  TWOUPPERCASE() TWO LOWERCASE()

                        String hg = "welcome";
                        System.out.println(hg.toUpperCase());
                        System.out.println(hg.toLowerCase());

//        ANOTHER METHOD IS SPLIT() USED TO DEVIDE STRING INTO MULITPLE PARTS BASED ON DELIMETER/SEPARATOR
                        String huma= "rediat terefe";
                        System.out.println(huma);
                        System.out.println(huma.split(" "));  // ዴሊ ፓራ//ር ይባላለ ያ ማለት ሰፓሬት ያረጋቸው ምንድነው የሚለው ነው በዚ ኬዝ ስፔስ ነው
                        String collector[]=huma.split(" ");   // ይሄንን ያረኘው እያንዳንዱን ስትሪንግ አርጎ አውጥቶ ያው አሬ ውስጥ እንዲያስቀምጥልን ነው
                        System.out.println(collector[0]);   // እዚ ላይ ያው የመጀመሪያውን ማለትም rediat የሚለውን ያወጣለናል ማለት ነው


//        HOW TO REVERSE A STRING
                  String alpha = "aba";

                  String reversed = "";
                  int  len = alpha.length();
                  for(int i=len-1;i>=0;i--){
                      reversed = reversed + alpha.charAt(i);
                  }
        System.out.println("reversed string is " + reversed);
                  if (alpha.equals(reversed)){
                      System.out.println("the string is palindrome String");
                  }else {
                      System.out.println("its not a palindrome string");
                  }










    }
}
