package com.example.asteroides;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.asteriodes.R;

public class Asteroides extends Activity {

	private Button bAcercaDe;
	private Button bSalir;
	private Button bPuntuacion;
	
	public static AlmacenPuntuaciones almacen = new AlmacenPuntuacionesArray();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Cuando se presiona el boton Acerca de, se llama al metodo
		// lanzarAcercaDe
		bAcercaDe = (Button) findViewById(R.id.b_acercaDe);
		bAcercaDe.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				lanzarAcercaDe(null);
			}
		});

		// cuando se presiona el boton salir, sale de la actividad
		bSalir = (Button) findViewById(R.id.b_salir);
		bSalir.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		// cuando se prsiona el boton de puntuaciones.
		bPuntuacion = (Button) findViewById(R.id.b_puntuacion);
		bPuntuacion.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				lanzarPuntuaciones(null);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
//		MenuInflater inflater = getMenuInflater();
//		inflater.inflate(R.menu.menu, menu);
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
		/** true -> el menú ya está visible */
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.m_acercaDe:
			lanzarAcercaDe(null);
			break;
		case R.id.m_config:
			lanzarPreferencias(null);
			break;
		}
		return true;
		/** true -> consumimos el item, no se propaga */
	}

	public void lanzarAcercaDe(View view) {
		Intent i = new Intent(this, AcercaDe.class);
		startActivity(i);
	}

	public void lanzarPreferencias(View view) {
		Intent i = new Intent(this, Preferencias.class);
		startActivity(i);
	}
	
	public void lanzarPuntuaciones(View view){
		Intent i = new Intent(this, Puntuaciones.class);
		startActivity(i);
	}

}
