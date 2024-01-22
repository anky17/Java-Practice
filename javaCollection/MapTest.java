package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		
		// subject - marks
		Map<String, Integer> map = new HashMap<>();
		
		map.put("nepali", 80);
		map.put("computer", 90);
		map.put("science", 86);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
	}

}
