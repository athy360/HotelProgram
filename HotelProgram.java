import java.io.*;
import java.util.*;

public class HotelProgram {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] rooms = new String[10];

		for (int x = 0; x < rooms.length; x++) {
			rooms[x] = "empty";
		}

		while (true) {
			System.out.println(
					"__________________________________WELCOME TO HOTEL JINXX!_____________________________________");
			System.out.println(
					" |+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|Hotel Booking Options|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|+|");
			System.out.println(
					"==============================================================================================");
			System.out.println(
					"** V: To VIEW all rooms                                                                     **");
			System.out.println(
					"** A: To ADD customer to a room                                                             **");
			System.out.println(
					"** E: To Display EMPTY rooms                                                                **");
			System.out.println(
					"** D: To DELETE customer from a room                                                        **");
			System.out.println(
					"** F: FIND room from customer name                                                          **");
			System.out.println(
					"** S: STORE program array data into a plain text file                                       **");
			System.out.println(
					"** L: LOAD program data back from the file into the array                                   **");
			System.out.println(
					"** 3: Display the names of the first 3 customers who have been allocated to a room          **");
			System.out.println(
					"** O: View rooms ORDERED alphabetically by name.                                            **");
			System.out.println(
					"** Q: EXIT                                                                                  **");
			System.out.println(
					"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.print("\t\t\t\tENTER YOUR CHOICE: ");
			String select = sc.nextLine();

			if (select.equalsIgnoreCase("V")) {
				ViewAllRooms.main(rooms);
				viewAllRooms(rooms);
			} else if (select.equalsIgnoreCase("A")) {
				AddRoom.main(rooms);
				addRoom(rooms);
			} else if (select.equalsIgnoreCase("E")) {
				EmptyRooms.main(rooms);
				viewEmptyRooms(rooms);
			} else if (select.equalsIgnoreCase("D")) {
				DeleteRoom.main(rooms);
				deleteRoom(rooms);
			} else if (select.equalsIgnoreCase("F")) {
				FindRoom.main(rooms);
				findRoom(rooms);
			} else if (select.equalsIgnoreCase("S")) {
				StoreDetails.main(rooms);
				storeDetails(rooms);
			} else if (select.equalsIgnoreCase("L")) {
				Load.main(rooms);
				load(rooms);
			} else if (select.equals("3")) {
				QueueCust.main(rooms);
				queue(rooms);
			} else if (select.equalsIgnoreCase("O")) {
				CustOrder.main(rooms);
				orderAlphabet(rooms);
			} else if (select.equalsIgnoreCase("Q")) {
				System.out.println("\t\t\tThank You | Copyright \u00a9 All Rights Reserved | 2016");
				System.exit(0);
			} else {
				System.err.print("Invalid, Please type the correct option!");
			}
			System.out.println("");
			System.out.println("");
		}
	}

	private static void queue(String[] rooms) {

	}

	public static void viewAllRooms(String hotelR[]) {

	}

	public static void addRoom(String hotelR[]) {

	}

	public static void viewEmptyRooms(String hotelR[]) {

	}

	public static void deleteRoom(String hotelR[]) {

	}

	public static void findRoom(String hotelR[]) {

	}

	public static void storeDetails(String hotelR[]) {

	}

	public static void load(String hotelR[]) {

	}

	public static void orderAlphabet(String hotelR[]) {
	}
}
============================================================================================================================================
QUEUE CLASS
============================================================================================================================================

public class Queue extends HotelProgram {
	private static String[] queue = new String[10];
	private static int first = -1;
	private static int no = 0;
	private static int last = 0;

	Queue(int size) {
		queue = new String[size];

	}

	public static void main(String[] args) {

	}

	public static void addQueue(String data) {
		first++;
		if (first < 7) {
			queue[first] = data;
		} else {
			System.err.println("Queue is full!");
			queue[first - 7] = data;
		}
	}

	public static void delete(String name) {
		if (first > last) {
			queue[last] = " ";
			last++;
			no--;
			System.out.println("the data of " + queue[last] + " was removed");
		} else {
			System.out.println("SORRY :( , The queue is empty");

		}
	}

	public static void displayQueue() {
		if (first >= last) {
			System.out.println("The Queue is : ");

			for (int j = last; j < 3; j++) {
				System.out.println(queue[j]);
			}
		}

	}

}
============================================================================================================================================
public class ViewAllRooms extends HotelProgram {

