
public class PrimzahlrechnerRekursiv {

	
	public static boolean isPrime(int n)
	{
		boolean ergebnis = true;
		if (n % (n-1) == 0 )
		{
			ergebnis = false;
		}
		return ergebnis;
	}
	
	public static void main(String[] args)
	{
		isPrime(5);
	}
}
