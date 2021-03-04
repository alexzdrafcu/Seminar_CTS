package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Giraffe giraffe1 = new Giraffe("Giraffe1");
		Giraffe giraffe2 = new Giraffe("Giraffe2");
		zoo.addAnimal(giraffe1);
		zoo.addAnimal(giraffe2);
		zoo.feedAllAnimals();
		Zebra zebra1 = new Zebra("Zebra1");
		Zebra zebra2 = new Zebra("Zebra2");
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		zoo.feedAllAnimals();

	};
	

}
