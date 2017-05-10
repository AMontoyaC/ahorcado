package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class Jug2Adivinar extends Activity implements OnTouchListener{

	ImageView jug2adivinar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jug2adivinar);
		
		jug2adivinar=(ImageView) findViewById(R.id.jug2adivinar);
		jug2adivinar.setOnTouchListener(this);
		
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		Intent intjug2=new Intent(this,Jugadores2.class);
		startActivity(intjug2);
		return false;
	}



}
