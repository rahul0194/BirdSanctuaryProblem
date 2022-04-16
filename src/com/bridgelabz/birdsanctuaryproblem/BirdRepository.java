package com.bridgelabz.birdsanctuaryproblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdRepository {
	// private List<Bird> birdList = new ArrayList();
	private Set<Bird> birdList = new HashSet<Bird>();

	Set getBirdList() {
		return birdList;
	}

	void addBirds(Bird bird) {
		birdList.add(bird);
	}

	void removeBirds(Bird bird) {
		birdList.remove(bird);
	}

	Bird getBird(String birdId) {
		for (Bird bird : birdList) {
			if (bird.birdId.equalsIgnoreCase(birdId)) {
				return bird;
			}
		}
		return null;
	}
}
