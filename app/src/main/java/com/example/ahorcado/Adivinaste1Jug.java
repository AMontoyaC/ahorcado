package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Adivinaste1Jug extends Activity implements OnTouchListener{

	ImageView adivinaste,ganador;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adivinaste);
		
		adivinaste=(ImageView) findViewById(R.id.adivinaste);
		adivinaste.setOnTouchListener(this);
		
		ganador=(ImageView) findViewById(R.id.ganador);
		ganador.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		
			Intent intpuntaje1jug=new Intent(this,Puntaje1Jug.class);
			startActivity(intpuntaje1jug);
		
		return false;
	}

	
	
}
