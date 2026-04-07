package sarzona;

import java.util.Scanner;

public class Sarzonas {

	public static void main(String[] args) {

		int[][] hotel = new int[7][5];

		Scanner deb = new Scanner(System.in);

		int choice;

		do {

			System.out.println("=== HOTEL RESERVATION SYSTEM ===\r\n"
					+ "1. View Rooms\r\n"
					+ "2. Check In\r\n"
					+ "3. Check Out\r\n"
					+ "4. Exit\r\n"
					+ "Enter choice: ");
			choice = deb.nextInt();
			switch (choice) {
			case 1:
				viewRooms(hotel);
				break;
			case 2:
				checkIn(hotel, deb);
				break;
			case 3:
				checkOut(hotel, deb);
				break;
			case 4:
				System.out.println("Exiting System. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 4);
	}
	public static void viewRooms(int[][] hotel) {
		System.out.println("\n--- Current Room Status ---");
		for (int i= 0; i < hotel.length; i++) {
			System.out.print("Floor " + (i + 1) + ": ");
			for (int j = 0; j < hotel[i].length; j++) {
				System.out.print("[" + hotel[i][j] + "] ");
			}
			System.out.println();
			}
		}
	public static void checkIn(int[][] hotel, Scanner sc) {
	System.out.print("Enter floor (1-7): ");
		int floor = sc.nextInt() - 1;
		System.out.print("Enter room (1-5): ");
		int room = sc.nextInt() - 1;
		if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
			if (hotel[floor][room] == 0) {
				hotel[floor][room] = 1;
				System.out.println("Check-in successful!");
			} else {
				System.out.println("Room already occupied!");
			}
		} else {
			System.out.println("Invalid floor or room number!");
		}
	}
	public static void checkOut(int[][] hotel, Scanner sc) {
		System.out.print("Enter floor (1-7): ");
		int floor = sc.nextInt() - 1;
		System.out.print("Enter room (1-5): ");
		int room = sc.nextInt() - 1;
		if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
			if (hotel[floor][room] == 1) {
				hotel[floor][room] = 0;
				System.out.println("Check-out successful!");
			} else {
				System.out.println("Room already empty!");
			}
		} else {
			System.out.println("Invalid floor or room number!");
		}
	}
}