

package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author neilkenney
 */
public class part2 {
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
        
        
        System.out.println(myList);
        
        employee = (Employee) myList.get(2);
        
        System.out.println(employee.toString());
        
        for(int x = 0; x < myList.size(); x++){
            System.out.println(myList.get(x).toString());
        }
        
        myList.set(2, a);
        
        myList.clear();
        
        
        
        

}
}