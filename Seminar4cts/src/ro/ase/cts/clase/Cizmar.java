package ro.ase.cts.clase;

public class Cizmar {
	private String nume;
	private int varsta;
	private boolean areExperienta;
	private float salariu;
	private static Cizmar cizmar = null;

	private Cizmar(String nume, int varsta, boolean areExperienta, float salariu) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.areExperienta = areExperienta;
		this.salariu = salariu;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setAreExperienta(boolean areExperienta) {
		this.areExperienta = areExperienta;
	}

	public void setSalariu(float salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cizmar [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", experienta=");
		builder.append(areExperienta);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]");
		return builder.toString();
	}

	public static synchronized Cizmar getInstance(String nume, int varsta, boolean areExperienta, float salariu) {
		if (cizmar == null) {
			cizmar = new Cizmar(nume, varsta, areExperienta, salariu);
		}
		return cizmar;
	}
}
