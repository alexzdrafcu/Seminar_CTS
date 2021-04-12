package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract {
	
	@Override
	public void oferaCredit(TipMoneda moneda, float suma) {
		System.out.println("S-a aproat un credit in valoare de " + suma + " " + moneda);
	}
}
