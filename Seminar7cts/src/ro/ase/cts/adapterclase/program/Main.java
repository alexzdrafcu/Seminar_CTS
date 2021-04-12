package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adapterclase.clase.CreditAbstract;
import ro.ase.cts.adapterclase.clase.AdapterCreditClase;

public class Main {
	public static void afiseazaInformatiiCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}


	public static void main(String[] args) {
		AdapterCreditClase adaptorClase = new AdapterCreditClase(1500, "Mihai");
		afiseazaInformatiiCredit(adaptorClase);
	}
}
