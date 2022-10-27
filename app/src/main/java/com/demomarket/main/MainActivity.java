package com.demomarket.main;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.*;
import android.widget.AdapterView.*;

public class MainActivity extends Activity 
{
	
	private ListView lista;
	private ArrayList<Prestamo> items;
	private ArrayAdapter adaptador;
	Prestamo prestamo;
	PrestamosDatos presDat;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		List<Prestamo> prest=Prestamo.listAll(Prestamo.class);
		ArrayList<String> prestArray=new ArrayList<String>();
		for(Prestamo prestamo:prest){
			prestArray.add(prestamo.nombre);
		}
		lista=findViewById(R.id.lista);
		lista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,prestArray));
		lista.setOnItemClickListener(new OnItemClickListener(){
			
			public void onItemClick(AdapterView<?> p1, View view, int pos, long log){
				
				  
					  
				        long posicion= pos;
				        Intent intentoDatos= new Intent(getBaseContext(),PrestamosDatos.class);
				        intentoDatos.putExtra("posicion",posicion);
				        startActivity(intentoDatos);
						
				  
			}
		});
		
		
    }
	
	public void agregar(View view){
		Intent intento = new Intent(getBaseContext(),Datos.class);
		startActivity(intento);
	}
	
	public void borrar(View view){
		Prestamo.deleteAll(Prestamo.class);
		Intent intent = new Intent(getBaseContext(),MainActivity.class);
		startActivity(intent);
	}
	
	
}
