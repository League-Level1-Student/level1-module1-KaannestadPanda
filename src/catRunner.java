
public class catRunner {

	public static void main(String[] args) {
		Cat wat = new Cat("schwartzstein");
		wat.meow();
		wat.printName();
		for (int i = 0; i < 9; i++) {
			wat.kill();
		}
	}

}
