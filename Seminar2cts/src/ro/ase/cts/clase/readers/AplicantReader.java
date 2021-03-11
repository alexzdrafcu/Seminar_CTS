package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
//	daca n avem atribute poate sa fie interfata
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nrProiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[5];
		for (int i = 0; i < nrProiecte; i++)
			denumiriProiecte[i] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(nrProiecte, denumiriProiecte);
	}
}
