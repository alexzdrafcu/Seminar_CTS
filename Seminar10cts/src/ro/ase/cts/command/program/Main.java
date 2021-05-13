package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituireCont;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ContBancar cont = new ContBancar("gabita");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituireCont(cont, 1500));
		manager.invoca(new ComandaRetragere(cont, 700));
		manager.executaComanda();
		manager.invoca(new ComandaDepunere(cont, 1550));
		manager.executaComanda();
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(cont, 5500));
		manager.executaComanda();
	}
}
