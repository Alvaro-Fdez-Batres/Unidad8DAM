package agenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {
	private ArrayList <Contacto> lista;
	
	
	public Agenda() {
		//Reservamos memoria para el ArrayList que creemos
		this.lista=new ArrayList<>();
	}

	public ArrayList<Contacto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Contacto> lista) {
		this.lista = lista;
	}
	
	public void cargarAgenda(String filename) {
		try {
			//File leo el fichero
			FileInputStream fi=new FileInputStream(filename);
			//Object leo Objetos del fichero
			ObjectInputStream is=new ObjectInputStream(fi);
			Contacto c=null;
			while(is!=null) {
				try {
					
					
					c=(Contacto)is.readObject();
					this.añadirContacto(c);
				
				} catch (Exception e) {
					//Si se lanza la excepción cambiamos la condicion del bucle
					is=null;
				}				
							
			}//while
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}	
	public void guardarAgenda(String filename) {
			//Para escribir siempre FileOutputStream
			
			try {
				FileOutputStream fo=new FileOutputStream(filename);
				ObjectOutputStream os;
				
				os = new ObjectOutputStream(fo);
				
				for(Contacto c: this.getLista()) {
					//Escribimos cada objeto en el fichero
					os.writeObject(c);
				}
				fo.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	
	public void imprimirAgenda(){
		System.out.println("Los contactos son: ");
		for(Contacto c: this.getLista()) {
			System.out.println(c.getNombre()+" "+c.getTelefono());
		}
	}
	
	public void añadirContacto(Contacto c) {
		this.getLista().add(c);
	}
	
	public void borrarContacto(String nombre) {
		//Recorremos el array List
		for(int i=0; i<this.getLista().size(); i++) {
			if(this.getLista().get(i).getNombre().equalsIgnoreCase(nombre)) {
				this.getLista().remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Agenda agenda=new Agenda();
		Contacto c=new Contacto("Marta","12323","dfsf","marta@ribera");
		Contacto c1=new Contacto("Carlos","34235","fdgsdf","carlos@ribera");
		Contacto c2=new Contacto("Juan","24356","dsa","mjuan@ribera");
		
		agenda.añadirContacto(c);
		agenda.añadirContacto(c1);
		agenda.añadirContacto(c2);
		agenda.guardarAgenda("contactos.bin");
		agenda.getLista().clear();		
		//Cargar los contactos desde el fichero
		agenda.cargarAgenda("contactos.bin");
		agenda.imprimirAgenda();
	}
}
