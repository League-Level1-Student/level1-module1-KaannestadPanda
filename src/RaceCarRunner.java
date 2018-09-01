
public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		RaceCar o = new RaceCar("SWAGGY BOI", 5);
		// 1. Create a RaceCar and place it in 5th position

		// 2. Print the RaceCar's position in the race
		System.out.println(o.getPositionInRace());
		// 3. Crash the RaceCar
		o.crash();
		System.out.println(o.getPositionInRace());
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (o.isDamaged()) {
			o.pit();
		}
		// 5. Help the car move into first place.
		for (int i = 0; i < 7; i++) {

			o.overtake();
		}
	}
}
