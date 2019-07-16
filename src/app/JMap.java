package app;

import java.util.HashMap;
import java.util.Map;

public class JMap {

	private Map<Integer, String> map1 = new HashMap<>();
	
	public void addString(int a, String input) {
		this.map1.put(a, input);
		
		System.out.println(map1.get(a) + " has been successfully added to the map");
	}
	
	public String getStringFromMap(int a) {
		return this.map1.get(a);
	}
	
}
