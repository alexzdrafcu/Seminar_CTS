package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<String, Flyweight> clienti;

	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<>();
	}

	public Flyweight getClient(String nrTelefon) {
		if (clienti.containsKey(nrTelefon)) {
			return clienti.get(nrTelefon);
		} else {
			Flyweight client = new Client("alex", nrTelefon, "alexzdrafcu@gmail.com");
			clienti.put(nrTelefon, client);
			return client;
		}
	}
}
