package federicoGarciaLorca;

public class Coche extends Vehiculo{
	private int numPuertas;


	public Coche(String matricula, String color, String marca, String modelo) {
		super(matricula, color, marca, modelo);
		this.numPuertas =0;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", getNumPuertas()=" + getNumPuertas() + ", toString()="
				+ super.toString() + ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public Coche(String matricula, String color, String marca, String modelo, int numPuertas) {
		super(matricula, color, marca, modelo);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
}
