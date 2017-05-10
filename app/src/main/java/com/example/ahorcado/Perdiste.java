package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class Perdiste extends Activity implements OnTouchListener{

	ImageView perdiste,perdedor;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perdiste);
		
		Jugadores2.sound2jugs.stop();
		
		perdiste=(ImageView) findViewById(R.id.perdiste);
		perdiste.setOnTouchListener(this);
		
		perdedor=(ImageView) findViewById(R.id.perdedor);
		perdedor.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		if(Jugadores2.bandJugar2==true&&JugsIngreso.numjug==1){
			JugsIngreso.numjug=2;
			Intent intjug2=new Intent(this,JugsIngreso.class);
			startActivity(intjug2);
		}
		else{
			if(Jugadores2.bandJugar2==false){
				Intent inthome=new Intent(this,Principal.class);
				startActivity(inthome);
			}
			else
			{
				Intent intpuntaje=new Intent(this,Puntaje2Jugs.class);
				startActivity(intpuntaje);
			}
		}
		return false;
	}
	
}
