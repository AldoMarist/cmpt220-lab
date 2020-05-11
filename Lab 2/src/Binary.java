
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a four digit binary string");

		int number = input.nextInt();

		int binary = number;
		int decimal = 0;
		int p = 0;

		while (number != 0) {
			decimal += ((number % 10) * Math.pow(2, p));
			number = number / 10;
			p++;
		}
		System.out.print("The decimal number for " + binary + " is " + decimal);

		input.close();
	}

}
