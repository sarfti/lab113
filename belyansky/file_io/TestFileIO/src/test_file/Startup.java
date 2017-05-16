package test_file;

import java.io.IOException;

public class Startup {

	public static void main(String[] args) {
		Test2 test2 = new Test2();
	
		try {
			// test2.testWrite();
			test2.testRead();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("Sample 1\n");
			fw.write("Sample 2\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 */
}
