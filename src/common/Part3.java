

package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author neilkenney
 */
public class Part3 {
    public static void main(String[] args) {
        
        Employee employee;
        
        Employee a = new Employee("Bill", "Smith", "111-11-1111");
        Employee b = new Employee("Marge", "Roberts", "222-22-2222");
        Employee c = new Employee("Craig", "Bush", "333-33-3333");
        Employee d = new Employee("Bill", "Smith", "111-11-1111");
        
        List<Employee> myList = new ArrayList<Employee>();
        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        
        
        System.out.println(myList);
        
        employee = myList.get(2);
        
        System.out.println(employee.toString());
        
        for(Employee e: myList){
            System.out.println(e.toString());
        }
        
        myList.set(2, a);
        
        myList.clear();
        
        
        
        

}

}