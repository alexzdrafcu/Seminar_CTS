package ro.ase.cts.test;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupaCuFixture {
	private Grupa grupa;

	@Before
	public void setUp() {
		grupa = new Grupa(1083);
		for (int i = 0; i < 35; i++) {
			Student student = new Student("alex");
			for (int j = 0; j < 7; j++) {
				student.adaugaNota(7);
			}
			grupa.adaugaStudent(student);
		}
	}

	@Test(timeout = 500)
	public void testPromovabilitatePerformance() {

		grupa.getPromovabilitate();
	}
}
