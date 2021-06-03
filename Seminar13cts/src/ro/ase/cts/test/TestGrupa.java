package ro.ase.cts.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {

	@Test
	public void testConstructorCorect() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionLimitaInferioara() {
		Grupa grupa = new Grupa(999);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorShouldThrowExceptionLimitaSuperioara() {
		Grupa grupa = new Grupa(1500);
	}

	@Test(timeout = 500)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1083);
	}

	@Test
	public void testConstructorExistanceStudentsList() {
		Grupa grupa = new Grupa(1094);
		assertNotNull(grupa.getStudenti());
	}

	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for (int i = 0; i < 3; i++) {
			Student student = new Student("alex");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for (int i = 0; i < 7; i++) {
			Student student = new Student("mihai");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	public void testPromovabilitateLowerBoundary() {
		Grupa grupa = new Grupa(1083);
		for (int i = 0; i < 3; i++) {
			Student student = new Student("alex");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test
	public void testPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1083);
		for (int i = 0; i < 3; i++) {
			Student student = new Student("alex");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 1f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1083);
		grupa.getPromovabilitate();
	}

}