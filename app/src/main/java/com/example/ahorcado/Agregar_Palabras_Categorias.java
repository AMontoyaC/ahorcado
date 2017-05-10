package com.example.ahorcado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Agregar_Palabras_Categorias extends Activity implements OnClickListener{

	Button btnagrciudadespaises,btnagrcomida,btnagrdisney,btnagrdeportes,btnagrmarcas,btnagrPeliculasSeries,btnagrmusica,btnagrpersonajes;
	public static String categoria="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agregar_palabras_categorias);
		
		btnagrciudadespaises=(Button) findViewById(R.id.btnagrciudadespaises);
		btnagrciudadespaises.setTypeface(Inicio.typeface_chelsea);
		btnagrciudadespaises.setOnClickListener(this);
		
		btnagrcomida=(Button) findViewById(R.id.btnagrcomida);
		btnagrcomida.setTypeface(Inicio.typeface_chelsea);
		btnagrcomida.setOnClickListener(this);
		
		btnagrdisney=(Button) findViewById(R.id.btnagrdisney);
		btnagrdisney.setTypeface(Inicio.typeface_chelsea);
		btnagrdisney.setOnClickListener(this);
		
		btnagrdeportes=(Button) findViewById(R.id.btnagrdeportes);
		btnagrdeportes.setTypeface(Inicio.typeface_chelsea);
		btnagrdeportes.setOnClickListener(this);
		
		btnagrmarcas=(Button) findViewById(R.id.btnagrmarcas);
		btnagrmarcas.setTypeface(Inicio.typeface_chelsea);
		btnagrmarcas.setOnClickListener(this);
		
		btnagrPeliculasSeries=(Button) findViewById(R.id.btnagrPeliculasSeries);
		btnagrPeliculasSeries.setTypeface(Inicio.typeface_chelsea);
		btnagrPeliculasSeries.setOnClickListener(this);
		
		btnagrmusica=(Button) findViewById(R.id.btnagrmusica);
		btnagrmusica.setTypeface(Inicio.typeface_chelsea);
		btnagrmusica.setOnClickListener(this);
		
		btnagrpersonajes=(Button) findViewById(R.id.btnagrpersonajes);
		btnagrpersonajes.setTypeface(Inicio.typeface_chelsea);
		btnagrpersonajes.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
			case R.id.btnagrciudadespaises:
				categoria="ciudadespaises.txt";
				break;
				
			case R.id.btnagrcomida:
				categoria="comida.txt";
				break;
				
			case R.id.btnagrdisney:
				categoria="disney.txt";
				break;
				
			case R.id.btnagrdeportes:
				categoria="deportes.txt";
				break;
				
			case R.id.btnagrmarcas:
				categoria="marcas.txt";
				break;
				
			case R.id.btnagrPeliculasSeries:
				categoria="peliculasseries.txt";
				break;
				
			case R.id.btnagrmusica:
				categoria="musica.txt";
				break;
				
			case R.id.btnagrpersonajes:
				categoria="personajes.txt";
				break;
		
		}
		
		Intent intagr=new Intent(this,Agregar_Palabra.class);
		startActivity(intagr);
		
	}
	
	
	
	

}
