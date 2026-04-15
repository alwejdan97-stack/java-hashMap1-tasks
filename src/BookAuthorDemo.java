import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo {
    public static void main(String[] args){
        HashMap<String, String> bookAuthor = new HashMap<>();
        bookAuthor.put("Story 1", "Author 1");
        bookAuthor.put("Story 2", "Author 2");
        bookAuthor.put("Book 1", "Author 3");
        bookAuthor.put("Book 2", "Author 4");
        bookAuthor.put("Book 3", "Author 5");
        for(Map.Entry<String, String> reuslt : bookAuthor.entrySet()){  //printing the key and value
            System.out.println("book name: " + reuslt.getKey()+ ", author: "+ reuslt.getValue());
        }
        System.out.println("the author of Story 1 is: "+ bookAuthor.get("Story 1")); // return value using key
        System.out.println("ckeck if Story 3 is exist or not: " + bookAuthor.containsKey("Story 3")); // check if avilable of not
        bookAuthor.put("Story 1", "Author 6"); // updating the author of the book
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : bookAuthor.entrySet()){
            System.out.println("book name: " + reuslt.getKey()+ ", author: "+ reuslt.getValue());
        }
        bookAuthor.remove("Book 3");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : bookAuthor.entrySet()){
            System.out.println("book name: " + reuslt.getKey()+ ", author: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ bookAuthor.size()); //display the size
    }
}
