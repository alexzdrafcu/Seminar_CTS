package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {
	public static void main(String[] args) {
		Masa masa = new Masa(11);
		masa.elibereazaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
	}
}
