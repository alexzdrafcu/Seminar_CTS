package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(5, 3, 17);
		Rezervare r2 = new Rezervare(17, 8, 20);
		Rezervare r3 = new Rezervare(12, 4, 18);
		
		FlyweightFactory fabrica = new FlyweightFactory();
		fabrica.getClient("07123").printeazaRezervare(r1);
		fabrica.getClient("07222").printeazaRezervare(r2);
		fabrica.getClient("07123").printeazaRezervare(r3);
	}

}
