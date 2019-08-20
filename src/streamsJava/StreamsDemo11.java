package streamsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Bishwajit.
 *
 */
public class StreamsDemo11 {
	
	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files.lines(Paths.get("C:\\newCoLogs\\SampleCsv.txt"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		map = rows.map(x -> x.split(",")).filter(x -> x.length == 4).filter(x -> Integer.parseInt(x[1]) > 30)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows.close();
		for (String k : map.keySet())
			System.out.println(k + " " + map.get(k));
	}
}
