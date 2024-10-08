package com.client;

import com.controller.PlayerController;

public class PlayerClient {

	public static void main(String[] args) {

		PlayerController controller = new PlayerController();
		System.out.println("-----------------------------------");
		System.out.println("All Players from Map are : ");
		controller.getplayercontroller();

		System.out.println("-----------------------------------");
		System.out.println("Batsman from year " + 2022 + " are : ");
		controller.getbatsmancontroller(2022);

		System.out.println("-----------------------------------");
		System.out.println("Bowlers from year :" + 2023);
		controller.getbowlercontroller(2023);

		System.out.println("-----------------------------------");
		System.out.println("Player yearwise :");
		controller.getplayernamecontroller("V.Kohli");

		System.out.println("-----------------------------------");
		System.out.println("Allrounder from map :");
		controller.getallroundercontroller(50, 12);

		System.out.println("-----------------------------------");
		System.out.println("Best Batsmen from map :");
		controller.getallbatsmancontroller(500);

		System.out.println("-----------------------------------");

	}
}
