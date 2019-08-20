package streamsJava;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo6 {

	public static void main(String[] args) {
		List<String> people = Arrays.asList("Anushree", "Abijit", "Bishwajit", "Aamini");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);

	}

}
