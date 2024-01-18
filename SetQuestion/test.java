package SetQuestion;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class test {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Dog dogg = new Dog();

		dog.setColor("blue");
		dog.setGender("male");
		dog.setName("Luffy");

		dogg.setColor("blue");
		dogg.setGender("male");
		dogg.setName("Luffy");

		Set<Dog> set = new LinkedHashSet<>();

		set.add(dog);
		set.add(dogg);

		for (Dog get : set) {
			System.out.println(get);
		}

	}

}
