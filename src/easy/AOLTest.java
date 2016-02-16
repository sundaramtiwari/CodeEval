package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AOLTest {

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>();
		prices.add(new Integer(1));
		prices.add(new Integer(2));
		Iterator<Integer> i  = prices.iterator();
		while (i.hasNext()) {
			Integer j = i.next();
			System.out.println(j);
		}
	}
	
	
}
