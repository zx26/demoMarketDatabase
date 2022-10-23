package com.demomarket.main;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.preference.*;
import android.view.*;
import android.content.*;

public class Datos extends Activity
{
	private EditText nombreTexto;
	private EditText cantidadTexto;
	private EditText motivoTexto;
	private EditText direccionTexto;
	Prestamo prestamo;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
		
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datos);
		
		nombreTexto=findViewById(R.id.nombreTexto);
		cantidadTexto=findViewById(R.id.cantidadTexto);
		motivoTexto=findViewById(R.id.motivoTexto);
		direccionTexto=findViewById(R.id.direccionTexto);
		prestamo = new Prestamo();
	}
	
	public void agregarDatos(View view){
		prestamo.nombre=nombreTexto.getText().toString();
		prestamo.save();
		
		Intent intento= new Intent(getBaseContext(),MainActivity.class);
		startActivity(intento);
	}
	
	

}
