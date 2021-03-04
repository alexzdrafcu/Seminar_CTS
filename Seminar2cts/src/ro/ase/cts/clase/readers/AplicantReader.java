package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
//	daca n avem atribute poate sa fie interfata
	protected String fileName;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		return null;
	}
}
