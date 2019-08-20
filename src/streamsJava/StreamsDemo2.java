package streamsJava;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo2 {
	public static void main(String[] args) throws IOException {
		IntStream.range(1, 10).skip(3).forEach(System.out::println);
	}
}
