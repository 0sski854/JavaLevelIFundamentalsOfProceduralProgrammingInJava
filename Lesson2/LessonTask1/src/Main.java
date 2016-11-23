import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DANE O PILKARZU");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		byte age;
		float height;
		String club;
		byte numberOnShirt;
		boolean isRightFooted;
		short numberOfRedCards;
		name = "Lionel";
		age = 28;
		height = 1.75f;
		club = "barcelona";
		numberOnShirt = 7;
		numberOfRedCards = 2;
		isRightFooted = true;

		System.out.println("imie " + name);
		System.out.println("wiek " + age);
		System.out.println("wysokosc " + height);
		System.out.println("klub "+ club);
		System.out.println("numer na koszulce " + numberOnShirt);
		System.out.println("czy jest prawo no¿ny " + isRightFooted);
		System.out.println("ilosc czerwonych kartek " + numberOfRedCards);
		
		String pseudonim;
		System.out.println("wrowadz pseudonim:");
		pseudonim = scan.nextLine();
		System.out.println("Pseudonim " + pseudonim);
	}

}
