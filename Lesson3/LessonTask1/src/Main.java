import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanInt = new Scanner(System.in);
		
		int liczba1;
		System.out.println("Wprowadz liczbe 1");
		liczba1 = scanInt.nextInt();
		
		int liczba2;
		System.out.println("Wprowadz liczbe 2");
		liczba2 = scanInt.nextInt();

		int operator;
		System.out.println("Wprowadz operator(1 - dodawanie, 2- odejmowanie, 3- mnozenie, 4-dzielenie):");
		operator =  scanInt.nextInt();
		if (operator == 1){System.out.println(liczba1 + liczba2);
		
		}
		
	}

}
