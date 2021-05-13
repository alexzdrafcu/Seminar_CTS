package ro.ase.cts.observer.clase;

public interface Observabil {
	public void adaugareAbonat(Observer observer);
	public void stergereAbonat(Observer observer);
	public void trimiteMesaj(String mesaj);
}
