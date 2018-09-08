
public class Smurves {

	public static void main(String[] args) {
		Smurf destructo= new Smurf("Smurves are a disease");
		Smurf gangLord= new Smurf("JUST CALL ME PAPA");
		Smurf smurfAssassin= new Smurf("We will spread the sickness");
		
		System.out.println(destructo.getName());
		destructo.eat();
		System.out.println(destructo.getHatColor());
		System.out.println(destructo.isGirlOrBoy());
		
		System.out.println(gangLord.getName());
		gangLord.eat();
		System.out.println(gangLord.getHatColor());
		System.out.println(gangLord.isGirlOrBoy());
		
		System.out.println(smurfAssassin.getName());
		smurfAssassin.eat();
		System.out.println(smurfAssassin.getHatColor());
		System.out.println(smurfAssassin.isGirlOrBoy());
		
	}
	
	
	
	
	
	
	
	
	
}
