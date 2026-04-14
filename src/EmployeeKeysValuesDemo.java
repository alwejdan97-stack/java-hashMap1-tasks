import java.util.HashMap;
import java.util.Map;

public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeIDname = new HashMap<>();
        employeeIDname.put(1, "Ahmed"); // adding keyes and value to HashMap
        employeeIDname.put(2, "Sara");
        employeeIDname.put(5, "Hoor");
        employeeIDname.put(4, "Noor");
        employeeIDname.put(7, "Muna");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }
        System.out.println("the id list of employees is: "+ employeeIDname.keySet()); // display all ID (keys) of employees
        System.out.println("the list of employees is: "+ employeeIDname.values()); // display all employees (values)
        employeeIDname.put(4, "Wejdan");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }
    }
}
