package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		// PROTOTYPE - varianta fara cloneable - 4Es
		ContClient contClient1 = new ContClient("Ion", 21, 10);
		ContClient contclient2 = (ContClient) contClient1.copiaza();
		
		System.out.println(contClient1);
		System.out.println(contclient2);
		
		Bilet bilet1 = new Bilet(1,"echipa1","echipa2","13 iunie 2021");
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet2.setCodBilet(2);
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(3);
		
		System.out.println(bilet1);
		System.out.println(bilet2);
		System.out.println(bilet3);

	}

}
