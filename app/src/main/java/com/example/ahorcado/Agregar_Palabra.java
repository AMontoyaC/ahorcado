package com.example.ahorcado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Agregar_Palabra extends Activity implements OnClickListener{

	private Typeface f1;
	EditText txtpalabra;
	Button btnagregar;
	String palabra;
	int totalletras=0;
	String txtarchivo="";
	TextView txtmsj;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agregar_palabra);

		f1= Typeface.createFromAsset(getAssets(),  "fonts/ChelseaMarket-Regular.ttf");
		
		txtpalabra=(EditText) findViewById(R.id.txtpalabra);
		txtpalabra.setTypeface(f1);
		
		txtmsj=(TextView) findViewById(R.id.txtmsj);
		txtmsj.setTypeface(f1);
		
		btnagregar=(Button) findViewById(R.id.btnagregar);
		btnagregar.setTypeface(f1);
		btnagregar.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

        palabra=txtpalabra.getText().toString();
        
        if(palabra.equals("")){
        	Toast toast = Toast.makeText(this, "No haz ingresado una palabra", Toast.LENGTH_LONG);
	        toast.show(); 
        }else{
        	escribir();
        }
        
        Intent intagrcorrectamente=new Intent(this,AgregadaCorrectamente.class);
        startActivity(intagrcorrectamente);
	}
	
	public void escribir(){
		
		FileOutputStream fout=null;
		try{
			fout=openFileOutput(Agregar_Palabras_Categorias.categoria,MODE_APPEND);
			OutputStreamWriter ows=new OutputStreamWriter(fout);
			ows.write("-"+palabra+"/");
			ows.flush();
			ows.close();
			
		}catch(IOException e){}
		
	}
}
