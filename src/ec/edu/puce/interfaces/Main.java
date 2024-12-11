package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola PUCE");

		Rectangulo rectangulo1=new Rectangulo();
		rectangulo1.setAltura(25);
		rectangulo1.setBase(14);
		System.out.println("Área del rectángulo: " + rectangulo1.calcularArea());
	}

}
