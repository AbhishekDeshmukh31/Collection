package com.client;

import java.util.Scanner;

import com.controller.PlayerController;

public class Test {

	public static void main(String[] args) {
		PlayerController controller = new PlayerController();
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------------");

		do {
			System.out.println(" ** Welcome to IPL website ** ");
			System.out.println();
			System.out.println(" **** IPL Player Management **** ");
			System.out.println();
			System.out.println("Enter 1 to view all Players from Map");
			System.out.println("Enter 2 to view batsman by year entered");
			System.out.println("Enter 3 to view Bowlers by year entered");
			System.out.println("Enter 4 to view Player by name");
			System.out.println("Enter 5 to view All-Rounders from Map");
			System.out.println("Enter 6 to view Batsman from all year");
			System.out.println("Enter 7 to stop ");
			System.out.println();
			System.out.println("Please Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:

				System.out.println("All Players from Map are : ");
				controller.getplayercontroller();
				System.out.println("-------------------------------");
				break;

			case 2:
				System.out.println("Batsman from year " + 2022 + " are : ");
				controller.getbatsmancontroller(2022);
				System.out.println("-------------------------------");
				break;

			case 3:
				System.out.println("Bowlers from year :" + 2023);
				controller.getbowlercontroller(2023);
				System.out.println("-------------------------------");
				break;

			case 4:
				System.out.println("Player yearwise :");
				controller.getplayernamecontroller("V.Kohli");
				System.out.println("-------------------------------");
				break;

			case 5:
				System.out.println("Allrounder from map :");
				controller.getallroundercontroller(50, 12);
				System.out.println("-------------------------------");
				break;

			case 6:
				System.out.println("Best Batsmen from map :");
				controller.getallbatsmancontroller(500);
				System.out.println("-------------------------------");
				break;

			case 7:
				System.out.println("Thank-you for using our Terminal.");
				break;

			default:
				System.out.println("Invalid choice. Try Again !");

			}
			if (choice == 8) {
				break;
			}

		} while (true);

		scanner.close();
	}

}
