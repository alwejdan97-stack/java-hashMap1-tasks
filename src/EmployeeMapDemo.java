import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeIDname = new HashMap<>();
        employeeIDname.put(1, "Ahmed"); // adding keyes and value to HashMap
        employeeIDname.put(2, "Sara");
        employeeIDname.put(5, "Hoor");
        employeeIDname.put(4, "Noor");
        employeeIDname.put(7, "Muna");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println("ID: " + result.getKey() + "," + " employee name: " + result.getValue());
        }
        System.out.println("employee of ID 4 is: "+ employeeIDname.get(4));
        System.out.println("check if employee of ID 2 is exist or not: " + employeeIDname.containsKey(7)); // return ture, it's exist
        System.out.println("check if employee of ID 3 is exist or not: " + employeeIDname.containsKey(3)); // return ture, it's not exist
        employeeIDname.put(4, "Wejdan"); // updating name of key
        System.out.println("displaying after updating");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) {
            System.out.println("ID: " + result.getKey() + "," + " employee name: " + result.getValue());
        }
        employeeIDname.remove(2);
        System.out.println("displaying sfter removing one employee");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) {
            System.out.println("ID: " + result.getKey() + "," + " employee name: " + result.getValue());
        }
        System.out.println("the size of HashSet is: "+ employeeIDname.size());
    }
}
