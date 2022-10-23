package com.demomarket.main;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.*;

public class MainActivity extends Activity 
{
	
	private ListView lista;
	private ArrayList<Prestamo> items;
	private ArrayAdapter adaptador;
	Prestamo prestamo;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		List<Prestamo> prest=Prestamo.listAll(Prestamo.class);
		lista=findViewById(R.id.lista);
		lista.setAdapter(new ArrayAdapter<Prestamo>(this,android.R.layout.simple_list_item_1,prest));
		
		
    }
	
	public void agregar(View view){
		Intent intento = new Intent(getBaseContext(),Datos.class);
		startActivity(intento);
	}
}
