package javaCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("nepal");
		list.add("JAPAN");
		list.add("india");

		System.out.println(list.contains("JAPAN".toLowerCase()));

		for (String s : list) {
			System.out.println(s);
		}
	}

}
