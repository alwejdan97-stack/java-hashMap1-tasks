import java.util.HashMap;
import java.util.Map;

public class DepartmentManagerDemo {
    public static void main(String[] args){
        HashMap<String, String> departmentManaer = new HashMap<>();
        departmentManaer.put("Finance", "Ali");// adding key and value
        departmentManaer.put("Legal", "Ahmed");
        departmentManaer.put("Research and Development (R&D)", "Omar");
        departmentManaer.put("Marketing", "Noor");
        departmentManaer.put("Information Technology (IT)", "Sara");
        for(Map.Entry<String, String> reuslt : departmentManaer.entrySet()){  //printing the key and value
            System.out.println("department name: " + reuslt.getKey()+ ", manager name: "+ reuslt.getValue());
        }
        System.out.println("the manager of Marketing is: "+ departmentManaer.get("Marketing")); // return value using key
        System.out.println("ckeck if Research and Development (R&D) department is exist or not: " + departmentManaer.containsKey("Research and Development (R&D)")); // return true (key is exist)
        System.out.println("ckeck if Administration department is exist or not: " + departmentManaer.containsKey("Administration")); // return false (key is not exist)
        departmentManaer.put("Marketing", "Wejdan");// updating the manager of one country
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : departmentManaer.entrySet()){
            System.out.println("department name: " + reuslt.getKey()+ ", manager name: "+ reuslt.getValue());
        }
        departmentManaer.remove("Legal");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : departmentManaer.entrySet()){
            System.out.println("department name: " + reuslt.getKey()+ ", manager name: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ departmentManaer.size());
    }
}
