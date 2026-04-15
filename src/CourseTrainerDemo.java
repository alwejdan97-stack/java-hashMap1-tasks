import java.util.HashMap;
import java.util.Map;

public class CourseTrainerDemo {
    public static void main(String[] args){
        HashMap<String, String> courseTrainer = new HashMap<>();
        courseTrainer.put("Java", "Ahmed");//adding keys and values
        courseTrainer.put("Python", "Ali");
        courseTrainer.put("C++", "Hoor");
        courseTrainer.put("Web Design", "Noor");
        courseTrainer.put("Web Development", "Sali");

        for(Map.Entry<String, String> reuslt : courseTrainer.entrySet()){  //printing the key and value
            System.out.println("course name: " + reuslt.getKey()+ ", trainer name: "+ reuslt.getValue());
        }
        System.out.println("the trainer of Java is: "+ courseTrainer.get("Java")); // return value using key
        System.out.println("ckeck if trainer of Web Design course is exist or not: " + courseTrainer.containsKey("Web Design")); // check if avilable of not
        courseTrainer.put("Web Design", "Omar"); // updating the trainer
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : courseTrainer.entrySet()){
            System.out.println("course name: " + reuslt.getKey()+ ", trainer name: "+ reuslt.getValue());
        }
        courseTrainer.remove("Web Design");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : courseTrainer.entrySet()){
            System.out.println("course name: " + reuslt.getKey()+ ", trainer name: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ courseTrainer.size()); //display the size
    }
}
