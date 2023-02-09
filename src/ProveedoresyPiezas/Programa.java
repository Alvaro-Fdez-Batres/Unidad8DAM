package ProveedoresyPiezas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Programa {
	ArrayList<Proveedor> prov;
	ArrayList<Pieza> piezas;
	
	
	public Programa() {
		this.piezas=new ArrayList<>();
		this.prov=new ArrayList<>();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Programa [prov=" + prov + ", piezas=" + piezas + "]";
	}




	public ArrayList<Proveedor> getProv() {
		return prov;
	}




	public void setProv(ArrayList<Proveedor> prov) {
		this.prov = prov;
	}




	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}




	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}




	public static void main(String[] args) {
		Programa p=new Programa();
		Utilidades u=new Utilidades();
		p.setPiezas(u.leerPiezas("piezas.csv"));
		p.setProv(u.leerProveedores("proveedor.csv"));
		
		
		p.generarFichero("proveedorPiezas.txt");
	}




	private void generarFichero(String filename) {
		double peso=0;
		try {
			PrintWriter salida=new PrintWriter(new File(filename));
			for(Proveedor prov: this.getProv()) {
				System.out.println("El proveedor "+prov.getNombreProveedor()+" suministra:");
				peso=0;
				for(Pieza pie: this.getPiezas()) {
					
					//Para ver el peso de cada pieza
					if(prov.getCodProveedor()==pie.getProveedor()) {
						peso=peso+pie.getPeso();
						System.out.println("\t*)"+Character.toUpperCase(pie.getNombrePieza().charAt(0))+pie.getNombrePieza().substring(1));
						salida.println("El proveedor "+prov.getNombreProveedor()+" suministra: ");
						salida.println("\t"+pie.getNombrePieza());
					}					
				}
				salida.println("Peso total: "+peso);
			}
			
			salida.flush();
			salida.close();
			System.out.println("Fichero creado");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
