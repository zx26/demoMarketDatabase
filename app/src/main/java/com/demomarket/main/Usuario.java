package com.demomarket.main;
import com.orm.*;

public class Usuario extends SugarRecord<Usuario>
{
	String nombre;
	String username;
	boolean master;
	boolean admin;
	boolean prestamista;
	
	public Usuario(){
		
	}
	
	public Usuario(String nombre,String username,boolean master,
	               boolean admin,boolean prestamista){
					   
	    this.nombre=nombre;
		this.username=username;
		this.master=master;
	    this.admin=admin;
		this.prestamista=prestamista;
		
	}
}
