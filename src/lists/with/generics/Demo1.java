

package lists.with.generics;

import common.Dog;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    
    public static void main(String[] args) {
        // non-generic list
        List<String> myList = new ArrayList<String>();
        myList.add("Beer");
        myList.add("Chips");
        myList.add("Pizza");
        myList.add("Beer");
        myList.add(1, "Steak");
        
//        myList.remove(2);
        
        for(String s: myList){
            s = s.toUpperCase();
            System.out.println(s);
        }
        
//        String pizza = (String)myList.get(2);
//        
//        for(Object obj: myList){
//            String s = null;
//            Dog d = null;
//            if(obj instanceof String){
//                s = (String)obj;
//                s = s.toUpperCase();
//            System.out.println(s);
//            }
//            else if(obj instanceof Dog){
//                d = (Dog)obj;
//                System.out.println("Its a dog");
//            }
//        }
    }

}
