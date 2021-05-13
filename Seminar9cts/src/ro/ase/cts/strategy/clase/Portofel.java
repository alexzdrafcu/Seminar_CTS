package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy {
	float sumaDisponibila;

	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void plateste(float suma) {
		if(sumaDisponibila >= suma) {
			System.out.println("Plata cash in valoare de " + suma + " lei");
			sumaDisponibila-=suma;
			return;
		}
		System.out.println("Fonduri insuficiente");
	}
}
