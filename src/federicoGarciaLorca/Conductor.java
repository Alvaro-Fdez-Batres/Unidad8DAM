package federicoGarciaLorca;

import java.util.ArrayList;

public class Conductor extends Persona{
	private String codigo;
	private int turno;;
	
	

	public Conductor() {
		this.codigo = "";
		this.turno = 0;
	}
	
	
	
	public Conductor(String dNI, String nombre, String apellidos, int edad, String direccion, String email,
			String codigo, int turno) {
		super(dNI, nombre, apellidos, edad, direccion, email);
		this.codigo = codigo;
		this.turno = turno;
	}

	

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
//		if(turno==1) {
//			System.out.println("Tienes el turno de mañana");
//		}
//		if(turno==2) {
//			System.out.println("Tienes el turno de tarde");
//		}
//		if(turno==3) {
//			System.out.println("Tienes el turno de tarde");
//		}
		this.turno = turno;
	}
		
	
}
