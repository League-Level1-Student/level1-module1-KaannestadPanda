/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {
	String h;
	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (name.equals("JUST CALL ME PAPA")){
			return "BLOODRED";
		}
		else {
			return "DEATHLY WHITE";
		}
		// 3. Fill in this method
		
	}
String g;
	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (name.equals("We will spread the sickness")){
			return "girl";
		}
		else {
			return "boy";
		}
		// 4. Fill in this method
		
	}

}



