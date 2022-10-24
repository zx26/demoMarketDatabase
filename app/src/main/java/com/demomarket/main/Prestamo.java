package com.demomarket.main;
import com.orm.*;

public class Prestamo extends SugarRecord
{
	String nombre;
	
	String prestamoMotivo;
	String cantidad;
	String dirección;
	String mensaje;
	
	//boolean master;
	//boolean admin;
	//boolean prestamista;
	
	public Prestamo(){
		
	}
	
	public Prestamo(String nombre,String prestamoMotivo,
	               String cantidad,String dirección){
					   
	    this.nombre=nombre;
		
		this.prestamoMotivo=prestamoMotivo;
	    this.cantidad=cantidad;
		this.dirección=dirección;
		
		this.save();
		
   }

   @Override
   public String toString()
   {
	   // TODO: Implement this method
	   return nombre;
   }
	

}
