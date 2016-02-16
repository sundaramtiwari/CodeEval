package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIntersection {

	public static void main (String[] args) throws IOException {
        File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/setIntersection.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] inputArr = line.split(";");
            String set1Str = inputArr[0];
            String set2Str = inputArr[1];
            String[] set1Elements = set1Str.split(",");
            String[] set2Elements = set2Str.split(",");
            Set<String> set1 = new TreeSet<String>();
            for (int i=0; i<set1Elements.length; i++)
            	set1.add(set1Elements[i]);
            Set<String> set2 = new TreeSet<String>();
            for (int i=0; i<set2Elements.length; i++)
            	set2.add(set2Elements[i]);
            set1.retainAll(set2);
            Iterator itr = set1.iterator();
            String prefix = "";
            while (itr.hasNext()) {
            	System.out.print(prefix + itr.next());
            	prefix = ",";
            }
            System.out.println();
        }
    }
}
