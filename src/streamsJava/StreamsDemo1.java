package streamsJava;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo1 {
	public static void main(String[] args) throws IOException {
		IntStream.range(1, 10).forEach(x -> System.out.print(x + " "));
		// .forEach(System.out::print();
	}
}
