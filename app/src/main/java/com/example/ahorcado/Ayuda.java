package com.example.ahorcado;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Ayuda extends Activity{

	TextView txtayuda1,txtayuda2,txtayuda3,txtayuda4;
	
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ayuda);
		
		txtayuda1 =(TextView) findViewById(R.id.txtayuda1);
		txtayuda1.setTypeface(Inicio.typeface_chelsea);
		txtayuda2 =(TextView) findViewById(R.id.txtayuda2);
		txtayuda2.setTypeface(Inicio.typeface_chelsea);
		txtayuda3 =(TextView) findViewById(R.id.txtayuda3);
		txtayuda3.setTypeface(Inicio.typeface_chelsea);
		txtayuda4 =(TextView) findViewById(R.id.txtayuda4);
		txtayuda4.setTypeface(Inicio.typeface_chelsea);
	}
	
}
