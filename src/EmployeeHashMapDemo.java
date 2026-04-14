import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
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
        System.out.println("the name at key 2 is: "+ employeeIDname.get(2)); // retrive employee name
        System.out.println("the name at key 4 is: "+ employeeIDname.get(4));
    }
}
