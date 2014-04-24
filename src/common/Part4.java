

package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author neilkenney
 */
public class Part4 {
    public static void main(String[] args) {
        
        Employee employee;
        
        
        Employee a = new Employee("Bill", "Smith", "111-11-1111");
        Employee b = new Employee("Marge", "Roberts", "222-22-2222");
        Employee c = new Employee("Craig", "Bush", "333-33-3333");
        Employee d = new Employee("Bill", "Smith", "111-11-1111");
        
        List myList = new ArrayList();
        myList.add(a);
        myList.add(b);
        myList.add(c);
        myList.add(d);
        
        Set<Employee> employeeSet = new HashSet<Employee>(myList);
        myList = new ArrayList(employeeSet);
        
        for(Object obj : myList) {
            
            System.out.println(obj.toString());
        }
    }

}
