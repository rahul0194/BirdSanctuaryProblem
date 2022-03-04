package com.bridgelabz.birdsanctuaryproblem;

import java.util.List;

public class UserInterface {

	void print(List birds) {

		for (int i = 0; i < birds.size(); i++) {
			System.out.println(birds.get(i));
		}
	}
	void printAllFlyableBrids(List<Bird> birds) {
		for (int i = 0; i < birds.size(); i++) {
			birds.get(i).fly();
		}
	}
}
