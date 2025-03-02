import java.util.HashMap;

public class Understanding_hashMap_1 {
  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer,Integer,Double> people = new HashMap<String, Integer,Integer,Double>();


    // Add keys and values (Name, Age)
    people.put("John", 32 ,85,876.55);
    people.put("Steve", 30 ,83 ,876.66);
    people.put("Angie", 33 ,81 ,876.77);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}

// Conclision===="hashMap me sirf do hi arguments aate hai".