package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare {
	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof MasaLibera) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrMasa() + " a fost rezervata");
		} else {
			System.out.println("Masa " + masa.getNrMasa() + " nu poate fi rezervata");
		}
	}
}
