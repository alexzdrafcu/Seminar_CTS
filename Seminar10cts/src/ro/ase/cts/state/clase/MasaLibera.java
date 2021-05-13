package ro.ase.cts.state.clase;

public class MasaLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof MasaLibera) {
			System.out.println("Masa " + masa.getNrMasa() + " este deja libera");
		} else {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrMasa() + " a fost eliberata");
		}
	}
}
