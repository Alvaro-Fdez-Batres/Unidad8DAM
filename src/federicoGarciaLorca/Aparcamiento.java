package federicoGarciaLorca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aparcamiento {
	public final static double precioCoche=10;
	public final static double precioMoto=5;
	public final static double precioFurgoneta=15;
	
	
	
	
//	public Aparcamiento (ArrayList<Conductor> listaConductores) {
//		
//	}




	
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int opcion=0;
		do {
			menu();
			System.out.println("Elige una opción");
			opcion=tec.nextInt();
			switch(opcion) {
				case 0:
					System.out.println("Has salido del programa");
					break;
					
				case 1:
					leerConductores();
					break;
					
				case 2:
					darAltaCliente();
					break;
					
				case 3:
					guardarClientes();
					break;
					
				case 4:
					leerClientes();
					break;
					
				case 5:
					generarTickets();
					break;
					
				case 6:
					imprimirTurno();
					break;
			}
		}while(opcion!=0);
	}

	private static void leerClientes() {
		
		
	}

	private static void imprimirTurno() {
		
		
	}

	private static void generarTickets() {
		
		
	}

	private static void guardarClientes() {
		
		
	}

	private static void darAltaCliente() {
		Scanner tec=new Scanner(System.in);
//		Cliente cli=new Cliente();
		
		System.out.println("Dime tu nombre");
		String nombre=tec.next();
		System.out.println("Dime tu apellido");
		String apellido=tec.next();
		System.out.println("Dime tu dni");
		String dni=tec.next();
		System.out.println("Dime tu edad");
		int edad=tec.nextInt();
		System.out.println("Dime tu direccion");
		String direccion=tec.next();
		System.out.println("Dime cuantos dias vas a reservar");
		int diasEstancia=tec.nextInt();
		System.out.println("¿A qué hora efectuará su llegada?");
		double horaLlegada=tec.nextDouble();
		}

	private static void leerConductores() {
		try {
			Scanner entrada=new Scanner(new File("conductor.csv"));
			String cadena="";
			String linea[];
			
			entrada.nextLine();			
			while(entrada.hasNext()) {
				Conductor c=new Conductor();
				cadena=entrada.nextLine();
				linea=cadena.split(";");
				c.setCodigo(linea[0]);
				c.setTurno(Integer.parseInt(linea[1]));
				c.setDNI(linea[2]);
				c.setNombre(linea[3]);
				c.setApellidos(linea[4]);
				c.setEdad(Integer.parseInt(linea[5]));
				c.setDireccion(linea[6]);
				c.setEmail(linea[7]);
				
				c.getListaConductores().add(c);
				System.out.println(c.getListaConductores());
			}
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void menu() {
		System.out.println("0.Salir");
		System.out.println("1.Leer conductores");
		System.out.println("2.Dar de alta cliente");
		System.out.println("3.Guardar clientes");
		System.out.println("4.Leer clientes");
		System.out.println("5.Generar Tickets");
		System.out.println("6.Imprimir turno de entrega");
	}
}
