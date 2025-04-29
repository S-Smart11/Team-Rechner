package bruchrechner;


public class Bruchrechnungen {
	double ergebniss;
	double ergZahlOben;
	double ergZahlUnten;
	String brucherg="";
	
	public String addieren(double zahlOben1, double zahlUnten1, double zahlOben2, double zahlUnten2) {
		if (zahlUnten1 == zahlUnten2) {
			ergZahlOben = zahlOben1 + zahlOben2;
			ergZahlUnten = zahlUnten1;
			brucherg = ergZahlOben + "/" + ergZahlUnten;	
		} else {
			ergZahlOben = zahlOben1 + zahlOben2;
			ergZahlUnten = zahlUnten1 * zahlUnten2;
			brucherg = ergZahlOben + "/" + ergZahlUnten;
		}
		return brucherg;
	}
	public String subtrahieren(double zahlOben1, double zahlUnten1, double zahlOben2, double zahlUnten2) {
		if (zahlUnten1 == zahlUnten2) {
			ergZahlOben = zahlOben1 - zahlOben2;
			ergZahlUnten = zahlUnten1;
			brucherg = ergZahlOben + "/" + ergZahlUnten;	
		} else {
			ergZahlOben = zahlOben1 - zahlOben2;
			ergZahlUnten = zahlUnten1 * zahlUnten2;
			brucherg = ergZahlOben + "/" + ergZahlUnten;
		}
		return brucherg;
	}
	
	public String dividieren(double zahlOben1, double zahlUnten1, double zahlOben2, double zahlUnten2) {
		ergZahlOben = zahlOben1 * zahlOben2;
		ergZahlUnten = zahlUnten1 * zahlUnten2;
		brucherg = ergZahlOben + "/" + ergZahlUnten;
		return brucherg;
	}
	
	public String multiplizieren(double zahlOben1, double zahlUnten1, double zahlOben2, double zahlUnten2) {
		zahlOben2 = zahlUnten2;
		double zO2 = zahlOben2;
		zahlUnten2 = zO2;
		
		ergZahlOben = zahlOben1 * zahlOben2;
		ergZahlUnten = zahlUnten1 * zahlUnten2;
		brucherg = ergZahlOben + "/" + ergZahlUnten;
		return brucherg;
	}
	
	
	
	
	public String brüche(double zahlOben1, double zahlUnten1, char rz, double zahlOben2, double zahlUnten2) {
		if (rz == '*') {
			brucherg = multiplizieren(zahlOben1, zahlUnten1, zahlOben2, zahlUnten2);
			
		} else if (rz == '+') {
			brucherg = addieren(zahlOben1,  zahlUnten1,  zahlOben2,  zahlUnten2);
		
		} else if (rz == '-') {
			brucherg = subtrahieren( zahlOben1,  zahlUnten1, zahlOben2,  zahlUnten2);
			
		} else if (rz == '/') {
			brucherg = dividieren(zahlOben1, zahlUnten1, zahlOben2, zahlUnten2);
	}
		return brucherg;
	}
	
}
		