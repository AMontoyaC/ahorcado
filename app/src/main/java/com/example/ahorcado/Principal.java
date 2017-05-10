package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends Activity implements OnClickListener{

	Button btn1jug,btn2jug,btnagrpalabras,btnayuda,btncred;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		
		btn1jug= (Button) findViewById(R.id.btn1jug);
		btn1jug.setTypeface(Inicio.typeface_chelsea);
		btn1jug.setOnClickListener(this);
		
		btn2jug= (Button) findViewById(R.id.btn2jug);
		btn2jug.setTypeface(Inicio.typeface_chelsea);
		btn2jug.setOnClickListener(this);
		
		btnagrpalabras= (Button) findViewById(R.id.btnagrpalabras);
		btnagrpalabras.setTypeface(Inicio.typeface_chelsea);
		btnagrpalabras.setOnClickListener(this);
		
		btnayuda= (Button) findViewById(R.id.btnayuda);
		btnayuda.setTypeface(Inicio.typeface_chelsea);
		btnayuda.setOnClickListener(this);
		
		btncred= (Button) findViewById(R.id.btncreditos);
		btncred.setTypeface(Inicio.typeface_chelsea);
		btncred.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
			case R.id.btn1jug:
				Intent intjug1=new Intent(this,Categorias.class);
				startActivity(intjug1);
				break;
				
			case R.id.btn2jug:
				Intent intjug2=new Intent(this,JugsIngreso.class);
				startActivity(intjug2);
				break;
				
			case R.id.btnagrpalabras:
				Intent intagrcat=new Intent(this,Agregar_Palabras_Categorias.class);
				startActivity(intagrcat);
				break;
				
			case R.id.btnayuda:
				Intent intayuda=new Intent(this,Ayuda.class);
				startActivity(intayuda);
				break;
				
			case R.id.btncreditos:	
				Intent intcred=new Intent(this,Creditos.class);
				startActivity(intcred);
				break;
		}
	}
}
