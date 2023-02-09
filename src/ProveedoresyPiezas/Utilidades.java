package ProveedoresyPiezas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {
	
	public ArrayList<Pieza> leerPiezas(String filename){
		ArrayList<Pieza> piezas=new ArrayList<>();
		try {
			Scanner entrada=new Scanner(new File(filename));
			String cadena;
			String linea[];
			//Salto la línea de cabecera
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
//			int codPieza, String nombrePieza, int proveedor, double peso  --> LA PIEZA ES STRING POR ESO LO PASAMOS A INT o DOUBLE
			piezas.add(new Pieza(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Double.parseDouble(linea[3])));
			
			}
			
//			for(Pieza p: piezas)
//				System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return piezas;
	}
	
	
	public ArrayList<Proveedor> leerProveedores(String filename){
		ArrayList<Proveedor> prov=new ArrayList<>();
		try {
			Scanner entrada=new Scanner(new File(filename));
			String cadena;
			String linea[];
			
			//Salto la línea de cabecera			
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			

			prov.add(new Proveedor(Integer.parseInt(linea[0]), linea[1], linea[2]));
			
			}
			
			for(Proveedor p: prov)
				System.out.println(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return prov;
	}
	
	
	
	public static void main(String[] args) {
		Utilidades u=new Utilidades();
		u.leerPiezas("piezas.csv");
		u.leerProveedores("proveedor.csv");
	}
	
	
}
