package com.example.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JugsIngreso extends Activity implements OnClickListener{

	public static MediaPlayer soundespera;
	Button btnlisto;
	TextView txtingnombre,txtingpalabra;
	EditText ingnombre,ingpalabra;
	public static String nombrejug1="",nombrejug2="",palabra;
	public static int puntaje1=0,puntaje2=0;
	public static int numjug=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jugsingreso);
		
		txtingnombre=(TextView) findViewById(R.id.txtingnombre);
		txtingnombre.setTypeface(Inicio.typeface_chelsea);
		
		txtingpalabra=(TextView) findViewById(R.id.txtingpalabra);
		txtingpalabra.setTypeface(Inicio.typeface_chelsea);
		
		ingnombre=(EditText) findViewById(R.id.ingnombre);
		ingnombre.setTypeface(Inicio.typeface_chelsea);
		
		ingpalabra=(EditText) findViewById(R.id.ingpalabra);
		ingpalabra.setTypeface(Inicio.typeface_chelsea);
		
		btnlisto=(Button) findViewById(R.id.btnlisto);
		btnlisto.setTypeface(Inicio.typeface_chelsea);
		btnlisto.setOnClickListener(this);
		
		if(soundespera!=null)
			soundespera.release();
		
		soundespera=MediaPlayer.create(this,R.raw.musicaespera);
		soundespera.seekTo(0);
		soundespera.start();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		boolean escritacorrecto=false;
		
		if(numjug==1)
			nombrejug1=ingnombre.getText().toString();
		if(numjug==2)
			nombrejug2=ingnombre.getText().toString();
		
		palabra=ingpalabra.getText().toString();
		
		if(!palabra.equals("") && (palabra.length() >= 2)){
			if(!ingnombre.getText().toString().equals("")){
				
				escritacorrecto=esPalabraCaracteres(palabra);
				
				if(escritacorrecto==true){
					Intent intpasar=new Intent(this,Pasar.class);
					startActivity(intpasar);
					escritacorrecto=false;
				}
				else{
					Toast toast = Toast.makeText(this, "Por favor revisa la palabra\n Sólo carácteres de A-Z", Toast.LENGTH_LONG);
			        toast.show();
				}
			}
		}
		else{
			Toast toast;
			if(palabra.length() < 2 && !palabra.equals(""))
				toast = Toast.makeText(this, "Palabra tiene que tener más de un caracter", Toast.LENGTH_LONG);
			else
				toast = Toast.makeText(this, "No haz llenado los campos", Toast.LENGTH_LONG);
	        toast.show(); 
		}
			
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		soundespera.stop();
		
		return super.onKeyDown(keyCode, event);
	}
	
	public boolean esPalabraCaracteres(String palabra)
    { 
        for(int i = 0; i < palabra.length(); i++)
        { 
            if(!((palabra.charAt(i) > 64 && palabra.charAt(i) < 91) || 
                (palabra.charAt(i) > 96 && palabra.charAt(i) < 123))) 
        return false; 
        }   
        return true;
    } 
	

}
