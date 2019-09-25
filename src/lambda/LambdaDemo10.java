package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bishwajit.
 *
 */
public class LambdaDemo10 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(32);
		list.add(45);
		list.add(63);

		// ForEach using Lambda Expression.
		System.out.println("-----------ForEach using Lambda Expression.-----------");
		list.forEach(i -> System.out.println(i + " "));

		// ForEach using Method Reference.
		System.out.println("-----------ForEach using Method Reference.-----------");
		list.forEach(System.out::println);

		// ForEachOrdered Lambda Expression.
		System.out.println("-----------ForEachOrdered Lambda Expression.-----------");
		list.stream().forEachOrdered(i -> System.out.println(i + " "));

		// ForEachOrdered Method Reference.
		System.out.println("-----------ForEachOrdered using Method Reference.-----------");
		list.stream().forEachOrdered(System.out::println);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 23);
		map.put("B", 32);
		map.put("C", 45);
		map.put("D", 63);

		// Map using ForEach
		System.out.println("---------Map using ForEach------------");
		map.forEach((k, v) -> System.out.println("\t" + k + "\t" + v));
	}

}
