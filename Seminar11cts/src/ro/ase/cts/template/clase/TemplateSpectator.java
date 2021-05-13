package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {
	public final void intrareStadion() {
		seAseazaLaCoada();
		prezintaBilet();
		controleazaCorporal();
		ocupaLoc();
	}

	public abstract void seAseazaLaCoada();

	public abstract void prezintaBilet();

	public abstract void controleazaCorporal();

	public abstract void ocupaLoc();
}
