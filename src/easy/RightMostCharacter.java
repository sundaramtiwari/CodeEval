package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightMostCharacter {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/rightMSChar.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] inputArr = line.split(",");
            System.out.println(inputArr[0].lastIndexOf(inputArr[1]));
        }
	}

}
