import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMarksDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMark = new HashMap<>();
        studentMark.put(1, 99); // adding keyes and value to HashMap
        studentMark.put(2, 70);
        studentMark.put(4, 80);
        studentMark.put(7, 85);
        studentMark.put(9, 92);
        for (Map.Entry<Integer, Integer> result : studentMark.entrySet()) { // printing HashMap
            System.out.println("student ID: " + result.getKey() + "," + " student mark: " + result.getValue());
        }
        System.out.println("the student who have ID 1 have mark: "+ studentMark.get(1));
        System.out.println("check if students who have ID 4 is exists or not: " + studentMark.containsKey(4));
        System.out.println("displaying after updating 1 student");
        studentMark.put(1, 95); // updating student mark using id
        for (Map.Entry<Integer, Integer> result : studentMark.entrySet()) {
            System.out.println("student ID: " + result.getKey() + "," + " student mark: " + result.getValue());
        }
        System.out.println("displaying after remove 1 student");
        studentMark.remove(2); // remove student using id key
        for (Map.Entry<Integer, Integer> result : studentMark.entrySet()) {
            System.out.println("student ID: " + result.getKey() + "," + " student mark: " + result.getValue());
        }
        System.out.println("the total number of students is: " + studentMark.size());
    }
}
