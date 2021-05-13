package ro.ase.cts.strategy.clase;

public class Client {

	private Strategy strategie;
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	public void setStrategie(Strategy strategy) {
		this.strategie = strategy;
	}
	
	public void platesteNota(float suma) {
		System.out.println(nume + " are de platit " + suma + " lei");
		strategie.plateste(suma);
	}
}
