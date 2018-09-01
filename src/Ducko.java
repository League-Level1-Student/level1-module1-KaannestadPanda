
public class Ducko {
	int numberOfFriends;
	String favoriteFood;

	public static void main(String[] args) {
		Ducko ducko = new Ducko("food", 3);
		ducko.quack();
	}

	void quack() {
		System.out.println("quack");
	}

	void waddle() {
		System.out.println("waddle");
	}

	Ducko(String favoriteeFood, int numberOffFriends) {
		this.favoriteFood = favoriteeFood;
		this.numberOfFriends = numberOffFriends;
	}

	//

}
