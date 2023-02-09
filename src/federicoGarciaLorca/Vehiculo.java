package federicoGarciaLorca;

public abstract class Vehiculo implements Valida{
	private String matricula;
	private String color;
	private String marca;
	private String modelo;
	
		

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
	public Vehiculo(String matricula, String color, String marca, String modelo) {
		this.setMatricula(matricula);
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {		
		if(Valida(matricula)) {
			this.matricula=matricula;
		}else {
			System.out.println("La matrícula no es válida");
			this.matricula="0000-XXX";
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Metodo Valida
	@Override
	public boolean Valida(String cadena){
		
		return cadena.matches("^[0-9]{4}-[A-Z]{3}$");
	}
}
