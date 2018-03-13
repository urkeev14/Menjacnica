package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfjes.InterfejsMenjacnice;
import valuta.Valuta;

public class Menjacnica implements InterfejsMenjacnice {

	LinkedList<Valuta> valuteMenjacnice = new LinkedList<>();

	
	@Override
	public void dodajKurs(Valuta valuta) {
		valuteMenjacnice.add(valuta);
	}

	@Override
	public void obrisiKurs(Valuta valuta) {
		valuteMenjacnice.remove(valuta);
	}

	@Override
	public Valuta pronadjiValutu(Valuta valuta) {
		if (valuteMenjacnice.isEmpty())
			throw new RuntimeException();

		for (int i = 0; i < valuteMenjacnice.size(); i++)
			if (valuteMenjacnice.get(i).equals(valuta))
				return valuteMenjacnice.get(i);

		return null;
	}

}
