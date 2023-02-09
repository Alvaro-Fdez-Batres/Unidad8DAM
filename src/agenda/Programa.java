package agenda;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		//1)Imprimir agenda
		//2)Añadir contacto
		//3)Eliminar contacto
		//4)Salir
		
		Agenda a=new Agenda();
		a.cargarAgenda("contactos.bin");
		menu();
		int opcion=0;
		
		
		do {
			menu();
			System.out.println("Elige una opcion:");
			opcion=tec.nextInt();
			
			switch(opcion) {
			case 1:
				a.imprimirAgenda();
				break;
			case 2:
//				System.out.println("Datos del contacto");
//				System.out.println("Nombre");
//				String nombre=tec.next();
//				System.out.println("Telefono");
//				String telefono=tec.next();
//				System.out.println("Dirección");
//				String dir=tec.next();
//				System.out.println("Correo");
//				String email=tec.next();
//				a.añadirContacto(new Contacto(nombre, telefono, dir, email));
				Contacto c=new Contacto();
				System.out.println("Datos del contacto:");
				System.out.println("Nombre");
				c.setNombre(tec.next());
				System.out.println("Telefono");
				c.setTelefono(tec.next());
				System.out.println("Dirección");
				c.setDireccion(tec.next());
				System.out.println("Correo");
				c.setCorreo(tec.next());
				a.añadirContacto(c);
				break;
			case 3:
				System.out.println("Dame el nombre del contacto");
				String n=tec.next();
				a.borrarContacto(n);
				break;
			case 4:
				a.guardarAgenda("contactos.bin");
				break;
			}
		}while(opcion!=4);
	

	}

	private static void menu() {
		System.out.println("1.Imprimir agenda");
		System.out.println("2.Añadir contacto");
		System.out.println("3.Eliminar contacto");
		System.out.println("4.Salir");
		
	}

}
