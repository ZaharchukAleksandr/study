
import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		System.out.println("¬ведите число");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		System.out.println(line);
	
		

	}

}
