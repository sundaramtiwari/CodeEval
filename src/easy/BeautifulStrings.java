package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BeautifulStrings {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/beautifulString.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
            for(int i = 0; i < line.length(); i++){
               char c = line.charAt(i);
               Integer val = map.get(new Character(c));
               if(val != null){
                 map.put(c, new Integer(val + 1));
               }else{
                 map.put(c,1);
               }
            }
        }

	}

}

class ValueComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg1-arg0;
	}
	
}
