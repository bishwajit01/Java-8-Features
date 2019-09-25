package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo5 {

	public static void main(String[] args) {
		List<Person> listPerson = Arrays.asList(new Person("Anurupa", 28),
												new Person("Anupama", 32),
												new Person("Anuradha", 39),
												new Person("Anushree", 26),
												new Person("Bishwajit", 28));

		// Sorting using comparator.
		Collections.sort(listPerson, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		// Displaying the details of Person.
		System.out.println("Person Details");
		System.out.println("---------------------------");
		displayPerson(listPerson);

		// Name Starts with 'B'
		System.out.println("\nNames which starts with B");
		System.out.println("----------------------------");
		printConditionally(listPerson, p -> p.getName().startsWith("B"));

	}

	private static void displayPerson(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}

	private static void printConditionally(List<Person> listPerson, Conditionally conditionally) {
		for (Person p : listPerson) {
			if (conditionally.test(p)) {
				System.out.println(p);
			}
		}
	}
}

interface Conditionally {
	boolean test(Person p);
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name :: " + getName() + "  \tAge :" + getAge();
	}

}