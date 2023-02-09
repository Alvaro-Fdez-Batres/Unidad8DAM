package federicoGarciaLorca;

public abstract class Persona implements Valida{
	private String DNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	private String email;
	
	
	
	public Persona() {
		DNI = "";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.direccion = "";
		this.email = "";
	}

	public static void main(String[] args) {
		Cliente c=new Cliente("11111111A", "Alvaro", "Fernandez", 24, "Calle", "alvaro@gmail.com");
		System.out.println(c.Valida(c.getDNI()));
	}
	
	public boolean Valida(String cadena) {
		
		char[]letrasDNI= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int posicion= Integer.parseInt(cadena.substring(0,7))%23;
		char letra=letrasDNI[posicion];
		
		if(cadena.matches("^[0-9]{8}[A-Z]{1}$") && letra==letrasDNI[posicion]){
			return true;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}

	public Persona(String dNI, String nombre, String apellidos, int edad, String direccion, String email) {
		this.setDNI(dNI);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		if(Valida(dNI)) {
			this.DNI=dNI;
			System.out.println("El DNI es válido");
		}else {
			System.out.println("El DNI no es válido");
			this.DNI="11111111X";
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
