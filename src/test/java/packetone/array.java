package packetone;

public class array {

    public static void main(String[] args) {
//        approch 1

        int a[]= new int[3];
          a[0]=23;
          a[1]=34;
          a[2]=67;
//          approch 2

        int c[]={100,200,300};

//        find the size of an array

        System.out.println(c.length);

//        to read single value from an array

        System.out.println(c[2]);

//        read multiple values from an array   is using loop

        for (int i = 0; i <c.length ; i++) {

            System.out.println(c[i]);        }

//             or we can use a loop called each loop

                for(int val : a){
                    System.out.println(val);
                }


//                _____________________
//                        two dimentional arrays

//        Approach two
        int r[][]=new int [3][2];   // so the first value indicate the row and the next column
          r[0][0]=100;
          r[0][1]=200;
          r[1][0]=300;
          r[1][1]=400;
          r[2][0]=500;
          r[2][1]=600;
//          approach two
        int w [][]= {{100,200},{300,400},{500,600}};

//        to know the length of row
        System.out.println(w.length);// this will only tell us a row

//        to know the length of the column
        System.out.println(w[0].length);

//        how to read a single value from an array
        System.out.println(w[0][2]);

//         so to see each value from two dimentional values
          for (int v=0;v<w.length;v++){
              for(int x=0;x<w[v].length;x++){
                  System.out.print(w[v][x] + " ");
              }
              System.out.println();
          }

//inhanced for loop to read data from two dimentional array

        for (int z[]:w){
            for(int h:z){
                System.out.println(h);
            }
        }


//        example for chaking a number existance in an array
        int t[]={3,5,7,9};
        int search_number=3;
        boolean flag = false;
        for (int i = 0; i < t.length; i++) {
            if(t[i]==search_number){
                System.out.println("yes the number is included in the array");
                flag=true;
                break;
            }
            if(flag==false){
                System.out.println("the number is not included");
            }
        }
    }
}
