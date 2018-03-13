package interfjes;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface InterfejsMenjacnice {
	
	public void dodajKurs(Valuta valuta, GregorianCalendar dan);
	public void obrisiKurs(Valuta valuta, GregorianCalendar dan);
	public Valuta pronadjiValutu(Valuta valuta, GregorianCalendar dan);
	

}
