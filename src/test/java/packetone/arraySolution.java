package packetone;

public class arraySolution {

    public static void main(String[] args) {
        // 1) find the sum of elements in array
         int a[]={1,2,3,4,5};
         int sumOfElements = 0;
        for (int i = 0; i < a.length; i++) {
            sumOfElements=sumOfElements+a[i];
        }
        System.out.println(sumOfElements);

//        2) Print Even and Odd numbers  from array.
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]+" is even");
            }else {
                System.out.println(a[i] + " is odd");
            }

        }

//        3)Sort Elements in Array
        int u[]={50,20,40,10,1000};
        int temp =0;
        for (int i = 0; i <u.length ; i++) {
            for (int j = i; j <u.length ; j++) {
                if(u[i]>u[j]){
                    temp=u[i];
                    u[i]=u[j];
                    u[j]=temp;
            }
            }
        }
        for (int y = 0; y < u.length ; y++) {
            System.out.print(u[y] +"  ");
        }

    }
}
