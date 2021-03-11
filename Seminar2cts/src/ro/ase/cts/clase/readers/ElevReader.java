package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends AplicantReader {
	public ElevReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.fileName));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev angajat = new Elev();
			super.readAplicant(input2, angajat);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			angajat.setClasa(clasa);
			angajat.setTutore(tutore);
			elevi.add(angajat);
		}

		input2.close();
		return elevi;
	}
}
