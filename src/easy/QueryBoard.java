package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class QueryBoard {
	
	private static int[][] queryBoard = new int[256][256];
	
	static {
		for (int i=0; i<256; i++) {
			for (int j=0; j<256; j++) {
				queryBoard[i][j] = 0;
			}
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Sundaram/Documents/My Docs/CodeEval/QueryBoard.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	line = line.trim();
        	String[] inputs = line.split(" ");
        	switch (inputs[0]) {
        	
        	case "SetCol":
        		setCol(inputs[1], inputs[2]);
        		break;
        	
        	case "SetRow":
        		setRow(inputs[1], inputs[2]);
        		break;
        	
        	case "QueryCol":
        		queryCol(inputs[1]);
        		break;
        	
        	case "QueryRow":
        		queryRow(inputs[1]);
        		break;
        	}
        }
	}

	private static void queryRow(String rowNo) {
		int sum = 0;
		int row = Integer.parseInt(rowNo);
		for (int i=0; i<256; i++) {
			sum += queryBoard[row][i];
		}
		System.out.println(sum);
	}
	
	private static void queryCol(String colNo) {
		int sum = 0;
		int col = Integer.parseInt(colNo);
		for (int i=0; i<256; i++) {
			sum += queryBoard[i][col];
		}
		System.out.println(sum);
	}

	private static void setRow(String rowNo, String value) {
		int row = Integer.parseInt(rowNo);
		int val = Integer.parseInt(value);

		for (int i=0; i<256; i++) {
			queryBoard[row][i] = val;
		}
		
	}

	private static void setCol(String colNo, String value) {
		int col = Integer.parseInt(colNo);
		int val = Integer.parseInt(value);

		for (int i=0; i<256; i++) {
			queryBoard[i][col] = val;
		}		
	}
}
