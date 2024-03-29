package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Cizmar;

public class Main {

	public static void main(String[] args) {
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 =  BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		System.out.println('\n');
		
		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana",2,30);
		BrokerTranzactieLazy lazy2 =  BrokerTranzactieLazy.getInstance("Bianca",4,50);
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
		System.out.println('\n');

		Cizmar cizmar = Cizmar.getInstance("Alex", 75, true, 2600);
		Cizmar cizmar2 = Cizmar.getInstance("Mihai", 60, true, 2300);
		System.out.println(cizmar.toString());
		System.out.println(cizmar2.toString());


	}

}
