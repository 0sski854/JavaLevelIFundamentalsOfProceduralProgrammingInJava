
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("KULKI");
		System.out.println();
		
		int numberOfRedBalls = 50;
		int numberOfGreenBalls = 100;
		int numberOfBlueBalls = 200;
		
		System.out.println("Ilosc czerwonych kulek " + numberOfRedBalls);
		System.out.println("Ilosc zielonych kulek " + numberOfGreenBalls);
		System.out.println("Ilosc niebieskich kulek " + numberOfBlueBalls);
		System.out.println("Laczna liczba kulek " + (numberOfRedBalls + numberOfGreenBalls+ numberOfBlueBalls));
		
		int numberOfAllBalls = numberOfRedBalls + numberOfGreenBalls + numberOfBlueBalls;
		
		int numberOfBlackBalls = 30; 
		
		numberOfAllBalls = numberOfAllBalls + numberOfBlackBalls;
		
		System.out.println("Laczna liczba kulek " + numberOfAllBalls);
		numberOfRedBalls = 75;
		System.out.println("Laczna liczba kulek " + numberOfAllBalls);
	}

}
