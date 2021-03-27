package com.conditions.java.learning;

public class TC02_MySuperHero {

	
	String SuperHeroName = "Captain America";
	
	public void findSuperHero() {
		
		if (SuperHeroName.equalsIgnoreCase("Power Man")) {
			System.out.println("You thoguth about Power Man");
		}else if (SuperHeroName.equalsIgnoreCase("Spider Man")) {
			System.out.println("You thought about spider Man");
		}else if (SuperHeroName.equalsIgnoreCase("iron Man")) {
			System.out.println("You thought about Iron Man");
		}else {
			System.out.println("Sorry I am not able to find your super hero");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC02_MySuperHero superHero = new TC02_MySuperHero();
		superHero.findSuperHero();

	}

}
