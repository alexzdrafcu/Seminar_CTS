package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {
	public static void afiseazaInformatiiCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		Leasing leasing = new Leasing(1200, "Alex");
		AdapterCreditObiecte adaptor = new AdapterCreditObiecte(leasing);
		afiseazaInformatiiCredit(adaptor, leasing.getSuma());
	}
}
