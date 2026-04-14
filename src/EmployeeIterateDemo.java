import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {
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
        employeeIDname.put(4, "Wejdan");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println("ID: " + result.getKey() + " employee name: " + result.getValue());
        }
    }
}
