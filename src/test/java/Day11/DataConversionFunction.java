package Day11;

public class DataConversionFunction {

    public static void main(String[] args) {

//        CONVERSION OF STRING TO NUMBER
        String s = "1234";
//        to know the data type we use the following
            System.out.println(s.getClass().getName());
//            to change it to number we do the foloowing
            //        int num = Integer.parseInt(s);
            //        System.out.println(num);
     //   System.out.println(num.getClass().getName());  // here it will be error since int is primitive type of data
        // so to do that we will use the wrapper class for integer like the follwong
                    Integer num = Integer.parseInt(s);
                    System.out.println(num);
                    System.out.println(num.getClass().getName());
//                    -------------------------------------------------------------------------
//        CONVERSION OF Integer TO STRING
                    int nu = 100;
                    String k = String.valueOf(nu); // we can pass int,float,double,booelan etc....
                    System.out.println(k.getClass().getName());

//        CONVERSION OF STRING TO DOUBLE
                  String hi = "12.4";
                  Double hii = Double.parseDouble(hi);
                  System.out.println(hii);
//        CONVERSION OF CHARACTER TO STING
                         char a = 'A';
                         String aa = String.valueOf(a);
                          System.out.println(aa);
//        CONVERSION OF DOUBLE TO STRING
                double y = 23.4;
                String b = String.valueOf(y);
                System.out.println(b);
                System.out.println(b.getClass().getName());// to know the data type


    }
}
