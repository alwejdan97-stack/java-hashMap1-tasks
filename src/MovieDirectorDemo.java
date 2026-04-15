import java.util.HashMap;
import java.util.Map;

public class MovieDirectorDemo {
    public static void main(String[] args){
        HashMap<String, String> movieDirector = new HashMap<>();
        movieDirector.put("Frozen", "Ahmed");//adding keys and values
        movieDirector.put("The Avengers", "Ali");
        movieDirector.put("Titanic", "Hoor");
        movieDirector.put("Jurassic Park", "Noor");
        movieDirector.put("The Dark Knight", "Sali");

        for(Map.Entry<String, String> reuslt : movieDirector.entrySet()){  //printing the key and value
            System.out.println("movie name: " + reuslt.getKey()+ ", director name: "+ reuslt.getValue());
        }
        System.out.println("the director of Frozen is: "+ movieDirector.get("Frozen")); // return value using key
        System.out.println("ckeck if director of Jurassic Park movie is exist or not: " + movieDirector.containsKey("Jurassic Park")); // check if avilable of not(return ture)
        System.out.println("ckeck if director of Interstellar movie is exist or not: " + movieDirector.containsKey("Interstellar")); // return false because it's not exist
        movieDirector.put("The Dark Knight", "Christopher"); // updating the trainer
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : movieDirector.entrySet()){
            System.out.println("movie name: " + reuslt.getKey()+ ", director name: "+ reuslt.getValue());
        }
        movieDirector.remove("Jurassic Park");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : movieDirector.entrySet()){
            System.out.println("movie name: " + reuslt.getKey()+ ", director name: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ movieDirector.size()); //display the size
    }
}
