
public class Ducko {
int numberOfFriends;
String favoriteFood;
	public static void main(String[] args) {
		Ducko ducko=new Ducko();
		ducko.Ducko("food",3);
		
		
		
		
		
	}
	
	
	void quack() {
		System.out.println("quack");
	}
	
	
	void waddle() {
		System.out.println("waddle");
	}
	
	Ducko(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	
}
