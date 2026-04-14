import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeIDname = new HashMap<>();
        employeeIDname.put(1, "Ahmed"); // adding keyes and value to HashMap
        employeeIDname.put(2, "Sara");
        employeeIDname.put(5, "Hoor");
        employeeIDname.put(4, "Noor");
        employeeIDname.put(7, "Muna");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println("ID: " + result.getKey() + " employee name: " + result.getValue());
        }
        System.out.println("the employee at key 4 is: " + employeeIDname.get(4));
        employeeIDname.put(4, "Wejdan");
        System.out.println("the updated employee at key 4 is: " + employeeIDname.get(4));
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println("ID: " + result.getKey() + " employee name: " + result.getValue());
        }
    }
}
