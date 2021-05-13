package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}

	public void constituire(float suma) {
		sold = suma;
		System.out.println("S-a constituit contul cu suma " + suma);
	}

	public void retragere(float suma) {
		if (sold >= suma) {
			sold -= suma;
			System.out.println("S-a retras suma de " + suma);
		} else {
			System.out.println("Fonduri insifuciente");
		}
	}

	public void depunere(float suma) {
		sold += suma;
		System.out.println("A fost depusa suma de " + suma);
	}
}
