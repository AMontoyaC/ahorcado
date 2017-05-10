package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Pasar extends Activity implements OnTouchListener{

	ImageView pasar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pasar);
		
		pasar=(ImageView) findViewById(R.id.pasar);
		pasar.setOnTouchListener(this);
		
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		if(JugsIngreso.numjug==1)
		{
			Intent intturno2=new Intent(this,Jug2Adivinar.class);
			startActivity(intturno2);
		}
		else
		{
			Intent intturno1=new Intent(this,Jug1Adivinar.class);
			startActivity(intturno1);
		}
		
		return false;
	}

	

	

}
