package ro.ase.cts.adapterclase.clase;

public class AdapterCreditClase extends Leasing implements CreditAbstract {
	public AdapterCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
	}

	@Override
	public void oferaCredit() {

		super.imprumuta();
	}
}
