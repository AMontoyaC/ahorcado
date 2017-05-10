package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class AgregadaCorrectamente extends Activity implements OnTouchListener{

	ImageView agrcorrectamente;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agregadacorrectamente);
		
		agrcorrectamente=(ImageView) findViewById(R.id.agrcorrectamente);
		agrcorrectamente.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		Intent inthome=new Intent(this,Principal.class);
		startActivity(inthome);
		return false;
	}

}
