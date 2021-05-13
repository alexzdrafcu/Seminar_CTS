package ro.ase.cts.template.clase;

public class Spectator extends TemplateSpectator {

	private String name;

	public Spectator(String name) {
		super();
		this.name = name;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(name +  " s-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(name + " a prezentat biletul");
	}

	@Override
	public void controleazaCorporal() {
		System.out.println(name + " a fost controlat");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(name + " a ocupat locul");
	}
}
