import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo {
    public static void main(String[] args){
        HashMap<String, String> countryCapital = new HashMap<>();
        countryCapital.put("Oman", "Muscat");// adding key and value
        countryCapital.put("Kuwait", "Kuwait");
        countryCapital.put("UAE", "Dubai");
        countryCapital.put("KSA", "Riyad");
        countryCapital.put("Qatar", "Douha");
        for(Map.Entry<String, String> reuslt : countryCapital.entrySet()){  //printing the key and value
            System.out.println("country name: " + reuslt.getKey()+ ", country capital: "+ reuslt.getValue());
        }
        System.out.println("the capital of Oman is: "+ countryCapital.get("Oman")); // return value using key
        System.out.println("ckeck if Bahrain is exist or not: " + countryCapital.containsKey("Bahrain"));
        countryCapital.put("KSA", "Mekka"); // updating the capital of one country
        System.out.println("displaying after updating");
        for(Map.Entry<String, String> reuslt : countryCapital.entrySet()){
            System.out.println("country name: " + reuslt.getKey()+ ", country capital: "+ reuslt.getValue());
        }
        countryCapital.remove("UAE");
        System.out.println("displaying sfter removing");
        for(Map.Entry<String, String> reuslt : countryCapital.entrySet()){
            System.out.println("country name: " + reuslt.getKey()+ ", country capital: "+ reuslt.getValue());
        }
        System.out.println("the size of the HashSet is: "+ countryCapital.size());
    }
}
