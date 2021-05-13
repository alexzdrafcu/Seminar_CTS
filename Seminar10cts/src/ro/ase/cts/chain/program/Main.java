package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Main {
	public static void main(String[] args) {

		Cont contCurent = new ContCurent(1300);
		Cont contCredit = new ContCredit(1000);
		Cont contEconomii = new ContEconomii(2000);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(1000);
		contCurent.plateste(2000);
		contCurent.plateste(100);
		contCurent.plateste(550);
		contCurent.plateste(1000);
	}
}
