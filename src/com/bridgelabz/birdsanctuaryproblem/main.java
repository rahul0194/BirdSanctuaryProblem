package com.bridgelabz.birdsanctuaryproblem;

public class main {
	public static void main(String[]args) {
		System.out.println("Welcome to Bird Sanctuary ");

		Duck duck = new Duck();
		Ostrich ostrich = new Ostrich();
		Flemingo flemingo = new Flemingo();
		Parrot parrot = new Parrot();
		Penguine penguine = new Penguine();

		BirdRepository birdRepo = new BirdRepository();

		birdRepo.addBirds(duck);
		birdRepo.addBirds(flemingo);
		birdRepo.addBirds(ostrich);
		birdRepo.addBirds(penguine);
		birdRepo.addBirds(parrot);

		UserInterface userInterface = new UserInterface();
		userInterface.print(birdRepo.getBirdList());

		System.out.println("Printing Birds after removal");

		// birdRepo.removeBirds(duck);
		// birdRepo.removeBirds(flemingo);
		// birdRepo.removeBirds(ostrich);
		// birdRepo.removeBirds(penguine);
		// birdRepo.removeBirds(parrot);


		// userInterface.print(birdRepo.getBirdList());
		
		userInterface.printAllFlyableBrids(birdRepo.getBirdList());
	}
}
