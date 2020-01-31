/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuela.arep.app;
import java.io.*;
import java.net.*;
/**
 *
 * @author santiago.vega-r
 */
public class urlComponents {
    public static void main( String[] args ) throws MalformedURLException
    {
       URL url =new URL("https://es.wikipedia.org:80/wiki/GitHub?a=0#Caracter%C3%ADsticas");
       System.out.println("Authority: "+url.getAuthority());
       System.out.println("Protocol: "+url.getProtocol());
       System.out.println("Host: "+url.getHost());
       System.out.println("Port: "+url.getPort());
       System.out.println("Path: "+url.getPath());
       System.out.println("Query: "+url.getQuery());
       System.out.println("File: "+url.getFile());
       System.out.println("Ref: "+url.getRef());
       

    }
    
    
}
