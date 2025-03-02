import java.util.HashMap;
public class Understanding_hashMap 
{
  public static void main(String[] args) 
  {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    System.out.println("Now experimenting");
	String s=capitalCities.get("Germany");
	System.out.println(s);
	String y=capitalCities.get("Berlin");
	System.out.println(y);
	System.out.println(capitalCities.get(2));
  }
}

