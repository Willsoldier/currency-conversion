import java.util.Scanner;

public class ConvertV3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How?");
		
		float dollar = in.nextFloat();
		Currency_Conversion convert = new Currency_Conversion(dollar);
		
		if (dollar <= 0f) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("You put in $" + dollar + ". Options:\n"
					+ "  1. Euro conversion\n"
					+ "  2. Peso conversion\n"
					+ "  3. Yen conversion\n"
					+ "  4. All conversions\n"
					+ "Type a number (1 - 4) followed by the enter key");
						
						byte option = in.nextByte();
						
						if (option == 1) {
							System.out.println(convert.getEuro());
							
						} else if (option == 2) {
							System.out.println(convert.getPeso());
							
						} else if (option == 3) {
							System.out.println(convert.getYen());
							
						} else if (option == 4) {
							System.out.println(convert.getEuro());
							System.out.println(convert.getPeso());
							System.out.println(convert.getYen());
							
						} else {
							System.out.println("Incorrect menu choice, try typing something else"); 
						} 
		}
	}
}