package sir.maven;

/**
 * Hello world!
 */

public final class App {
	/**
	 * Constructeur.
	 */
	private App() {
		// not called
	}

	/**
	 * Main.
	 * @param args String []
	 */
	public static void main(final String[] args) {
		// nb de test
		int n = 0;
		System.out.println("Hello World!");
		if (n != 0) {
			System.out.println("Coucou");
		} else {
			System.out.println("No");
		}
		// c'est réussi
		if (n != 0) {
			System.out.println("Coucou");
		} else {
			System.out.println("No");
		}
	}
}