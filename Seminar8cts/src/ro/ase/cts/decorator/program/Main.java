package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Main {
	public static void main(String[] args) {
		NotaAbstracta nota = new NotaDePlata(200);
		nota.printeaza();
		
		DecoratorAbstract decorator = new DecoratorNotaPasteFericit(nota);
		decorator.printeaza();
		decorator.printeazaFelicitare();
		
		System.out.println();
		
		DecoratorAbstract decorator2 = new DecoratorNotaLaMultiAni(nota);
		decorator2.printeaza();
		decorator2.printeazaFelicitare();
		
		System.out.println();
		
		NotaAbstracta nota2 = new NotaDePlata(500);
		DecoratorAbstract decorator3 = new DecoratorNotaLaMultiAni(nota2);
		DecoratorAbstract decorator4 = new DecoratorNotaPasteFericit(decorator3);
		
		decorator4.printeaza();
		
	}
}
