package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala  implements Observabil{

	private List<Observer> clienti;
	private String numeSala;

	public ManagerSala(String numeSala) {
		super();
		this.numeSala = numeSala;
		this.clienti = new ArrayList<>();
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		clienti.add(observer);
	}

	@Override
	public void stergereAbonat(Observer observer) {
		clienti.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(client -> client.receptioneazaMesaj(mesaj));
	}

	public void trimiteAnuntImportant(String tipMeci) {
		trimiteMesaj("Azi se joaca un meci de " + tipMeci);
	}
}
