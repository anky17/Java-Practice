package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("nepal");
		list.add("JAPAN");
		list.add("india");

//		list.remove("japan");
		
		System.out.println(list.contains("JAPAN".toLowerCase()));

		for (String s : list) {
			System.out.println(s);
		}
	}

}
