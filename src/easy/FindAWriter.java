package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindAWriter {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/findAWriter.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
        	String[] inputArr = line.split("|");
        	String encodedStr = inputArr[0];
        	String[] keyArr = inputArr[1].trim().split(" ");
        	StringBuilder sbr = new StringBuilder();

        	for (int i = 0; i < keyArr.length; i++) {
				String string = keyArr[i];
				
			}
        }

	}

}
