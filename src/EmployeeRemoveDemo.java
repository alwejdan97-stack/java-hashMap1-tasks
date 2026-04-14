import java.util.HashMap;
import java.util.Map;

public class EmployeeRemoveDemo {
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
        employeeIDname.remove(4); // remove employee at key 4
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }
        employeeIDname.remove(2);
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }
        employeeIDname.remove(3); // remove employee at key 3 but there is no change
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }

    }
}
