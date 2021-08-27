package figuras;

public class Rectangulo {

	double ancho;
	double alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}

	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}

}
