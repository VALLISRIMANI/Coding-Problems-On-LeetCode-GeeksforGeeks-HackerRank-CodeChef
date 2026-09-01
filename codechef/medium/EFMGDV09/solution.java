import java.util.HashMap;

public class CountryCapital {

    public static void main(String[] args) {
        // 1. Create a HashMap called countryCapitals
        HashMap<String, String> countryCapitals = new HashMap<>();
        
        // 2. Add following four entries to the HashMap given as key, value pairs 
        // "USA", "Washington D.C." 
        countryCapitals.put("USA", "Washington D.C.");
        // "France", "Paris"
        countryCapitals.put("France", "Paris");
        // "Japan", "Tokyo"
        countryCapitals.put("Japan", "Tokyo");
        // "India", "New Delhi"
        countryCapitals.put("India", "New Delhi");
    
        
        // 3. Retrieve the capital of France and print it
        String capitalOfFrance = countryCapitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);
        
        // 4. check capital for Germany if it's null then run following print statement 
        if (!countryCapitals.containsKey("Germany")) System.out.println("Not found");
        
        

        // 5. Remove France from the HashMap
        countryCapitals.remove("France");
        
        // 6. Check if capital of France exists or not
        if (countryCapitals.containsKey("France")) {
             System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
}