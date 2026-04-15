import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String > studentID = new HashMap<>();
        studentID.put(1, "Ahmed"); // adding keyes and value to HashMap
        studentID.put(2, "Ali");
        studentID.put(4, "Hoor");
        studentID.put(7, "Sara");
        studentID.put(9, "Omar");
        for (Map.Entry<Integer, String> result : studentID.entrySet()) { // printing HashMap
            System.out.println("student ID: " + result.getKey() + "," + " student name: " + result.getValue());
        }
        System.out.println("the student who have ID 1 is: "+ studentID.get(1));
        System.out.println("check if students who have ID 4 is exists or not: " + studentID.containsKey(4));// return true (it's exist)
        System.out.println("check if students who have ID 4 is exists or not: " + studentID.containsKey(3));// return false (it's not exist)
        System.out.println("displaying after updating 1 student");
        studentID.put(7, "Wejdan"); // updating student mark using id
        for (Map.Entry<Integer, String> result : studentID.entrySet()) {
            System.out.println("student ID: " + result.getKey() + "," + " student name: " + result.getValue());
        }
        System.out.println("displaying after remove 1 student");
        studentID.remove(2); // remove student using id key
        for (Map.Entry<Integer, String> result : studentID.entrySet()) {
            System.out.println("student ID: " + result.getKey() + "," + " student name: " + result.getValue());
        }
        System.out.println("the total number of students is: " + studentID.size());
    }
}
