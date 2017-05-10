package com.example.ahorcado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Categorias extends Activity implements OnClickListener{
	
	Button btnciudadespaises,btncomida,btndisney,btndeportes,btnmarcas,btnPeliculasSeries,btnmusica,btnpersonajes;
	public static String catadivinar;
	public static String palabra=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categorias);
		
		btnciudadespaises=(Button) findViewById(R.id.btnciudadespaises);
		btnciudadespaises.setTypeface(Inicio.typeface_chelsea);
		btnciudadespaises.setOnClickListener(this);
		
		btncomida=(Button) findViewById(R.id.btncomida);
		btncomida.setTypeface(Inicio.typeface_chelsea);
		btncomida.setOnClickListener(this);
		
		btndisney=(Button) findViewById(R.id.btndisney);
		btndisney.setTypeface(Inicio.typeface_chelsea);
		btndisney.setOnClickListener(this);
		
		btndeportes=(Button) findViewById(R.id.btndeportes);
		btndeportes.setTypeface(Inicio.typeface_chelsea);
		btndeportes.setOnClickListener(this);
		
		btnmarcas=(Button) findViewById(R.id.btnmarcas);
		btnmarcas.setTypeface(Inicio.typeface_chelsea);
		btnmarcas.setOnClickListener(this);
		
		btnPeliculasSeries=(Button) findViewById(R.id.btnPeliculasSeries);
		btnPeliculasSeries.setTypeface(Inicio.typeface_chelsea);
		btnPeliculasSeries.setOnClickListener(this);
		
		btnmusica=(Button) findViewById(R.id.btnmusica);
		btnmusica.setTypeface(Inicio.typeface_chelsea);
		btnmusica.setOnClickListener(this);
		
		btnpersonajes=(Button) findViewById(R.id.btnpersonajes);
		btnpersonajes.setTypeface(Inicio.typeface_chelsea);
		btnpersonajes.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch(v.getId()){
			case R.id.btnciudadespaises:
				catadivinar="ciudadespaises.txt";
				break;
				
			case R.id.btncomida:
				catadivinar="comida.txt";
				break;
				
			case R.id.btndisney:
				catadivinar="disney.txt";
				break;
				
			case R.id.btndeportes:
				catadivinar="deportes.txt";
				break;
				
			case R.id.btnmarcas:
				catadivinar="marcas.txt";
				break;
				
			case R.id.btnPeliculasSeries:
				catadivinar="peliculasseries.txt";
				break;
				
			case R.id.btnmusica:
				catadivinar="musica.txt";
				break;
				
			case R.id.btnpersonajes:
				catadivinar="personajes.txt";
				break;
		}
		
		Intent intjug1=new Intent(this,Jugador1.class);
		startActivity(intjug1);
	}
	

	public void leer(){
		try{
			BufferedReader ficheroEntrada=new BufferedReader(new FileReader("/ahorcado/res/raw/comida.txt"));
			
			String linea=null;
			String total="";
			int totalletras=0;
			
			while((linea=ficheroEntrada.readLine())!=null)
            {
                total=total+linea;
            }
			
			totalletras=total.length();
			
			String s="";
			
			int r=(int)(Math.random()*totalletras-1);
            
            while(total.charAt(r)!='-')
                r=(int)(Math.random()*totalletras-1);
            
            if(total.charAt(r)=='-')
            {
                int x=r+1;
                while((total.charAt(x)!='/'))
                    x++;
                
                if(total.charAt(x)=='/')
                {
                    int y=r+1;
                    while(y<x){
                        s=s+total.charAt(y);
                        y++;
                    }
                }
            }
            
            palabra=s;
            s="";
            
			ficheroEntrada.close();
			
		}catch(Exception e){}
	}

}
