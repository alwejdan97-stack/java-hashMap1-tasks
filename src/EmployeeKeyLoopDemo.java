import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeKeyLoopDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeIDname = new HashMap<>();
        //System.out.println("ckeck if employeeIDname empty or not: "+ employeeIDname.isEmpty()); // check if the HashMap empty or have value
        employeeIDname.put(1, "Ahmed"); // adding keyes and value to HashMap
        employeeIDname.put(2, "Sara");
        employeeIDname.put(5, "Hoor");
        employeeIDname.put(4, "Noor");
        employeeIDname.put(7, "Muna");
        for (Map.Entry<Integer, String> result : employeeIDname.entrySet()) { // printing HashMap
            System.out.println("ID: " + result.getKey() + "," + " employee name: " + result.getValue());
        }
        System.out.println("__________________________");
        Set<Integer> id = employeeIDname.keySet(); //create set for keys
        for(Integer key :id){
            System.out.println("ID: " + key + "," + " employee name: " + employeeIDname.get(key)); // return values or employee through keys
        }
        System.out.println("__________________________");
        employeeIDname.put(3, "Wejdan"); // add other employee and display
        for(Integer key : id){
            System.out.println("ID: " + key + "," + " employee name: " + employeeIDname.get(key));
        }
    }
}
