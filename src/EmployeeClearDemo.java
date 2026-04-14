import java.util.HashMap;
import java.util.Map;

public class EmployeeClearDemo {
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
        System.out.println("the total size of employeeIDname HashMap is: "+ employeeIDname.size()); // display the size of HashMap
        employeeIDname.clear(); // remove all keys and values
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println(result);
        }
        System.out.println("the new size of employeeIDname HashMap after cleaning is: "+ employeeIDname.size());
        System.out.println("know employeeIDname HashMap is empty");
    }
}
