package Tuerme_von_Hanoi;

class Hanoi
{

	static int counter; // Counter für die Kontrollstruktur (Anzahl der
						// Verlegevorgänge)

	static void shift(int zahlDerScheiben, int quellPlatz, int zwischenPlatz, int zielPlatz)
	/*
	 * Verlegeprogramm shift: Verlegeoptionen um zahlDerScheiben vom quellPlatz
	 * mit Hilfe des zwischenPlatz zum zielPlatz zu bewegen
	 */
	{
		if (zahlDerScheiben > 0) // Bedingung: Anzahl der Scheiben muss größer 0
									// sein
		{

			shift(zahlDerScheiben - 1, quellPlatz, zielPlatz, zwischenPlatz);
			// "Nimm eine Scheibe vom quellPlatz und lege sie auf den zwischenPlatz mit Hilfe des zielPlatzes"
			System.out.println("Nimm Scheibe Nummer " + zahlDerScheiben + " vom Platz " + quellPlatz
					+ " und lege sie auf Platz " + zielPlatz);
			// Anweisung ausgeben
			shift(zahlDerScheiben - 1, zwischenPlatz, quellPlatz, zielPlatz);
			// "Nimm eine Scheibe vom zwischenPlatz und lege sie auf den zielPlatz mit Hilfe des quellPlatzes"
			counter++;

		} // Ende if-Bedingung

	} // Ende Verlegeprogramm

	public static void main(String[] args) // Hauptprogramm
	{
		int n = (20); // Eingabe der Anzahl der Scheiben
		while (n <= 0)
			; // Schleife bis keine Scheiben mehr auf dem quellPlatz sind
		{
			shift(n, 1, 2, 3);
			/*
			 * Aufruf des Programms shift mit Parametern: n = Eingabe = Anzahl
			 * der vorhandenen Scheiben auf dem quellPlatz 1 = quellPlatz 2 =
			 * zwischenPlatz 3 = zielPlatz
			 */
		} // Ende Schleife
		System.out.println("\r\nEs werden " + counter + " Verlegevorgänge benötigt.");
		// Ausgabe der Summe der Verlegevorgänge (Kontrollstruktur)

	} // Ende Hauptprogramm

}