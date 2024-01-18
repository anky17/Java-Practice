package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<>();
		
		Set<String> set = new LinkedHashSet<>();

		set.add("delhi");
		set.add("japan");
		set.add("pokhara");
		set.add("tokyo");
		set.add("delhi");

		for (String s : set) {
			System.out.println(s);
		}
	}

}
