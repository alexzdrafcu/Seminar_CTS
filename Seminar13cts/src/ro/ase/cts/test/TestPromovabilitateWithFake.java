package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.dubluri.StudentFake;

public class TestPromovabilitateWithFake {

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for (int i = 0; i < 8; i++) {
			StudentFake student = new StudentFake();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for (int i = 0; i < 2; i++) {
			StudentFake student = new StudentFake();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.01);
	}

}
