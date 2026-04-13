package sarzona;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int[][] hotel = new int[7][5];
        int choice;

        do {
            String input = JOptionPane.showInputDialog(
                    "=== HOTEL RESERVATION SYSTEM ===\n"
                            + "1. View Rooms\n"
                            + "2. Check In\n"
                            + "3. Check Out\n"
                            + "4. Exit\n"
                            + "Enter choice:");

            if (input == null) break; // cancel button
            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    viewRooms(hotel);
                    break;
                case 2:
                    checkIn(hotel);
                    break;
                case 3:
                    checkOut(hotel);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Exiting System. Goodbye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
            }

        } while (choice != 4);
    }

    public static void viewRooms(int[][] hotel) {
        String display = "--- Current Room Status ---\n";

        // REVERSED FLOOR DISPLAY (7 to 1)
        for (int i = hotel.length - 1; i >= 0; i--) {
            display += "Floor " + (i + 1) + ": ";
            for (int j = 0; j < hotel[i].length; j++) {
                display += "[" + hotel[i][j] + "] ";
            }
            display += "\n";
        }

        JOptionPane.showMessageDialog(null, display);
    }

    public static void checkIn(int[][] hotel) {
        int floor = Integer.parseInt(
                JOptionPane.showInputDialog("Enter floor (1-7):")) - 1;

        int room = Integer.parseInt(
                JOptionPane.showInputDialog("Enter room (1-5):")) - 1;

        if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
            if (hotel[floor][room] == 0) {
                hotel[floor][room] = 1;
                JOptionPane.showMessageDialog(null, "Check-in successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Room already occupied!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid floor or room number!");
        }
    }

    public static void checkOut(int[][] hotel) {
        int floor = Integer.parseInt(
                JOptionPane.showInputDialog("Enter floor (1-7):")) - 1;

        int room = Integer.parseInt(
                JOptionPane.showInputDialog("Enter room (1-5):")) - 1;

        if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
            if (hotel[floor][room] == 1) {
                hotel[floor][room] = 0;
                JOptionPane.showMessageDialog(null, "Check-out successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Room already empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid floor or room number!");
        }
    }
}