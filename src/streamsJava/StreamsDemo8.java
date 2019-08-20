package streamsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo8 {

	public static void main(String[] args) throws IOException {
		List<String> listLogs = Files.lines(Paths.get("c:\\newcoLogs\\development1.log"))
				.filter(x -> x.contains("DEBUG")).collect(Collectors.toList());
//		listLogs.forEach(System.out::println);
		listLogs.forEach(x -> System.out.println(x));
	}

}
