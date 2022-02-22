package Day12;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {

    /*
   Arrays
-----------
        1) Fixed size
        2) Different type of data cannot be stored( heterogenios data not allowed)

 Collection --> To represent group of elements/objects into single entity then go for collections.

  Collection is an Interface

  to and it composed of other sub interfaces like LIST AND SET and this
  interfaces are implimented using classes so List interface is implimented using ArrayList Class
  andsout
  , set interface is implimented using HashSet class

    List , Set  ----> ArrayList, HashSet

   All types of collectiosn available in java.util  package.

     */

//    -----------------------------------------------------------------
    /*
    ArrayList - a class implemented List interface
        ------------------
        1) Heterogenios data ---> allowed
        2) Insertion order  --> preserved (Index)
        3) Duplicate elements --> Allowed
        4) Multiple nulls allowed
     */
            public static void main(String[] args) {

//                arrayLiist declaration
                        ArrayList <Integer> list = new ArrayList<Integer>(); // for homogenious data declaration
                        ArrayList List = new ArrayList(); // for hetrogenous data declaration
                // to add elements to arraylist we use a method called add()
                    // add method always add elements at the end of the list
                        List.add(100);
                        List.add(10.5);
                        List.add("welcome");
                        List.add('A');
                        List.add(true);
                        List.add(null);
                        List.add(100);
                        List.add(null);

                  // to know the size(how many elements are in the ArrayList) we use size method size()
                             System.out.println(List.size());  // 8 will be used
                // to display elements from teh ArrayList we use
                            System.out.println(List);
                // remove element from ArrayList using index
                            List.remove(5);  // this will remove the null value from array --- 5 is index
                            System.out.println(List);
                // to insert element at middle of the list
                              List.add(3,"sintae");  // will be inserted as fifth element
                              System.out.println(List);
                // Read spacific value from arrayList we will use an index number and get method get()
                             System.out.println(List.get(0));
                // to read multiple value use loop eithier inhanced or normal loop
                       // using inhanced loops
                              for(Object x:List){    // when we use object method we can use it for any kind of data declaration
                                  System.out.println(x);
                            }
                       // using normal loop
                            for (int i = 0; i <List.size() ; i++) {
                                System.out.println(List.get(i));
                            }
              // to clear everything from arraylist we use clear method clear()
                           List.clear();
                         System.out.println(List);  // it will be empity
//----------------------------------------------------------------------------------------------------------
//                HASHSET
                /*
                HashSet   - a class implemented Set interface
                        ---------
                        1) Heterogenios data ---> allowed
                        2) Insertion order  --> Not preserved (Index)  NO INDEX CONCEPT IN HASHSET
                        3) Duplicate elements --> Not Allowed
                        4) Multiple nulls Not allowed/ only single null is allowed

                 */


//                DECLARATION
                        HashSet<Integer> H = new HashSet<Integer>(); // to store a homogenious data
                        HashSet h = new HashSet();  // to store hetrogenious data
// we can also wright like this set h = new HashSet()  since set is interface and hashset is a class implemented through object

                // to add element to HashSet
                        h.add(100);
                        h.add(true);
                        h.add(null);
                        h.add(10.5);
                        h.add(100);
                        h.add(null);
                        h.add("rediat");
                // since duplicaiton is not allowed it will only get one value from the two, it will not throw error
      // to know the size we use size method size();

                        System.out.println(h.size());
                        System.out.println(h);
                        // *insertion order is not preserved ልክ እንደ ArrayList ባስገባነው መልክ አይደለም ምናገኘው።
                       // * insertion based on once choice is not allowed since there is no index and no fixed position
//                            of elements

       // remove elements from HashSet
                // here since there is no index we will be forced to pass the value directly
                       h.remove("rediat");
       // to retrive the value from Hashset
                // here since ther is no index we cant use h.get() method  so retriving is not possible
       // for searchin the existance of an element we use contains method contains()
                System.out.println(h.contains(100)); // it will return bollean
                  // isEmpity method will return true if the hashset is empiyt and false if its now empity
                System.out.println(h.isEmpty());  // return false
                // lets clear it and check isEmpity
                  h.clear();
                System.out.println(h.isEmpty()); // will return true

        // to read values we will use loop concept either inhanced since there is no index we can use normal loop
                      // using inhanced for loop
                    for(Object j : h){
                        System.out.println(j);
                    }
        //           using normal loop
                        for (int i = 0; i < h.size(); i++) {
//                            System.out.println(h. " here we have to have index to go look for element");
                        }
//------------------------------------------------------------------------------------------------------------






















            }
}
