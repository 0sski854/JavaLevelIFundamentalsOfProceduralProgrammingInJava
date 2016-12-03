import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ZMIENNE");
		System.out.println();
		char firstLetterOfName = 'O';
		String lastName = "Zieba";
		short temperature = 1;
		float temperatureFloat = 1.5f;
		short numberOfStudentsInClass = 23;
		float bodyWeight = 39f;
		float height = 147f;
		int heightOfMontEverest = 884800;
		boolean isEmptyPostBox = true;
		long numberOfNeuronsInHumanBrain = 100000000;
		double piNumber = 3.14;
		long PeopleOnFacebook = 150000000;
		
		System.out.println("pierwszaLiteraImienia = " + firstLetterOfName);
		System.out.println("nazwisko = " + lastName);
		System.out.println("temperatura = " + temperature + "C");
		System.out.println("dokladniejszaTemperatura = " + temperatureFloat + "C");
		System.out.println("iloscUczniowWKlasie = " + numberOfStudentsInClass);
		System.out.println("waga ciala = " + bodyWeight + "kg");
		System.out.println("wysokosc = " + height + "cm");
		System.out.println("wysokoscMontEverestu = " + heightOfMontEverest);
		System.out.println("iloscNeuronowWMozguCzlowieka = " + numberOfNeuronsInHumanBrain);
		System.out.println("liczbaPi = " + piNumber);
		System.out.println("iloscUzytkownikowNaFacebooku = " + PeopleOnFacebook);
		System.out.println("czySkrzynkaJestPusta? = " + isEmptyPostBox);
	}

}
