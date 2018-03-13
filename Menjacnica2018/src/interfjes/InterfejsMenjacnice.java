package interfjes;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface InterfejsMenjacnice {
	
	public void dodajKurs(Valuta valuta);
	public void obrisiKurs(Valuta valuta);
	public Valuta pronadjiValutu(Valuta valuta);
	

}
