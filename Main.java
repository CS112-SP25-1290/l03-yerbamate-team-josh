import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;

		do {
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();

			switch (choice) {
				case 1: // Tea
					System.out.print("Enter name      : ");
					name = keyboard.next();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
					count++;
					break;
				case 2:
					System.out.print("Enter name      : ");
					name = keyboard.next();
					System.out.print("Enter ounces    : ");
					ounces = keyboard.nextInt();
					System.out.print("Enter price     $ ");
					price = keyboard.nextDouble();
					System.out.print("Enter brew temperature (in Celsius): ");
					brewTemp = keyboard.nextInt();

					// Create a Tea, put into array
					inventory[count] = new YerbaMate(name, ounces, price, brewTemp, 0);

					System.out.println("Your Yerba Mate order has been added: " + inventory[count]);
					count++;
					break;
				case 3:
					// print array
					for (CaffeinatedBeverage c : inventory) {
						if (c == null) {
							break;
						}
						System.out.println(c.toString());
					}

					System.out.println("Most expensive Yerba Mate: " + findHighestPricedYerbaMate(inventory));
					System.out.println("Average cost: " + findAveragePrice(inventory));
			}

		} while (choice != 3);
	}

	public static double findAveragePrice(CaffeinatedBeverage[] inventory) {
		double average = 0.0;
		int count = 0;

		for (CaffeinatedBeverage c : inventory) {
			if (c == null) {
				break;
			}

			count++;
			average += c.getPrice();
		}
		return average / count;
	}
	
	public static YerbaMate findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory) {
		YerbaMate ym = new YerbaMate();
		double price = 0.0;
		for (CaffeinatedBeverage c : inventory) {
			if (c == null) {
				break;
			}
			if (c instanceof YerbaMate && c.getPrice() > price) {
				price = c.getPrice();
				ym = (YerbaMate) c;
			}
		}

		return ym;
	}
}