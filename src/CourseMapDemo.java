import java.util.HashMap;
import java.util.Map;

public class CourseMapDemo {
    public static void main(String[] args){
        HashMap<String, String> courseID = new HashMap<>();
        courseID.put("JA-1","Java");//adding keys and values
        courseID.put("Py-2","Python");
        courseID.put("Cc-3","C++");
        courseID.put("WEB-1", "Web Design");
        courseID.put("WEB-2","Web Development");

        for(Map.Entry<String, String> reuslt : courseID.entrySet()){  //printing the key and value
            System.out.println("course ID: " + reuslt.getKey()+ ", course name: "+ reuslt.getValue());
        }
        System.out.println("the course name of JA-1 is: "+ courseID.get("JA-1")); // return value using key
        System.out.println("ckeck if course of Cc-3 is exist or not: " + courseID.containsKey("Cc-3")); // return true (it's exist)
        System.out.println("ckeck if course of WEB-3 is exist or not: " + courseID.containsKey("WEB-3")); // return false (it's not exist)
        courseID.put("Cc-3","C#"); // updating the trainer
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : courseID.entrySet()){
            System.out.println("course ID: " + reuslt.getKey()+ ", course name: "+ reuslt.getValue());
        }
        courseID.remove("Py-2");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : courseID.entrySet()){
            System.out.println("course name: " + reuslt.getKey()+ ", trainer name: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ courseID.size()); //display the size
    }
}
