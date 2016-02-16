package easy;

public class MultiplicationTables {

	public static void main(String[] args) {
		printTable();
	}

	private static void printTable() {
		for (int i=1; i<=12; i++) {
			int start = i;
			System.out.print(start);
			for (int j=2; j<=12; j++) {
				start += i;
				int length = start==0?1:(1 + (int)Math.floor(Math.log10(Math.abs(start))));
				switch (length) {
				case 1:
					System.out.print("   " + start);
					break;
				case 2:
					if (i>=10 && j==2)
						System.out.print(" " + start);
					else
						System.out.print("  " + start);
					break;
				case 3:
					System.out.print(" " + start);
					break;
				}
			}
			if (i<12)
				System.out.println();
		}
	}

}
