package com.bridgelabz.birdsanctuaryproblem;

public class Bird {
	String name;
	String color;
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color + "]";
	}
	
	public void eat() {
		System.out.println(getClass().getSimpleName() + " eats insacts");
	}

	public void fly() {
		System.out.println(getClass().getSimpleName() + " can fly");
	}
	
	public void swim() {
		System.out.println(getClass().getSimpleName() + " can swim");
	}
}
