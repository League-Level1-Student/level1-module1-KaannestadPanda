
public class animal {

	int numberOfEyes;
	String colorOfExoskeleton;

	public static void main(String[] args) {

		animal animal = new animal(1, "yellow");
		animal.invade();
		animal.trick();
	}

	void invade() {
		System.out.println("lolll invade");
	}

	void trick() {
		System.out.println("AAAAHAHAHAHAAAHAHAAAA");
	}

	animal(int g, String strong) {
		this.numberOfEyes = g;
		this.colorOfExoskeleton = strong;
		System.out.println(numberOfEyes);

	}

}
