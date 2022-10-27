package com.demomarket.main;
import android.app.*;
import android.os.*;
import android.widget.*;
import java.util.*;

public class PrestamosDatos extends Activity
{
	Prestamo prestamos;
	
	TextView texto1,texto2,texto3,texto4;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prestamos_datos);


		Bundle bundle = getIntent().getExtras();
		int posicion =  (int)bundle.getLong("posicion");
		List<Prestamo> prest=Prestamo.listAll(Prestamo.class);
		ArrayList<String> prestNombre=new ArrayList<String>();
		for(Prestamo prestamo:prest){
			prestNombre.add(prestamo.nombre);
		}
		
		ArrayList<String> prestCantidad=new ArrayList<String>();
		for(Prestamo prestamo:prest){
			prestCantidad.add(prestamo.cantidad);
		}
		
		ArrayList<String> prestMotivo=new ArrayList<String>();
		for(Prestamo prestamo:prest){
			prestMotivo.add(prestamo.prestamoMotivo);
		}
		
		ArrayList<String> prestDireccion=new ArrayList<String>();
		for(Prestamo prestamo:prest){
			prestDireccion.add(prestamo.dirección);
		}

		texto1 = (TextView)findViewById(R.id.texto1);
		 
		texto1.setText("Nombre: "+prestNombre.get(posicion));

		texto2 = (TextView)findViewById(R.id.texto2);
		texto2.setText("Cantidad: "+prestCantidad.get(posicion)+"$");

		texto3 = (TextView)findViewById(R.id.texto3);
		texto3.setText("Motivo: "+prestMotivo.get(posicion));

		texto4 = (TextView)findViewById(R.id.texto4);
	    texto4.setText("Dirección: "+prestDireccion.get(posicion));
		
	}
	
	
	
	
}
