
public class Primzahlrechner {

	
	public static boolean isPrime(int n )
	{
		boolean ergebnis = true;
		int zaehler = 2;
		if (n == 1) {
			ergebnis = false;
			System.out.println(ergebnis);
			return ergebnis;
		}
		while(zaehler < n)
		{
			if(n % zaehler == 0) {ergebnis = false; }
			zaehler++;
		}
		System.out.println(ergebnis);
		return ergebnis;
		
	}
	
	public static void main(String[] args)
	{
		isPrime(1);
	}
}
