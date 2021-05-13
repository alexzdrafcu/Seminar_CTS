package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if (masa.getStare() instanceof MasaOcupata) {
			System.out.println("Masa " + masa.getNrMasa() + " este deja ocupata");
		} else {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrMasa() + " a fost ocupata");
		}
	}
}
