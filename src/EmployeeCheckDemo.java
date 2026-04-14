import java.util.HashMap;
import java.util.Map;

public class EmployeeCheckDemo {
    public static void main(String[] args){
        HashMap<Integer, String> employeeIDname = new HashMap<>();
        employeeIDname.put(1,"Ahmed"); // adding keyes and value to HashMap
        employeeIDname.put(2,"Sara");
        employeeIDname.put(5,"Hoor");
        employeeIDname.put(4,"Noor");
        employeeIDname.put(7,"Muna");
        for(Map.Entry<Integer,String> result : employeeIDname.entrySet()){ // printing HashMap
            System.out.println(result);
        }
        System.out.println("check if employee at key 2 is avilable or not: "+ employeeIDname.containsKey(2)); // check if the name or employee by given value is avilable or not
        System.out.println("check if employee at key 2 is avilable or not: "+ employeeIDname.containsKey(6));
        System.out.println("check if employee Sara is avilable or not: "+ employeeIDname.containsValue("Sara"));// check if specify name or employee is exist or not
        System.out.println("check if employee Wejdan is avilable or not: "+ employeeIDname.containsValue("Wejdan"));
    }
}
