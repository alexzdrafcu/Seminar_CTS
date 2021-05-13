package ro.ase.cts.strategy.clase;

public class Card  implements Strategy {

	@Override
	public void plateste(float suma) {
		System.out.println("Plata cu cardul in valoare de " + suma + " lei");
	}
}
