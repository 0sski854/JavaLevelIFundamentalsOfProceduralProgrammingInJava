import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Wprowadz wartosc a");
		a = scan.nextInt();
		System.out.println("Wprowadz wartosc b");
		b = scan.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int c = (int) Math.sqrt((Math.pow(a, 2)) + (b*b));
		System.out.println("przeciwprostokatna = " + c );
		
				
	}

}
