package com.conditions.java.learning;

public class TC03_SuperHeroOrNot {

	String SuperHero = "Captain America";
	
	public void findSuperHero() {
		switch (SuperHero) {
		case "Captain America": System.out.println("Captain America is a Super Hero");
			break;
		case "Bat Man": System.out.println("Bat Man is a Super Hero");
		    break;
		case "Iron Man": System.out.println("Iron Man is a Super Hero");
            break;
		default: System.out.println("Your super hero not in this list");
		}
	}
	
	public static void main(String[] args) {
		TC03_SuperHeroOrNot heroOrNot = new TC03_SuperHeroOrNot();
		heroOrNot.findSuperHero();
	}

}
