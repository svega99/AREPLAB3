/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuela.arep.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.*;
import java.net.*;
/**
 *
 * @author santiago.vega-r
 */
public class Browser {
    
    
    
    public static void main( String[] args ) throws IOException
    {
    	
    	String nombre;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una URL: ");
        nombre = teclado.nextLine();
    	
    	URL google = new URL(nombre);
    	
    	String page="";
    	 
    	FileOutputStream fos = new FileOutputStream("resultado.html");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        
    	
         try (BufferedReader reader= new BufferedReader(new InputStreamReader(google.openStream()))) {
                 String inputLine = null;
                while ((inputLine = reader.readLine()) != null) {
                    page=page+inputLine;
                }
        } catch (IOException x) {
            System.err.println(x);
         
       }
         System.out.println(page);
         oos.writeUTF(page);


         oos.close();
         fos.close();
         
         

    }
}
