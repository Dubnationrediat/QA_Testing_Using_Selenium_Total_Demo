package Day12;

import java.util.HashMap;
import java.util.Map;

public class ForMapInterface {

//    list and set interfaces are from colleciton interface but map inteface is completely diffrent from those interfaces.

// MAP interface implimented using Hashmap class

    /*
                        HashMap - a class implemented Map interface
                    --------------
                    Data can be stored in the form of key, value pairs.
                    Key is unique. But we can have duplicate values.
                    Insertion order not preserved(Index not followed)
     */

    public static void main(String[] args) {

        // Declaration (በነዚ መንገድ ዲክሌር ማረግ ይቻላል)
                //       1) HashMap<firstvalueis key , secondvalue is value>  hm = new HashMap<Integer,String>();
                //         ይሄ የሚሆነው ኪ እና ቫልዮ ዳታ ታይፕን መወሰን ወይም ሪስትሪክት ማረግ ስንፈልግ ነው።
                //       2)  HashMap = hn = new HashMap();
                //       3)  Map = hn = new HashMap();

        Map hm = new HashMap();
        // to add new pair of key and value we use put method and key become the first to insert and value next
                hm.put(101,"devid");
                hm.put(102,"john");
                hm.put(103,"sintae");
                hm.put(104,"demeke");
                hm.put(105,"tufa");
                hm.put(106,"mary");
                hm.put(null,null); // here also the key null hould only be exist once but value can be plety of nulls

                // remember key should not be duplicated if you duplicate a key error will not be thrown but the old value
        //            will be replaced by the new value
               // but value can be duplicated its not a problem
//      To see the elements
                     System.out.println(hm); // ኦርደር አይጠብቅም

        // to remove pair from hasmap we use a method called remove(key)

                  System.out.println(hm.remove(101));
                  System.out.println(hm); // the first intery with devid is removed

        // to extract a value using key
                 System.out.println(hm.get(104));

        // to print only keys from the hasmap we use keyset method keySet()
                  System.out.println(hm.keySet());

        // and to print values one by one  we can use inhanced loop
                for(Object K: hm.keySet()){
                    System.out.println(hm.get(K));
                }
        // pirnt keys along with the values
             for(Object U : hm.keySet()){
                 System.out.println(U + "  "+ hm.get(U));
             }
        // to clear everything from the hashmap we use clear method
                      hm.clear();
                      System.out.println(hm);   // will return null


    }
}
