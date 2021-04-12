package ro.ase.cts.proxy.clase;

public class Proxy implements CreditAbstract {
	private CreditAbstract credit;

	public Proxy(CreditAbstract credit) {
		super();
		this.credit = credit;
	}

	@Override
	public void oferaCredit(TipMoneda moneda, float suma) {
		if (moneda == TipMoneda.RON) {
			credit.oferaCredit(moneda, suma);
		} else {
			System.out.println("Banca ofera doar credite in RON!");
		}
	}

}
