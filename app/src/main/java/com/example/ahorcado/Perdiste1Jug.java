package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class Perdiste1Jug extends Activity implements OnTouchListener{

	ImageView perdiste,perdedor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perdiste);
		
		perdiste=(ImageView) findViewById(R.id.perdiste);
		perdiste.setOnTouchListener(this);
		
		perdedor=(ImageView) findViewById(R.id.perdedor);
		perdedor.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		Intent intpuntaje=new Intent(this,Puntaje1Jug.class);
		startActivity(intpuntaje);
		
		return false;
	}
	
}