	public static void main(String[] hotelR) {
		for (int x = 0; x < hotelR.length; x++) {
			if (hotelR[x].equals("empty")) {
				System.out.println("Room " + (x + 1) + " is vacant");
			} else {
				System.out.println("Room " + (x + 1) + " is occupied by " + hotelR[x]);
			}
		}

	}

}

==

public class EmptyRooms extends HotelProgram{

	public static void main(String[] hotelR) {
		for (int x = 0; x < hotelR.length; x++) {
			if (hotelR[x].equals("empty")) {
				System.out.println("Room " + (x + 1) + " is vacant");
			}
		}

	}

}

==
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Load extends HotelProgram{

	public static void main(String[] hotelR) {
		try {
			File file = new File("Jinxx Details.txt");
			Scanner sc = new Scanner(file);

			String line = sc.nextLine();

			StringTokenizer st = new StringTokenizer(line, ";");
			for (int x = 0; x < hotelR.length; x++) {
				hotelR[x] = st.nextToken();
			}
			System.out.println("Loading Successful!");
		} catch (FileNotFoundException empty) {
			System.err.print("File not Found!!");
		}
	}

}==

public class QueueCust extends HotelProgram {

	public static void main(String[] hotelR) {
		Queue.displayQueue();

	}

}==

public class CustOrder extends HotelProgram {

	public static void main(String[] hotelR) {
		String[] temp = new String[hotelR.length];
		for (int x = 0; x < hotelR.length; x++) {
			temp[x] = hotelR[x];
		}
		int y;
		boolean sort = true;
		String tempSort;

		while (sort) {
			sort = false;
			for (y = 0; y < temp.length - 1; y++) {
				if (temp[y].compareToIgnoreCase(temp[y + 1]) > 0) {
					tempSort = temp[y];
					temp[y] = temp[y + 1];
					temp[y + 1] = tempSort;
					sort = true;
				}

			}
		}
		for (int z = 0; z < temp.length; z++) {
			if (!(temp[z].equals("empty"))) {
				for (int i = 0; i < hotelR.length; i++) {
					if (temp[z].equals(hotelR[i])) {
						System.out.println("Room " + (i + 1) + " is occupied by " + temp[z]);
					}
				}
			}
		}

	}

}==

public class AddRoom extends HotelProgram {

	public static void main(String[] hotelR) {
		int roomNo = 0;
		do {
			System.out.println("Please Enter The Room Number (1-10)? ");
			roomNo = sc.nextInt();
		} while (roomNo > 11 || roomNo < 1);
		sc.nextLine();
		System.out.println("Enter name for room " + roomNo + ":");
		String roomName = sc.nextLine();

		for (String val : hotelR) {
			if (roomName.equalsIgnoreCase(val)) {
				System.err.println("Try again");
				sc.nextLine();
				return;
			}
		}
		hotelR[(roomNo - 1)] = roomName;
		Queue.addQueue(roomName);

	}

}==

public class DeleteRoom extends HotelProgram {

	public static void main(String[] hotelR) {
		System.out.println("Enter the name for the room you booked: ");
		String name = sc.next();
		boolean found = false;
		for (int x = 0; x < hotelR.length; x++) {
			if (hotelR[x].equalsIgnoreCase(name) && !(name.equalsIgnoreCase("empty"))) {
				hotelR[x] = "empty";
				System.out.println("Deletion Successful");
				found = true;
			}
		}
		if (!found) {
			System.err.println("No match(es) found!!");
		}
		sc.nextLine();
		Queue.delete(name);

	}

}==

public class FindRoom extends HotelProgram {

	public static void main(String[] hotelR) {
		System.out.println("Enter the customer name: ");
		String roomName = sc.nextLine();
		boolean found = false;
		for (int x = 0; x < hotelR.length; x++) {
			if (hotelR[x].equalsIgnoreCase(roomName) && !(roomName.equalsIgnoreCase("empty"))) {
				System.out.println(roomName + " is in room " + (x + 1));
				found = true;
			}
		}
		if (!found) {
			System.err.println("No match(es) found in the given name!");
		}

	}

}==
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class StoreDetails extends HotelProgram {

	public static void main(String[] hotelR) {
		try {
			File file = new File("Jinxx Details.txt");
			PrintWriter pw = new PrintWriter(file);

			for (String val : hotelR) {
				pw.print(val + ";");
			}
			pw.close();
			System.out.println("Details stored in a text file");
		} catch (IOException empty) {
			System.err.print("File not Found!!");
		}

	}

}

============================================================================================================================================
