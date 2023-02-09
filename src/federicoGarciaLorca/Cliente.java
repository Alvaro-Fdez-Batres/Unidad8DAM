package federicoGarciaLorca;

import java.util.ArrayList;

public class Cliente extends Persona{
	private double horaLlegada;
	private double diasEstancia;
	
	
	//Constructor sin parámetros
	public Cliente(String dNI, String nombre, String apellidos, int edad, String direccion, String email) {
		super(dNI, nombre, apellidos, edad, direccion, email);
		this.horaLlegada = 0;
		this.diasEstancia = 0;
	}

	
	
	
	@Override
	public String toString() {
		return "Cliente [horaLlegada=" + horaLlegada + ", diasEstancia=" + diasEstancia + ", misVehiculos="
				+ misVehiculos + ", getHoraLlegada()=" + getHoraLlegada() + ", getDiasEstancia()=" + getDiasEstancia()
				+ ", getMisVehiculos()=" + getMisVehiculos() + ", toString()=" + super.toString() + ", getDNI()="
				+ getDNI() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()="
				+ getEdad() + ", getDireccion()=" + getDireccion() + ", getEmail()=" + getEmail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}




	public Cliente(String dNI, String nombre, String apellidos, int edad, String direccion, String email,
			double horaLlegada, double diasEstancia, ArrayList<Vehiculo> misVehiculos) {
		super(dNI, nombre, apellidos, edad, direccion, email);
		this.horaLlegada = horaLlegada;
		this.diasEstancia = diasEstancia;

	}




	public double getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(double horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public double getDiasEstancia() {
		return diasEstancia;
	}

	public void setDiasEstancia(double diasEstancia) {
		this.diasEstancia = diasEstancia;
	}

	
	

	
}
