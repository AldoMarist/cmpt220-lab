
import java.util.Scanner;

public class PointInCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point to see if it is in the circle. Enter the x and then enter the y value");

		double x = input.nextDouble();
		double y = input.nextDouble();

		double distance = Math.pow(x * x + y * y, 0.5);

		if (distance <= 10) {
			System.out.print("Point (" + x + ", " + y + ")  is in the circle");
		} else {
			System.out.print("Point (" + x + ", " + y + ")  is not in the circle");
		}

		input.close();
	}

}
