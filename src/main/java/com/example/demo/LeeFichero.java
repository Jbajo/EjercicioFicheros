package com.example.demo;

import java.io.*;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */

public class LeeFichero {
	
	private File archivo;
	private FileReader fr;
	private BufferedReader br;
	
	/**
	 * 
	 * @param archivo cadena con la ruta del fichero a leer
	 */
	public LeeFichero(String archivo) {
		 try {		
			 System.out.println(archivo);
		this.archivo = new File (archivo);
        fr = new FileReader (this.archivo);
        br = new BufferedReader(fr);
		 }
	      catch(Exception e){
	         e.printStackTrace();
	      }
		 
	}
	
	/**
	 * método para leer el fichero línea a línea
	 */
	
	public void leerFichero() {
		try {
	         
			System.out.println("aqui");
	          // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	   }
	
	/**
	 * metodo para cerrar el fichero de lectura
	 */
	public void cerrarFichero() {
		     try{                    
	            if( null != fr ){   //cerramos el fichero
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	}
		
	
}
