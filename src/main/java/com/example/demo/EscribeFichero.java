package com.example.demo;

import java.io.*;

/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */

public class EscribeFichero {
	
	private PrintWriter pw;
	
	/**
	 * 
	 * @param fichero ruta del fichero a escribir
	 */	
	public EscribeFichero(String fichero) {
		try {		
		pw = new PrintWriter (new FileWriter(fichero, true));//abrimos sin sobreescribir 
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
		     
	         try{                    
	            if( null != pw ){   
	               pw.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	
	}
		
	}
	
	
	
	

	       


