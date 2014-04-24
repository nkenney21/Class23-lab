

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
public class Part5 {
    public static void main(String[] args) {
        
        Employee employee = null;
        Map<String, Employee> employeeMap = new HashMap<String,Employee>();
        
        Employee a = new Employee("Bill", "Smith", "111-11-1111");
        Employee b = new Employee("Marge", "Roberts", "222-22-2222");
        Employee c = new Employee("Craig", "Bush", "333-33-3333");
        Employee d = new Employee("Bill", "Smith", "111-11-1111");
        
        employeeMap.put("111-11-1111", a);
        employeeMap.put("222-22-2222", b);
        employeeMap.put("333-33-3333", c);
        employeeMap.put("111-11-1111", d);
        
        
        
        
        
        
        
        System.out.println(employeeMap.get("111-11-1111").toString());
        
        Set<String> keys = employeeMap.keySet();
        for(String key : keys) {
            Employee found = employeeMap.get(key);
            System.out.println(found);
        }
        
        
    }

}
