package com.example.demo;

import java.io.*;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */

public class EscribeFichero {
	
	private FileWriter fichero;
	private PrintWriter pw;
	
	/**
	 * 
	 * @param fichero ruta del fichero a escribir
	 */	
	public EscribeFichero(String fichero) {
		try {
		this.fichero = new FileWriter(fichero, true); //lo abrimos sin sobreescribir el fichero
		pw = new PrintWriter (this.fichero);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param frase a añadir en el fichero
	 */
	
	public void EscribirFichero (String frase) {
		
		        try
		        {
		          pw.println(frase);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } 
		    }
	/**
	 * metodo para cerrar el fichero de escritura
	 */
	public void cerrarFichero() {
		     // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != pw ){   
	               pw.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	
	}
		
	}
	
	
	
	

	       


