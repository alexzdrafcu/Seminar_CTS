package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Element;
import ro.ase.cts.composite.clase.Sectiune;

public class Main {
	public static void main(String[] args) {
		ComponentaMeniu meniu = new Sectiune("meniu");
		ComponentaMeniu sectiuneBauturi = new Sectiune("racoritoare");
		ComponentaMeniu sectiuneFelPrincipal = new Sectiune("fel principal");
		
		ComponentaMeniu friptura = new Element("porc");
		ComponentaMeniu bere = new Element("draught");
		ComponentaMeniu vin = new Element("rose");
		ComponentaMeniu garnitura = new Element("orez");
		
		sectiuneBauturi.adaugaNod(vin);
		sectiuneBauturi.adaugaNod(bere);
		
		sectiuneFelPrincipal.adaugaNod(friptura);
		sectiuneFelPrincipal.adaugaNod(garnitura);
		
		meniu.adaugaNod(sectiuneBauturi);
		meniu.adaugaNod(sectiuneFelPrincipal);
		
		meniu.printeaza();
		System.out.println();
		sectiuneBauturi.stergeNod(bere);
		sectiuneFelPrincipal.adaugaNod(bere);
		meniu.printeaza();
	}
}
