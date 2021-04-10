import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		// HASHMAP IS NOT SYNCHRONISED.
		Map<String, String> map = new HashMap<>();
		
		map.put("num", "234");
		map.put("num1", "233");
		map.put("num2", "235");
		map.put("num3", "232");
		map.put("num", "231");
		
		System.out.println(map.get("num3"));
		
		// To Loop through Map
		Set<String> keys = map.keySet();
		
		
		for (String key:keys) {
			System.out.println(map.get(key));
		}
		
		
		// HASHTABLE IS SYNCHRONISED AND THREADSAFE.
		
		Map<String,String> map1 = new Hashtable<>();
		
		map1.put("name", "Gaurav");
		map1.put("age","36");
		map1.put("religion", "Hindu");
		
		System.out.println(map1.get("age"));
		
		Set<String> keys2 = map1.keySet();
		
		for(String key: keys2) {
			System.out.println(map1.get(key));
		}
	}
	

}
