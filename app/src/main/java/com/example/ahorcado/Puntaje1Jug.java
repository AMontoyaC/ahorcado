package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Puntaje1Jug extends Activity implements OnClickListener{

	Button btnhomepun1jug;
	TextView nombre1jug,puntaje1jug,palabra1jug;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntaje1jug);

		btnhomepun1jug=(Button) findViewById(R.id.btnhomepun1jug);
		btnhomepun1jug.setOnClickListener(this);
		
		nombre1jug=(TextView) findViewById(R.id.nombre1jug);
		nombre1jug.setTypeface(Inicio.typeface_chelsea);
		
		puntaje1jug=(TextView) findViewById(R.id.puntaje1jug);
		puntaje1jug.setTypeface(Inicio.typeface_chelsea);
		
		palabra1jug=(TextView) findViewById(R.id.palabra1jug);
		palabra1jug.setTypeface(Inicio.typeface_chelsea);


		String s=String.valueOf(Jugador1.puntaje1jug);
		String s2=String.valueOf(Jugador1.palabraPuntaje);
		puntaje1jug.setText(s);
		palabra1jug.setText("La palabra era: "+s2);
		Jugador1.puntaje1jug=200;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		case R.id.btnhomepun1jug:
			Intent inthome=new Intent(this,Principal.class);
			startActivity(inthome);
			break;
	}
		
	}

}
