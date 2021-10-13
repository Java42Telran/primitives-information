import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesInformationAppl {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); //input data from the console
		while(true) {
			System.out.println("enter integer primitive type (long, int, short, char, byte) or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInformationByType(line);
		}
		System.out.println("thanks for using our application & bye");

	}

	private static void printInformationByType(String type) {
		
		switch(type) {
		case "long": printLongInfo(); break;
		case "int": printIntInfo(); break;
		case "short": printShortInfo(); break;
		case "char": printCharInfo(); break;
		case "byte": printByteInfo(); break;
		default: System.out.println("Entered type is wrong");
		}
		
		
		
	}

		private static void printByteInfo() {
			byte minValue = 1;
			byte maxValue = 1;
			int nBits = 1;
			while (minValue > 0 ) {
				minValue = (byte) (minValue * 2);
				nBits = nBits + 1;
				
			}
			maxValue = (byte) (minValue - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
			
		}

		
		

	private static void printCharInfo() {
		char minValue = 1;
		char maxValue = 1;
		int nBits = 1;
		while (minValue > 0 ) {
			minValue = (char) (minValue * 2);
			nBits = nBits + 1;
			
		}
		maxValue = (char) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void printIntInfo() {
		int minValue = 1;
		int maxValue = 1;
		int nBits = 1;
		while (minValue > 0 ) {
			minValue = (int) (minValue * 2);
			nBits = nBits + 1;
			
		}
		maxValue = minValue - 1;
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void printShortInfo() {
		short minValue = 1;
		short maxValue = 1;
		int nBits = 1;
		while (minValue > 0 ) {
			minValue = (short) (minValue * 2);
			nBits = nBits + 1;
			
		}
		maxValue = (short) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (int)minValue, (int)maxValue, nBits / 8);
		
	}

	private static void printLongInfo() {
		long minValue = 1;
		long maxValue = 1;
		int nBits = 1;
		while (minValue > 0 ) {
			minValue = (long) (minValue * 2);
			nBits = nBits + 1;
			
		}
		 maxValue = minValue - 1;
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", (long)minValue, (long)maxValue, nBits / 8);		
	}

}
