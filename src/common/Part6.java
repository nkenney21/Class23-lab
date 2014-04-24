

package common;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author neilkenney
 */
public class Part6 {
    public static void main(String[] args) {
        Employee employee = null;
        Map<String, Employee> employeeMap = new TreeMap<String,Employee>();
        
        Employee a = new Employee("Bill", "Smith", "111-11-1111");
        Employee b = new Employee("Marge", "Roberts", "222-22-2222");
        Employee c = new Employee("Craig", "Bush", "333-33-3333");
        Employee d = new Employee("Bill", "Smith", "111-11-1111");
        
        employeeMap.put("111-11-1111", a);
        employeeMap.put("222-22-2222", b);
        employeeMap.put("333-33-3333", c);
        employeeMap.put("111-11-1111", d);
    }

}
