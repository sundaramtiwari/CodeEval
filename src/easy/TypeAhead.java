package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TypeAhead {

	private static String sampleText = "Mary had a little lamb its fleece was white as snow;" +
			"And everywhere that Mary went, the lamb was sure to go." +
			"It followed her to school one day, which was against the rule;" +
			"It made the children laugh and play, to see a lamb at school." +
			"And so the teacher turned it out, but still it lingered near," +
			"And waited patiently about till Mary did appear." +
			"\"Why does the lamb love Mary so?\" the eager children cry; \"Why, " +
			"Mary loves the lamb, you know\" the teacher did reply.\"";
	
	static {
		sampleText = sampleText.replaceAll("[^\\w\\s]", " ");
		sampleText = sampleText.toLowerCase().trim().replaceAll(" +", " ");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/TypeAhead.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        NumberFormat formatter = new DecimalFormat("#0.000");
        //System.out.println(sampleText);
        while ((line = buffer.readLine()) != null) {
        	StringBuffer output = new StringBuffer();
        	line = line.trim();
        	String[] inputs = line.split(",");
        	Map<String, Integer> map = getMap(inputs[1], sampleText);
        	int inputStringCount = map.get(inputs[1]);
            Map<Integer, List<String>> frMap = getFrMap(map, inputs[1]);
            
            for(Entry<Integer, List<String>> entry : frMap.entrySet()) {
            	int frequency = entry.getKey();
            	double total = (double) frequency / inputStringCount;
            	String totalOutput = formatter.format(total);
            	
            	List<String> list = entry.getValue();
            	Collections.sort(list);
            	for (int i=0; i < list.size(); i++) {
            		if (output.length() != 0) {
            			output.append(";");
            		}
            		output.append(list.get(i));
            		output.append(",");
            		output.append(totalOutput);
            	}
            }
            if (output.length() != 0)
            	System.out.println(output.toString());
        }

	}

	private static Map<Integer, List<String>> getFrMap(
			Map<String, Integer> map, String inputText) {
		TreeMap<Integer, List<String>> frMap = new TreeMap<Integer, List<String>>();
		for(Entry<String, Integer> entry : map.entrySet()) {
			String text = entry.getKey();
			int value = entry.getValue();

			if (!inputText.equals(text)) {
				if (frMap.containsKey(value)) {
					List<String> list = frMap.get(value);
					list.add(text);
					// Collections.sort(list);
					frMap.put(value, list);
				} else {
					List<String> list = new ArrayList<String>();
					list.add(text);
					frMap.put(value, list);
				}
			}
		}
		NavigableMap<Integer, List<String>> descendingMap = frMap.descendingMap();
		return descendingMap;
	}

	private static Map<String, Integer> getMap(String input, String text) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] strarr = text.split(" ");
		int counter = 0;
		for (int i = 0; i < strarr.length; i++) {
			String str = strarr[i];
			if (str.equals(input) && strarr[i+1] != null) {
				counter++;
				if (map.containsKey(strarr[i+1])) {
					map.put(strarr[i+1], map.get(strarr[i+1]) + 1);
				} else {
					map.put(strarr[i+1], 1);
				}
			}
		}
		map.put(input, counter);
		return map;
	}

}
