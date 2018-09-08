
public class SeaRunner {

	public static void main(String[] args) {

		SeaCreature s= new SeaCreature("Spongebob");
		System.out.println(s.getName());
		
		s.eat();
		s.laugh();
		
		SeaCreature sq= new SeaCreature("Squidward");
		System.out.println(sq.getName());
		
		sq.eat();
		sq.laugh();
		
		SeaCreature p= new SeaCreature("Patrick");
		System.out.println(p.getName());
		
		p.eat();
		p.laugh();
	}

}
