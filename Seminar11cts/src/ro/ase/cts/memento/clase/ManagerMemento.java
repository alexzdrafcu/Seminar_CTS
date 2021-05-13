package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> listaMemento = new ArrayList<>();

	public void adaugaMemento(Memento memento) {
		listaMemento.add(memento);
	}

	public Memento getMemento(int poz) {
		if (poz >= 0 && poz < listaMemento.size()) {
			return listaMemento.get(poz);
		} else {
			throw new IndexOutOfBoundsException("nu exista");
		}
	}
}
