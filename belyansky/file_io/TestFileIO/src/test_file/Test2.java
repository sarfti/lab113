package test_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {

	public void testWrite() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("employee.txt");
		out.println("Sample 1");
		out.println("Sample 2");
		out.close();
	}

	public void testRead() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("employee.txt"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}

	}

}
