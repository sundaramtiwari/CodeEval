package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CapitalizeWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/CapitalizeWords.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
        	String prefix = "";
            String[] strarr = line.split(" ");
            for (String str : strarr) {
            	String str1 = str.substring(0, 1);
            	System.out.print(prefix + str1.toUpperCase() + str.substring(1));
            	if (prefix == "") 
            		prefix = " ";
            }
            System.out.println();
        }

	}

}
