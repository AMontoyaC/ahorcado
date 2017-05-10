package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Puntaje2Jugs extends Activity implements OnClickListener{

	Button btnhome;
	TextView nombrejug1,nombrejug2,puntajejug1,puntajejug2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntaje2jugs);

		btnhome=(Button) findViewById(R.id.btnhome);
		btnhome.setOnClickListener(this);
		
		nombrejug1=(TextView) findViewById(R.id.nombrejug1);
		nombrejug1.setTypeface(Inicio.typeface_chelsea);
		
		nombrejug2=(TextView) findViewById(R.id.nombrejug2);
		nombrejug2.setTypeface(Inicio.typeface_chelsea);
		
		puntajejug1=(TextView) findViewById(R.id.puntajejug1);
		puntajejug1.setTypeface(Inicio.typeface_chelsea);
		
		puntajejug2=(TextView) findViewById(R.id.puntajejug2);
		puntajejug2.setTypeface(Inicio.typeface_chelsea);

		nombrejug1.setText("Jugador: "+JugsIngreso.nombrejug1);
		nombrejug2.setText("Jugador: "+JugsIngreso.nombrejug2);
		String s=String.valueOf(JugsIngreso.puntaje1);
		String s2=String.valueOf(JugsIngreso.puntaje2);
		puntajejug1.setText("Puntaje: "+s2);
		puntajejug2.setText("Puntaje:" +s);
		JugsIngreso.numjug=1;
		JugsIngreso.puntaje1=200;
		JugsIngreso.puntaje2=200;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.btnhome:
				Intent inthome=new Intent(this,Principal.class);
				startActivity(inthome);
				break;
		}
		
	}

	
	
}
