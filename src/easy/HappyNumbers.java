package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/happyNumbers.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        Set<Integer> set = new HashSet<Integer>();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int no = Integer.valueOf(line);
            while (true) {	            
	            if (no == 1) {
	            	System.out.println(1);
	            	break;
	            } else if(set.contains(no)) {
	            	System.out.println(0);
	            	break;
	            } else {
	            	set.add(no);
	            	String str = String.valueOf(no);
	            	char[] charArray = str.toCharArray();
	            	no = 0;
	            	for (int i=0; i<charArray.length; i++) {
	            		char c = charArray[i];
	            		Integer cNo = Integer.valueOf(c+"");
	            		no += cNo*cNo;
	            	}
	            }
            }
            set.clear();
        }
	}

}
