package com.demomarket.main;
import android.app.*;
import android.os.*;
import android.widget.*;

public class PrestamosDatos extends Activity
{
	Prestamo prestamos;
	
	TextView texto1,texto2,texto3,texto4;
	
	public PrestamosDatos(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		prestamos= new Prestamo();
		Bundle bundle = getIntent().getExtras();
		long posicion = bundle.getLong("posicion");
		prestamos.findById(Prestamo.class,posicion);
		
		
		texto1 = new TextView(getBaseContext());
		texto1.setText(prestamos.nombre);
		
		texto2 = new TextView(getBaseContext());
		texto2.setText(prestamos.prestamoMotivo);
		
		texto3 = new TextView(getBaseContext());
		texto3.setText(prestamos.cantidad);
		
		texto4 = new TextView(getBaseContext());
		texto4.setText(prestamos.dirección);
		
	}
	
	
}
