package com.example.ahorcado;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Creditos extends Activity{

	TextView txtcreditos1,txtcreditos_app,txtcreditos_musica,txtcreditos2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creditos);
		txtcreditos1 =(TextView) findViewById(R.id.txtcreditos1);
		txtcreditos1.setTypeface(Inicio.typeface_chelsea);
		txtcreditos_app =(TextView) findViewById(R.id.txtcreditos_app);
		txtcreditos_app.setTypeface(Inicio.typeface_chelsea);
		txtcreditos_musica =(TextView) findViewById(R.id.txtcreditos_musica);
		txtcreditos_musica.setTypeface(Inicio.typeface_chelsea);
		txtcreditos2 =(TextView) findViewById(R.id.txtcreditos2);
		txtcreditos2.setTypeface(Inicio.typeface_chelsea);
	}
}
