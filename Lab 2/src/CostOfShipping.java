
import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of your package to calculate its cost");

		double weight = input.nextDouble();

		if (weight > 0 && weight <= 2) {
			System.out.print("your cost is $2.50");
		}

		else if (weight <= 4)
			System.out.print("your cost is $4.50");

		else if (weight <= 10)
			System.out.print("your cost is $7.50");

		else if (weight <= 20)
			System.out.print("your cost is $10.50");
		input.close();
	}

}
