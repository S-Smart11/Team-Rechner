package statistischeAuswertung;

public class StatistischeAuswertung {
	
	public double Mittelwert(double ...zahl) {
		
		double temp = 0;
		
		for (double elem: zahl) {
			
			temp+= elem;
			
		}
		
		return temp / zahl.length;	
		
		
	}
	
	public double Median(double ...zahl) {
		
		int pointer = 0;
		int pointer1 = 0;
		
		//gerade
		if (zahl.length % 2 == 0) {
			
			pointer = zahl.length / 2;
			
			return zahl[pointer];
			
		//ungerade	
		} else {
			
			pointer = (int) (zahl.length - 0.5);
			pointer1 = (int) (zahl.length + 0.5);
			
			
			return Mittelwert(pointer, pointer1);
			
			
		}
		
	}
	
	public double Standardabweichung(double ...zahl) {
		
		double Mittelwert = Mittelwert(zahl);
		double Abweichung = 0;
		
		for(int count = 0; count < zahl.length; count++) {
			
			Abweichung += quadrieren(zahl[count] - Mittelwert, 2);
			
		}
		
		//Stichprobe
		Abweichung = Abweichung / (zahl.length-1);
		
		Abweichung = Math.sqrt(Abweichung);
		
		return Abweichung;
		
	}
	
	public double min(double ...zahl) {
		
		double placeholder = zahl[0];
		
		for (double elem: zahl) {
			
			if (placeholder < elem) {
				
				continue;
				
			} else {
				
				placeholder = elem;
				
			}
			
		}
		
		return placeholder;
		
	}
	
	public double max(double ...zahl) {
		
		double placeholder = zahl[0];
		
		for (double elem: zahl) {
			
			if (placeholder > elem) {
				
				continue;
				
			} else {
				
				placeholder = elem;
				
			}
			
		}
		
		return placeholder;
		
	}
	
	private double quadrieren(double zahl1, double quadrierungswert) {
		
		double placeholder = zahl1;
		
		for(int count = 1; count < quadrierungswert; count++) {
			
			placeholder = placeholder * zahl1;
			
		}
		
		return placeholder;
		
	}

	
	
}
