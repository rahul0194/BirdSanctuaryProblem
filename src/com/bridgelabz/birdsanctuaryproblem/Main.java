package com.bridgelabz.birdsanctuaryproblem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Sanctuary ");
		UserInterface userInterface = new UserInterface();
		int userOption = userInterface.showMainMenu();
	
		Main main = new Main();
		main.handleUserSelection(userOption);
		
		
//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "o001";
//		Flemingo flemingo = new Flemingo();
//		flemingo.birdId = "f001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "p001";
//		Parrot parrot2 = new Parrot();
//		parrot2.birdId = "p001";
//		Penguine penguine = new Penguine();
//		penguine.birdId = "pn001";
//		
//		
//
//		birdRepo.addBirds(duck);
//		birdRepo.addBirds(flemingo);
//		birdRepo.addBirds(ostrich);
//		birdRepo.addBirds(penguine);
//		birdRepo.addBirds(parrot);
//		birdRepo.addBirds(parrot);
//		
//
//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdRepo.getBirdList());
//
//		System.out.println("Printing Birds after removal");
//
//		// birdRepo.removeBirds(duck);
//		// birdRepo.removeBirds(flemingo);
//		// birdRepo.removeBirds(ostrich);
//		// birdRepo.removeBirds(penguine);
//		// birdRepo.removeBirds(parrot);
//
//		// userInterface.print(birdRepo.getBirdList());
//
//		userInterface.printAllFlyableBrids(birdRepo.getBirdList());
		
	}
	public void addBird() {
		BirdRepository birdRepo = new BirdRepository();
		
		Duck duck = new Duck();
		duck.birdId = "d001";
		Ostrich ostrich = new Ostrich();
		ostrich.birdId = "o001";
		Flemingo flemingo = new Flemingo();
		flemingo.birdId = "f001";
		Parrot parrot = new Parrot();
		parrot.birdId = "p001";
		Parrot parrot2 = new Parrot();
		parrot2.birdId = "p001";
		Penguine penguine = new Penguine();
		penguine.birdId = "pn001";
		
		birdRepo.addBirds(duck);
		birdRepo.addBirds(flemingo);
		birdRepo.addBirds(ostrich);
		birdRepo.addBirds(penguine);
		birdRepo.addBirds(parrot);
		birdRepo.addBirds(parrot);
		
	}
	
	public void handleUserSelection(int userOption) {
		BirdRepository birdRepo = new BirdRepository();
		switch(userOption) {
		case 1:
			addBird();
		case 2:
			System.out.println("Bird Id:");
			Scanner sc = new Scanner(System.in);
			String birdId = sc.next();
			Bird bird = birdRepo.getBird(birdId);
			birdRepo.removeBirds(bird);
		}
	}
}
