package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {
	public static void main(String[] args) {
		MeciJucat meci1 = new MeciJucat("dinamo", "steaua", 20000, 120000, 50, 100);
		
		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setNumeGazda("real madrid");
		meci1.setNumeOaspeti("barcelona");
		meci1.setNrSpectatori(123411);
		
		manager.adaugaMemento(meci1.creareMemento());
		
		System.out.println(meci1.toString());
		
		meci1.setMemento(manager.getMemento(0));
		
		System.out.println(meci1.toString());
	}

}
