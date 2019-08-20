package streamsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 * Reading a File using Streams.
 * @author Bishwajit.
 *
 */
public class StreamsDemo7 {
	
	public static void main(String[] args) throws IOException {
		Stream<String> logs = Files.lines(Paths.get("c:\\newcoLogs\\development.log"));
		logs.sorted().filter(x -> x.length() > 20).forEach(System.out::println);
		logs.close();
	}
}
