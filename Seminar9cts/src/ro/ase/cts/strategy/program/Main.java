
package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;
import ro.ase.cts.strategy.clase.Strategy;

public class Main {
	public static void main(String[] args) {
		Client client1 = new Client("alex");
		Client client2 = new Client("zdrafcu");
		Strategy strategieCash = new Portofel(500);
		Strategy strategieCard = new Card();
		client1.setStrategie(strategieCash);
		client2.setStrategie(strategieCard);
		
		client1.platesteNota(300);
		client2.platesteNota(180);
		
		client1.platesteNota(400);
		client1.setStrategie(strategieCard);
		client1.platesteNota(400);
	}
}
