
public class Primzahlrechner2 {

	public static void isPrime(int n) {
		boolean[] gestrichen = new boolean[n + 1];
		
		gestrichen[1] = true;
		for (int i = 2; i < n; i++) {
			if (gestrichen[i] == false) {
				for (int j = i * i; j <= n; j = j + i) {
					gestrichen[j] = true;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			if (gestrichen[i] == false) {
				System.out.println(i + " ist eine Primzahl");
			} else {
				System.out.println(i + " ist keine Primzahl");
			}
		}
	}

	public static void main(String[] args) {
		isPrime(200);
	}
}
