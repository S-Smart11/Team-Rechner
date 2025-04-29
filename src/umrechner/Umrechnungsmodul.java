package umrechner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Umrechnungsmodul {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int eingabe;

	public String Umrechnung() {
		switch (Umrechnungsauswahl()) {
		case 1: {
			eingabe = 0;
			System.out.println("Eingegebene Einheit:\n=============\n(1) Celsius\n(2) Fahrenheit");
			while (eingabe > 2 || eingabe < 1) {
				try {
					eingabe = Integer.parseInt(br.readLine());
					switch (eingabe) {
					case 1: {
						return Double.toString(Math.round((Double.parseDouble(br.readLine()) * 1.8 + 32)*100)/100)+ " Fahrenheit";
					}
					case 2: {
						return Double.toString(Math.round((Double.parseDouble(br.readLine()) - 32 * 1.8)*100)/100) + " Celsius";
					}
					}
				} catch (Exception e) {
					e.getMessage();
				}
			}
		}
		case 2: {
			eingabe = 0;
			System.out.println("Eingegebene Einheit:\n=============\n(1) Euro\n(2) USD");
			try {
				switch (Integer.parseInt(br.readLine())) {
				case 1: {
					return Double.toString(Math.round((Double.parseDouble(br.readLine()) *1.13)*100)/100) + " $";
				}
				case 2: {
					return Double.toString(Math.round((Double.parseDouble(br.readLine()) /1.13)*100)/100)+ " €";
				}
				}
			} catch (Exception e) {
				e.getMessage();
			}
		}
		default:
			System.out.println("Falsche Eingabe!");
		}
		return null;
	}

	public int Umrechnungsauswahl() {
		while (eingabe > 2 || eingabe < 1) {
			try {
				System.out
						.println("Umrechnungsoptionen:\n==================\n(1) Celsius ↔ Fahrenheit\n(2) Euro ↔ USD");
				eingabe = Integer.parseInt(br.readLine());
				return eingabe;
			} catch (Exception e) {
				System.out.println("Falsche Eingabe!");
			}

		}
		return 0;
	}

}
